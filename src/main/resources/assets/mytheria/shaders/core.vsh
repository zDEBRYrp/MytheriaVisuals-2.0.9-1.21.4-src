#version 330 core

layout(location = 0) in vec2 inPosition;
layout(location = 1) in vec2 inMeshPosition;
layout(location = 2) in vec2 inMeshSize;
layout(location = 3) in vec2 inTexCoord;
layout(location = 4) in vec4 inRadius;
layout(location = 5) in vec4 inColor;
layout(location = 6) in vec4 inOutlineColor;
layout(location = 7) in float inThickness;
layout(location = 8) in float inSoftness;
layout(location = 9) in int inTexIndex;
layout(location = 10) in int inDrawMode;
layout(location = 11) in int inMaskIndex;

out vec2 meshPosition;
out vec2 meshSize;
out vec2 texCoord;
out vec4 radius;
out vec4 color;
out vec4 outlineColor;
out float thickness;
out float softness;

flat out int texIndex;
flat out int drawMode;
flat out int maskIndex;

uniform mat4 orthographicMatrix;

void main() {
    gl_Position = orthographicMatrix * vec4(inPosition, vec2(1.0));

    meshPosition = inMeshPosition;
    meshSize = inMeshSize;
    texCoord = inTexCoord;
    radius = inRadius;
    color = inColor;
    outlineColor = inOutlineColor;
    thickness = inThickness;
    softness = inSoftness;

    texIndex = inTexIndex;
    drawMode = inDrawMode;
    maskIndex = inMaskIndex;
}