#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform float time;
uniform vec2 resolution;
uniform vec3 smokeColor;
uniform float smokeIntensity;

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

    // Calculate smoke effect
    vec2 smokeUv = (2.0 * uv - 1.0) * resolution.y / min(resolution.x, resolution.y);

    for(float i = 1.0; i < 10.0; i++){
        smokeUv.x += 0.6 / i * cos(i * 2.5 * smokeUv.y + time);
        smokeUv.y += 0.6 / i * cos(i * 1.5 * smokeUv.x + time);
    }

    // Create smoke pattern
    float smokePattern = 0.1 / abs(sin(time - smokeUv.y - smokeUv.x));
    vec3 col = smokeColor * smokePattern * smokeIntensity;

    vec4 effectColor = vec4(col, 1.0);

    // Mix original color with smoke effect
    vec4 finalHandColor = mix(originalColor, effectColor, 0.85);

    outColor = vec4(finalHandColor.rgb, mask);
}
