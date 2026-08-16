#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform float time;
uniform vec2 resolution;

// Glow settings
uniform bool fillGlow;
uniform float glowRadius;
uniform float glowPower;
uniform float glowDispersion;
uniform vec3 glowColor;

void main() {
    vec4 originalColor = texture(ColorTexture, uv);
    vec2 texelSize = 1.0 / textureSize(DepthTexture, 0);

    // Depth-based masking (detect hands)
    float minDepth = 1.0;
    float centerDepth = texture(DepthTexture, uv).r;

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

    // Calculate edge detection for glow with adjustable dispersion
    float edgeStrength = 0.0;
    float outwardGlow = 0.0;

    int disperseRadius = int(glowDispersion);

    // Check surrounding pixels for depth discontinuity and outward glow
    for (int y = -disperseRadius; y <= disperseRadius; y++) {
        for (int x = -disperseRadius; x <= disperseRadius; x++) {
            if (x == 0 && y == 0) continue;

            vec2 offset = vec2(x, y) * texelSize;
            float neighborDepth = texture(DepthTexture, uv + offset).r;

            float dist = length(vec2(x, y));

            // If neighbor is background (depth ~1.0) and we're foreground, it's an edge
            if (neighborDepth > 0.99 && centerDepth < 0.99) {
                edgeStrength += (1.0 / (dist + 0.1));
            }

            // Calculate outward glow: if current pixel is background but nearby is hand
            if (centerDepth > 0.99 && neighborDepth < 0.99) {
                float falloff = 1.0 - (dist / float(disperseRadius));
                falloff = pow(falloff, 2.5);
                outwardGlow += falloff * 0.2;
            }
        }
    }

    // Normalize edge strength
    edgeStrength = clamp(edgeStrength * 0.15, 0.0, 1.0);
    outwardGlow = clamp(outwardGlow, 0.0, 1.0);

    // Create animated glow effect with brighter pulse
    float pulse = 0.9 + sin(time * 2.0) * 0.1;

    vec3 finalColor;

    // Apply outward glow effect (for background pixels near hands)
    if (centerDepth > 0.99 && outwardGlow > 0.01) {
        // We're in background but near a hand - render glow
        vec3 dispersedGlow = glowColor * outwardGlow * glowPower * pulse * glowRadius * 10.0;
        outColor = vec4(dispersedGlow, outwardGlow * 0.8);
        return;
    }

    // For hand pixels
    if (fillGlow) {
        // Fill mode: apply glow color to entire hand with edge enhancement
        vec3 handGlow = glowColor * (glowRadius * 10.0); // glowRadius controls intensity
        vec3 edgeGlow = glowColor * edgeStrength * glowPower * pulse * 2.5;

        finalColor = mix(originalColor.rgb, handGlow + edgeGlow, 0.75);
    } else {
        // Outline mode: only glow on edges
        vec3 edgeGlow = glowColor * edgeStrength * glowPower * pulse * glowRadius * 25.0; // glowRadius controls intensity

        finalColor = originalColor.rgb + edgeGlow;
    }

    outColor = vec4(finalColor, mask);
}
