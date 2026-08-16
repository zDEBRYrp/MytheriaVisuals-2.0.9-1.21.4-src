#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform float time;
uniform vec2 resolution;

// Glass settings
uniform float blurSize;
uniform float quality;
uniform float direction;
uniform float refraction;
uniform float brightness;
uniform bool enableChromatic;
uniform bool enableDistortion;
uniform bool hideHand;

// Background effect settings (when hand is hidden)
uniform float backgroundBlur;

#define PI 3.14159265

// Liquid glass blur effect
vec4 liquidGlassBlur(sampler2D tex, vec2 uv, float dir, float qual, float size) {
    vec2 radius = (size / resolution.y) / resolution;
    vec4 color = texture(tex, uv);
    float total = 1.0;

    for (float d = 0.0; d < PI; d += PI / dir) {
        for (float i = 1.0 / qual; i <= 1.0; i += 1.0 / qual) {
            vec2 offset = vec2(cos(d), sin(d)) * radius * i;
            color += texture(tex, uv + offset);
            total += 1.0;
        }
    }

    return color / total;
}

// Matte blur effect (like HUD elements)
vec4 matteBlur(sampler2D tex, vec2 uv, float blurRadius) {
    const float TAU = 6.28318530718;
    vec2 radius = blurRadius / resolution.xy;
    vec4 blur = texture(tex, uv);

    float step = TAU / 16.0;  // 16 directions

    for (float d = 0.0; d < TAU; d += step) {
        for (float i = 0.2; i <= 1.0; i += 0.2) {  // 5 samples per direction
            blur += texture(tex, uv + vec2(cos(d), sin(d)) * radius * i);
        }
    }

    blur /= 81.0;  // 16 directions * 5 samples + 1 center = 81
    return blur;
}

// Distortion pattern for glass effect
vec2 glassDistortion(vec2 uv, float time, float strength) {
    // Animated Mytheria distortion
    float Mytheria1 = sin(uv.y * 10.0 + time * 2.0) * 0.01 * strength;
    float Mytheria2 = cos(uv.x * 8.0 - time * 1.5) * 0.01 * strength;

    // Radial distortion from center
    vec2 center = vec2(0.5, 0.5);
    vec2 toCenter = uv - center;
    float dist = length(toCenter);
    vec2 radial = toCenter * sin(dist * 15.0 - time * 3.0) * 0.005 * strength;

    return vec2(Mytheria1 + radial.x, Mytheria2 + radial.y);
}

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

    // Apply glass distortion (if enabled)
    vec2 distortedUV = uv;
    if (enableDistortion) {
        distortedUV += glassDistortion(uv, time, refraction);
    }

    // Sample the hand texture with distortion applied
    // Note: If hideHand is enabled, hand is not drawn to color buffer (only depth)
    // via colorMask(false,false,false,false) in GameRendererMixin
    vec4 handColor = texture(ColorTexture, distortedUV);

    // Create glass effect
    vec3 glassColor;

    if (centerDepth < 0.99) {
        // This is hand area
        if (hideHand) {
            // Hand is hidden - apply background effects
            vec2 bgUV = uv;

            // Apply background blur (use matte blur for frosted glass effect)
            if (backgroundBlur > 0.1) {
                glassColor = matteBlur(ColorTexture, bgUV, backgroundBlur).rgb;
            } else {
                glassColor = texture(ColorTexture, bgUV).rgb;
            }

            // Apply brightness
            glassColor *= brightness;

        } else {
            // Hand is visible - apply glass effect to hand texture
            glassColor = liquidGlassBlur(ColorTexture, distortedUV, direction, quality, blurSize).rgb;

            // Add chromatic aberration for glass effect (if enabled)
            if (enableChromatic) {
                float aberration = 0.003 * refraction;
                float r = liquidGlassBlur(ColorTexture, distortedUV + vec2(aberration, 0.0), direction, quality, blurSize * 0.5).r;
                float b = liquidGlassBlur(ColorTexture, distortedUV - vec2(aberration, 0.0), direction, quality, blurSize * 0.5).b;
                glassColor.r = r;
                glassColor.b = b;
            }

            // Apply brightness to glass effect
            glassColor *= brightness;
        }
    } else {
        // Not hand area - just use original
        glassColor = handColor.rgb;
    }

    // Add edge highlights for glass-like appearance
    float edgeStrength = 0.0;
    for (int y = -1; y <= 1; y++) {
        for (int x = -1; x <= 1; x++) {
            if (x == 0 && y == 0) continue;
            vec2 offset = vec2(x, y) * texelSize;
            float neighborDepth = texture(DepthTexture, uv + offset).r;

            // Edge detection
            if (neighborDepth > 0.99 && centerDepth < 0.99) {
                float dist = length(vec2(x, y));
                edgeStrength += (1.0 / (dist + 0.1));
            }
        }
    }
    edgeStrength = clamp(edgeStrength * 0.1, 0.0, 1.0);

    // Add edge highlights
    vec3 highlight = vec3(1.0) * edgeStrength * 0.3;
    glassColor += highlight;

    // Subtle reflection effect
    float reflection = sin(time * 2.0 + uv.x * 20.0) * 0.5 + 0.5;
    reflection *= sin(time * 1.5 + uv.y * 15.0) * 0.5 + 0.5;
    glassColor += vec3(reflection * 0.1);

    // Mix distorted hand texture with glass effect
    vec3 finalColor = mix(handColor.rgb, glassColor, 0.7);

    outColor = vec4(finalColor, mask);
}
