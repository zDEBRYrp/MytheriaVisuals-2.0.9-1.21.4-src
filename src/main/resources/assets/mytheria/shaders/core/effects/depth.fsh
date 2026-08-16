#version 330 core

in vec2 uv;
out vec4 color;

uniform sampler2D Tex0;
uniform sampler2D Tex1;
uniform float Near;
uniform float Far;
uniform float MinThreshold;
uniform float MaxThreshold;

float linearizeDepth(float depth, float near, float far) {
    return (2.0 * near * far) / (far + near - depth * (far - near));
}

void main() {
    float depth = texture(Tex1, uv).x;
    float distance = linearizeDepth(depth, Near, Far) / Far;

    color = vec4(0.0);
    
    // Исключаем очень близкие объекты (руки) - они имеют distance < 0.01
    if (distance > 0.01 && distance > MinThreshold) {
        vec3 blurredColor = texture(Tex0, uv).rgb;
        float alpha = clamp((distance - MinThreshold) / (MaxThreshold - MinThreshold), 0.0, 1.0);
        color = vec4(blurredColor, alpha);
    }
}
