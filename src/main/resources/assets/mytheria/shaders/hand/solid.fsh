#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform float time;
uniform vec3 customColor1;
uniform vec3 customColor2;

uniform float effectAlpha;

vec3 createVerticalGradient(vec2 coord, vec3 color1, vec3 color2, float t) {
    float factor = coord.y + t;

    factor = sin(factor * 3.14159 * 2.0) * 0.5 + 0.5;

    return mix(color1, color2, factor);
}

void main() {
    vec4 originalColor = texture(ColorTexture, uv);
    vec2 texelSize = 1.0 / textureSize(DepthTexture, 0);

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

    vec3 gradientColor = createVerticalGradient(uv, customColor1, customColor2, time);

    float brightness = 0.85 + sin(time * 6.28318) * 0.15;
    gradientColor *= brightness;

    vec4 effectColor = vec4(gradientColor, 1.0);

    vec4 finalHandColor = mix(originalColor, effectColor, effectAlpha);

    outColor = vec4(finalHandColor.rgb, mask);
}
