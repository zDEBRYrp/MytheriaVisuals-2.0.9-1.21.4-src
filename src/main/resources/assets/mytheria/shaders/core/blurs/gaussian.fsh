#version 330 core

in vec2 uv;
out vec4 color;

uniform sampler2D Tex0;
uniform vec2 Direction;
uniform vec2 TexelSize;
uniform bool Alpha;

uniform vec3 Gaussian;
uniform int Support;
uniform bool LinearSampling;

void main() {
    vec3 gaussian = Gaussian;
    color = texture(Tex0, uv) * gaussian.x;
    float sum = gaussian.x;

    if (LinearSampling) {
        for (int i = 1; i <= Support; i += 2) {
            gaussian.xy *= gaussian.yz;
            float w1 = gaussian.x;
            gaussian.xy *= gaussian.yz;
            float w2 = gaussian.x;
            float w = w1 + w2;
            vec2 offset = TexelSize * Direction * ((i * w1 + (i + 1.0) * w2) / w);
            color += texture(Tex0, uv + offset) * w;
            color += texture(Tex0, uv - offset) * w;
            sum += w * 2.0;
        }
    } else {
        for (int i = 1; i <= Support; i++) {
            gaussian.xy *= gaussian.yz;
            vec2 offset = TexelSize * Direction * i;
            color += texture(Tex0, uv + offset) * gaussian.x;
            color += texture(Tex0, uv - offset) * gaussian.x;
            sum += gaussian.x * 2.0;
        }
    }

    color /= sum;
    if (!Alpha) {
        color.a = 1.0;
    }
}
