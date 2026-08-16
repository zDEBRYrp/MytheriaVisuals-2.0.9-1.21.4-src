#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform vec2 iResolution;
uniform float BlurSize;
uniform float Quality;
uniform float Direction;
uniform float nearPlane;
uniform float farPlane;

#define PI 3.14159265
#define S smoothstep
#define R iResolution

vec4 LiquidGlass(sampler2D tex, vec2 uvi, float dir, float qual, float size) {
    vec2 radius = size / R;
    vec4 color = texture(tex, uvi);
    float total = 1.0;

    for (float d = 0.0; d < PI; d += PI / dir) {
        for (float i = 1.0 / qual; i <= 1.0; i += 1.0 / qual) {
            vec2 off = vec2(cos(d), sin(d)) * radius * i;
            color += texture(tex, uvi + off);
            total += 1.0;
        }
    }

    return color / total;
}

void main() {
    vec4 originalColor = texture(ColorTexture, uv);
    vec2 texelSize = 1.0 / textureSize(DepthTexture, 0);

    float minDepth = 1.0;
    for (int y = -1; y <= 1; y++) {
        for (int x = -1; x <= 1; x++) {
            vec2 offset = vec2(float(x), float(y)) * texelSize;
            float nd = texture(DepthTexture, uv + offset).r;
            minDepth = min(minDepth, nd);
        }
    }

    float mask = smoothstep(0.99, 0.98, minDepth);

    if (mask < 0.01) {
        discard;
    }

    float selfDepth = texture(DepthTexture, uv).r;
    float edgeStrength = 0.0;
    int count = 0;
    for (int y = -2; y <= 2; y++) {
        for (int x = -2; x <= 2; x++) {
            if (x == 0 && y == 0) continue;
            vec2 offset = vec2(float(x), float(y)) * texelSize;
            float nd = texture(DepthTexture, uv + offset).r;
            float diff = abs(selfDepth - nd);
            edgeStrength += S(0.1, 0.0, diff);
            count++;
        }
    }
    edgeStrength /= float(count);
    float disp = edgeStrength;

    vec2 localCenter = vec2(0.0);
    float totalWeight = 0.0;
    for (int y = -2; y <= 2; y++) {
        for (int x = -2; x <= 2; x++) {
            vec2 offset = vec2(float(x), float(y)) * texelSize;
            float nd = texture(DepthTexture, uv + offset).r;
            float w = S(0.1, 0.0, abs(selfDepth - nd));
            localCenter += (uv + offset) * w;
            totalWeight += w;
        }
    }
    if (totalWeight > 0.0) {
        localCenter /= totalWeight;
    } else {
        localCenter = uv;
    }

    vec2 uv2 = uv - localCenter;
    float multiplier = 0.5 + 0.5 * S(0.5, 1.0, disp);
    uv2 *= multiplier;
    uv2 += localCenter;

    vec3 col = LiquidGlass(ColorTexture, uv2, Direction, Quality, BlurSize).rgb;

    col += disp * 0.15;

    vec4 effectColor = vec4(col, 1.0);

    float effectAlpha = 1.0;
    vec4 finalHandColor = mix(originalColor, effectColor, effectAlpha);

    outColor = vec4(finalHandColor.rgb, mask);
}
