#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform float time;
uniform vec3 customColor1;
uniform vec3 customColor2;
uniform float effectAlpha;

float hash(vec2 p) {
    return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);
}

float smootherstep(float edge0, float edge1, float x) {
    x = clamp((x - edge0) / (edge1 - edge0), 0.0, 1.0);
    return x * x * x * (x * (x * 6.0 - 15.0) + 10.0);
}

void main() {
    float depth = texture(DepthTexture, uv).r;
    if (depth >= 1.0) {
        discard;
    }

    vec2 uvCoord = uv * 2.0 - 1.0;
    float t = time;
    
    vec3 color = vec3(0.0, 0.0, 0.02);
    
    // Simple star field
    vec2 gridUV = uvCoord * 8.0;
    vec2 gridID = floor(gridUV);
    vec2 gridLocal = fract(gridUV) - 0.5;
    
    float random = hash(gridID);
    if (random > 0.6) {
        vec2 starPos = vec2(hash(gridID + vec2(1.0, 0.0)) - 0.5, hash(gridID + vec2(0.0, 1.0)) - 0.5) * 0.6;
        float dist = length(gridLocal - starPos);
        float twinkle = sin(t * 2.0 + random * 6.28318) * 0.3 + 0.7;
        float starValue = exp(-dist * dist * 400.0) * twinkle;
        color += mix(vec3(1.0), customColor1, 0.3) * starValue;
    }
    
    // Ambient glow
    float glow = exp(-length(uvCoord) * 0.8) * 0.08;
    float pulse = sin(t * 0.5) * 0.3 + 0.7;
    color += customColor1 * glow * pulse;
    
    // Vignette
    float vignette = 1.0 - smoothstep(0.5, 2.0, length(uvCoord));
    color *= vignette;
    
    color = clamp(color, 0.0, 2.0);
    float finalAlpha = effectAlpha * (0.35 + length(color) * 0.25);
    
    outColor = vec4(color, finalAlpha);
}
