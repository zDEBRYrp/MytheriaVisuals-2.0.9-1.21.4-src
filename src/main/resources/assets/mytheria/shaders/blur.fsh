#version 330 core

out vec4 fragColor;

in vec2 texCoord;

uniform sampler2D uTexture;

uniform vec2 uDirection;

uniform float uBrightness;
uniform int uPairCount;
uniform float uKernel[64];
uniform float uOffsets[64];

void main()
{

    vec4 result = texture(uTexture, texCoord) * uKernel[0];

    for (int i = 0; i < uPairCount; i++) {
        vec2 offset = uDirection * uOffsets[i];
        vec4 samplePair = texture(uTexture, texCoord + offset) + texture(uTexture, texCoord - offset);
        result += samplePair * uKernel[i + 1];
    }

    fragColor = vec4(result.rgb, result.a * uBrightness);
}