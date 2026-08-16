#version 330 core

in vec2 uv;
out vec4 color;

uniform sampler2D Tex0;
uniform sampler2D DepthTex;
uniform bool Alpha;
uniform bool UseDepthMask;
uniform float Near;
uniform float Far;

float linearizeDepth(float depth) {
    float z = depth * 2.0 - 1.0;
    return (2.0 * Near * Far) / (Far + Near - z * (Far - Near));
}

void main() {
    vec4 blurredColor = texture(Tex0, uv);
    
    if (UseDepthMask) {
        float depth = texture(DepthTex, uv).r;
        float linearDepth = linearizeDepth(depth);
        float normalizedDepth = linearDepth / Far;
        
        // Если объект очень близко (руки), не применяем размытие
        // Руки обычно на расстоянии < 0.01 от камеры
        if (normalizedDepth < 0.015) {
            discard; // Не рисуем ничего - оставляем оригинал
        }
    }
    
    color = blurredColor;
    if (!Alpha && color.a > 0.0) {
        color.a = 1.0;
    }
}
