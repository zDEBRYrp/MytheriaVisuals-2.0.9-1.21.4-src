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
    
    vec3 color = vec3(0.0);
    
    // Simple firework burst
    float cycleDuration = 3.0;
    float burstTime = mod(t, cycleDuration);
    float progress = burstTime / 2.0;
    
    if (progress < 1.0) {
        float fadeIn = smootherstep(0.0, 0.1, progress);
        float fadeOut = smootherstep(1.0, 0.6, progress);
        float fade = fadeIn * fadeOut;
        
        float dist = length(uvCoord);
        float angle = atan(uvCoord.y, uvCoord.x);
        
        // Radial particles
        float particleDist = progress * 0.3;
        float particleDistToPoint = abs(dist - particleDist);
        float particle = exp(-particleDistToPoint * particleDistToPoint * 200.0) * fade;
        
        color += customColor1 * particle * 2.0;
        
        // Core
        float core = exp(-dist * dist * 100.0) * fadeIn * smootherstep(1.0, 0.0, progress);
        color += vec3(1.0) * core * 3.0;
    }
    
    // Pulsing wave
    float wave = mod(t * 0.5, 3.0);
    float ring = abs(length(uvCoord) - wave * 0.5);
    float intensity = exp(-ring * 15.0) * smootherstep(3.0, 0.0, wave);
    color += customColor1 * intensity * 0.15;
    
    // Global glow
    float globalPulse = sin(t * 0.8) * 0.5 + 0.5;
    float glow = exp(-length(uvCoord) * 0.6) * 0.15 * globalPulse;
    color += customColor1 * glow;
    
    // Vignette
    float vignette = 1.0 - length(uvCoord * 0.5);
    vignette = smootherstep(0.2, 1.0, vignette);
    color *= vignette;
    
    color = clamp(color, 0.0, 2.0);
    float finalAlpha = effectAlpha * (0.35 + length(color) * 0.2);
    
    outColor = vec4(color, finalAlpha);
}
