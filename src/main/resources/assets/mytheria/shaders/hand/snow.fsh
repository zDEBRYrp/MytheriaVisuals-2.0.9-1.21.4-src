#version 330 core

in vec2 uv;
out vec4 outColor;

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform float time;
uniform vec2 resolution;
uniform vec3 snowColor;
uniform float snowIntensity;
uniform float snowSpeed;

#define pi 3.14159265359

// Snow parameters
const int nbFlakes = 500;
const vec3 flakedomain = vec3(2.5, 3.0, 2.5);
const float flakeMinSpeed = 0.8;
const float flakeMaxSpeed = 2.0;
const float flakeMinSinVariation = 0.015;
const float flakeMaxSinVariation = 0.035;
const float flakeMinFreq = 3.0;
const float flakeMaxFreq = 8.0;
const vec2 flakeWindFact = vec2(0.25, 0.05);

// Star parameters
const float starNbBranches = 6.0;
const float starPow = 1.5;
const float starStrength = 1.0;

vec2 rotateVec(vec2 vect, float angle) {
    vec2 rv;
    rv.x = vect.x * cos(angle) - vect.y * sin(angle);
    rv.y = vect.x * sin(angle) + vect.y * cos(angle);
    return rv;
}

// 1D hash function
float hash(float n) {
    return fract(sin(n) * 753.5453123);
}

float rand(float minVal, float maxVal, float seed) {
    return minVal + (maxVal - minVal) * hash(seed);
}

vec3 getFlakePosition(int flakeNr, float t) {
    float fn = float(flakeNr);
    float s = rand(flakeMinSpeed, flakeMaxSpeed, fn * 348.0 + 173.0) * snowSpeed;
    float posY = mod(-(t + 15.0 * hash(fn * 1613.0 + 1354.0)) * s, flakedomain.y * 2.0) - flakedomain.y;
    float posX = rand(-flakedomain.x, flakedomain.x, fn * 743.0 + 514.0) + posY * flakeWindFact.x;
    float posZ = rand(-flakedomain.z, flakedomain.z, fn * 284.0 + 483.0) + posY * flakeWindFact.y;

    // Sin movement
    float sinvar = rand(flakeMinSinVariation, flakeMaxSinVariation, fn * 842.0 + 951.0);
    float sinfreq = rand(flakeMinFreq, flakeMaxFreq, fn * 348.0 + 173.0);
    float dd = hash(fn * 235.0 + 934.0);
    posX += sinvar * sin(t * sinfreq) * dd;
    posZ += sinvar * sin(t * sinfreq) * sqrt(1.0 - dd * dd);

    return vec3(posX, posY, posZ);
}

float nppow(float x, float p) {
    return sign(x) * pow(abs(x), p);
}

float getSnowProfile(float val, float dist, vec3 fpos, vec3 ray, vec3 campos, int flakeNr) {
    float val2 = -log(1.0 - val);

    // Star flakes - 3D to 2D projection for star shape
    if (dist < 1.5) {
        vec3 v3 = (fpos - campos) - dot((fpos - campos), ray) * ray;
        vec3 vx = vec3(1.0, 0.0, 0.0);
        vx.xy = rotateVec(vx.xy, 2.0 * float(flakeNr) * 152.5 + time * 0.4);
        vx = normalize(vx - dot(vx, ray) * ray);
        vec3 vy = vec3(ray.y * vx.z - ray.z * vx.y, ray.z * vx.x - ray.x * vx.z, ray.x * vx.y - ray.y * vx.x);

        float a = atan(dot(v3, vx), dot(v3, vy));

        float spp = 1.0 + starStrength * nppow(sin(a * starNbBranches), starPow);
        val2 += 1.3 * spp * pow(smoothstep(1.6, 0.1, dist), 2.0);
    }

    float delta = 1.5 - 0.9 / pow(dist + 1.0, 0.3);
    float midpoint = 10.0 / pow(dist + 0.1, 0.3);
    float pr = smoothstep(midpoint - delta * 0.5, midpoint + delta * 0.5, val2);

    float d = 1.0 - pow(abs(1.0 - 2.0 * pr), 2.0);
    float f = 1.3 / pow(dist + 0.8, 2.5);

    // Diffraction effect
    if (val2 < 8.0) {
        pr += 32.0 * pow(f, 1.5) * max(0.0, dist - 2.0) * d * (0.5 + sin(val2 * 230.0 / (3.8 + dist) - midpoint * 90.0) * 0.5);
    }

    return pr * f;
}

vec3 getFlakes(vec3 ray, vec3 campos) {
    vec3 rc1 = vec3(0.0);
    vec3 rc2 = vec3(0.0);
    vec3 fpos;
    float lp;

    for (int l = 0; l < nbFlakes; l++) {
        fpos = getFlakePosition(l, time);

        float val = max(0.0, dot(ray, normalize(fpos - campos)));
        if (val > 0.996) {
            vec3 camtarget = vec3(0.0, 0.0, 0.0);
            float dist1 = distance(camtarget, fpos);
            float dist2 = distance(campos, fpos);
            float dist = max(5.2 * pow(dist1 / dist2, 1.7), 0.32);
            lp = getSnowProfile(val, dist, fpos, ray, campos, l);

            // Fog
            const float fogdens = 0.08;
            lp *= clamp(exp(-pow(fogdens * dist2, 2.0)), 0.0, 1.0);

            // Flakes appear progressively
            lp *= smoothstep(-flakedomain.y, -flakedomain.y * 0.75, fpos.y);
            lp *= smoothstep(flakedomain.y, flakedomain.y * 0.75, fpos.y);

            rc1 += clamp(normalize(mix(snowColor, vec3(1.0), 0.55 * lp)) * lp, 0.0, 1.0);
            rc2 = max(rc2, clamp(normalize(mix(snowColor, vec3(1.0), 0.55 * lp)) * lp, 0.0, 1.0));
        }
    }
    return mix(rc1, rc2, 0.7);
}

vec3 getCameraRayDir(vec2 vWindow) {
    float fov = 3.8;
    vec3 vForward = normalize(vec3(0.0, 0.0, -1.0));
    vec3 vRight = normalize(cross(vec3(0.0, 1.0, 0.0), vForward));
    vec3 vUp = normalize(cross(vForward, vRight));

    return normalize(vWindow.x * vRight + vWindow.y * vUp + vForward * fov);
}

void main() {
    vec4 originalColor = texture(ColorTexture, uv);
    vec2 texelSize = 1.0 / textureSize(DepthTexture, 0);

    // Depth-based masking (detect hands)
    float minDepth = 1.0;

    for (int y = -1; y <= 1; y++) {
        for (int x = -1; x <= 1; x++) {
            vec2 offset = vec2(x, y) * texelSize;
            float neighborDepth = texture(DepthTexture, uv + offset).r;
            minDepth = min(minDepth, neighborDepth);
        }
    }

    float mask = smoothstep(0.99, 0.98, minDepth);

    if (mask < 0.01) {
        discard;
    }

    // Setup camera and ray
    vec2 screenUv = uv * 2.0 - 1.0;
    screenUv.x *= resolution.x / resolution.y;
    vec3 ray = getCameraRayDir(screenUv);
    vec3 campos = vec3(0.0, 0.0, 3.5);

    // Get snow flakes
    vec3 flakes = getFlakes(ray, campos);
    flakes *= snowIntensity * 1.8;

    // Mix with original color
    vec3 finalColor = originalColor.rgb + flakes;

    outColor = vec4(finalColor, mask);
}
