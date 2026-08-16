#version 330 core

layout(location = 0) in vec3 Position;

out vec2 uv;

void main() {
    gl_Position = vec4(Position, 1.0);
    uv = (Position.xy + 1.0) / 2.0;
}
