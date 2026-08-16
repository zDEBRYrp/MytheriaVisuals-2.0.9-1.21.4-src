#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform float time;
uniform float chromaSpeed;
uniform float chromaSaturation;
uniform float chromaBrightness;

// HSV to RGB conversion
vec3 hsv2rgb(vec3 c) {
    vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);
    vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);
    return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);
}

// Create rainbow effect
vec3 createChromaEffect(vec2 coord, float t) {
    // Combine vertical and horizontal gradients for more dynamic effect
    float hue = fract(coord.y * 0.5 + coord.x * 0.3 + t * chromaSpeed);

    // Add Mytheria pattern for more visual interest
    float Mytheria = sin(coord.y * 10.0 + t * 3.0) * 0.05;
    hue += Mytheria;

    // Convert HSV to RGB
    vec3 chromaColor = hsv2rgb(vec3(hue, chromaSaturation, chromaBrightness));

    return chromaColor;
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

    // Create chroma effect
    vec3 chromaColor = createChromaEffect(uv, time);

    // Add slight pulsing to make it more alive
    float pulse = 0.9 + sin(time * 4.0) * 0.1;
    chromaColor *= pulse;

    vec4 effectColor = vec4(chromaColor, 1.0);

    // Mix original color with chroma effect
    vec4 finalHandColor = mix(originalColor, effectColor, 0.85);

    outColor = vec4(finalHandColor.rgb, mask);
}
