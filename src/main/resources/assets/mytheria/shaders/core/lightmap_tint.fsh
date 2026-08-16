#version 150

uniform sampler2D Lightmap;
uniform vec3 colorTint;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec4 light = texture(Lightmap, texCoord);
    fragColor = vec4(light.rgb * colorTint, light.a);
}
