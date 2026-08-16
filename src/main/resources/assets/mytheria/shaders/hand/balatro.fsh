#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform float time;
uniform vec2 resolution;
uniform vec3 color1; // Main Color
uniform vec3 color2; // Color 2
uniform vec3 color3; // Color 3
uniform vec3 color4; // contrast/lighting params

// Balatro-style effect configuration
#define SPIN_ROTATION -2.0
#define SPIN_SPEED 7.0
#define OFFSET vec2(0.0)
#define SPIN_AMOUNT 0.25
#define PIXEL_FILTER 745.0
#define SPIN_EASE 1.0
#define PI 3.14159265359
#define IS_ROTATE false

vec4 effect(vec2 screenSize, vec2 screen_coords, float contrast, float lighting) {
    float pixel_size = length(screenSize.xy) / PIXEL_FILTER;
    vec2 effectUv = (floor(screen_coords.xy*(1./pixel_size))*pixel_size - 0.5*screenSize.xy)/length(screenSize.xy) - OFFSET;
    float uv_len = length(effectUv);

    float speed = (SPIN_ROTATION*SPIN_EASE*0.2);
    if(IS_ROTATE){
       speed = time * speed;
    }
    speed += 302.2;
    float new_pixel_angle = atan(effectUv.y, effectUv.x) + speed - SPIN_EASE*20.*(1.*SPIN_AMOUNT*uv_len + (1. - 1.*SPIN_AMOUNT));
    vec2 mid = (screenSize.xy/length(screenSize.xy))/2.;
    effectUv = (vec2((uv_len * cos(new_pixel_angle) + mid.x), (uv_len * sin(new_pixel_angle) + mid.y)) - mid);

    effectUv *= 30.;
    speed = time*(SPIN_SPEED);
    vec2 uv2 = vec2(effectUv.x+effectUv.y);

    for(int i=0; i < 5; i++) {
        uv2 += sin(max(effectUv.x, effectUv.y)) + effectUv;
        effectUv  += 0.5*vec2(cos(5.1123314 + 0.353*uv2.y + speed*0.131121),sin(uv2.x - 0.113*speed));
        effectUv  -= 1.0*cos(effectUv.x + effectUv.y) - 1.0*sin(effectUv.x*0.711 - effectUv.y);
    }

    float contrast_mod = (0.25*contrast + 0.5*SPIN_AMOUNT + 1.2);
    float paint_res = min(2., max(0.,length(effectUv)*(0.035)*contrast_mod));
    float c1p = max(0.,1. - contrast_mod*abs(1.-paint_res));
    float c2p = max(0.,1. - contrast_mod*abs(paint_res));
    float c3p = 1. - min(1., c1p + c2p);
    float light = (lighting - 0.2)*max(c1p*5. - 4., 0.) + lighting*max(c2p*5. - 4., 0.);

    vec4 colour1 = vec4(color1, 1.0);
    vec4 colour2 = vec4(color2, 1.0);
    vec4 colour3 = vec4(color3, 1.0);

    return (0.3/contrast)*colour1 + (1. - 0.3/contrast)*(colour1*c1p + colour2*c2p + vec4(c3p*colour3.rgb, c3p*colour1.a)) + light;
}

void main() {
    vec4 originalColor = texture(ColorTexture, uv);
    vec2 texelSize = 1.0 / textureSize(DepthTexture, 0);

    // Depth-based masking
    float minDepth = 1.0;

    for (int y = -1; y <= 1; y++) {
        for (int x = -1; x <= 1; x++) {
            vec2 offset = vec2(x, y) * texelSize;
            float neighborDepth = texture(DepthTexture, uv + offset).r;
            minDepth = min(minDepth, neighborDepth);
        }
    }

    float mask = smoothstep(0.99, 0.98, minDepth);

    if (mask < 0.01) {
        discard;
    }

    // Extract contrast and lighting from color4
    float contrast = color4.r * 10.0; // map 0-1 to 0-10
    float lighting = color4.g; // 0-1

    // Apply Balatro-style effect
    vec4 effectColor = effect(resolution, uv * resolution, contrast, lighting);

    // Mix original color with effect
    vec4 finalHandColor = mix(originalColor, effectColor, 0.85);

    outColor = vec4(finalHandColor.rgb, mask);
}
