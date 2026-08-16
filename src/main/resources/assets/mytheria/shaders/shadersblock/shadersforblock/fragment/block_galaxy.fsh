#version 150

in vec2 texCoord;
out vec4 fragColor;

uniform float time;
uniform vec2 screenSize;
uniform vec4 baseColor;
uniform float alpha;
uniform float zoomFactor;

// Хеш функции
float hash(vec2 p) {
    return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);
}

float hash13(vec3 p3) {
    p3 = fract(p3 * 0.1031);
    p3 += dot(p3, p3.zyx + 31.32);
    return fract((p3.x + p3.y) * p3.z);
}

// Плавная интерполяция
float smootherstep(float edge0, float edge1, float x) {
    x = clamp((x - edge0) / (edge1 - edge0), 0.0, 1.0);
    return x * x * x * (x * (x * 6.0 - 15.0) + 10.0);
}

// 2D шум
float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    f = f * f * (3.0 - 2.0 * f);
    
    float a = hash(i);
    float b = hash(i + vec2(1.0, 0.0));
    float c = hash(i + vec2(0.0, 1.0));
    float d = hash(i + vec2(1.0, 1.0));
    
    return mix(mix(a, b, f.x), mix(c, d, f.x), f.y);
}

// Fractal Brownian Motion для облаков
float fbm(vec2 p, float t) {
    float value = 0.0;
    float amplitude = 0.5;
    float frequency = 1.0;
    
    for (int i = 0; i < 5; i++) {
        value += amplitude * noise(p * frequency + t * 0.1);
        frequency *= 2.0;
        amplitude *= 0.5;
    }
    
    return value;
}

// Спиральная галактика
float galaxy(vec2 uv, float t) {
    float dist = length(uv);
    float angle = atan(uv.y, uv.x);
    
    // Спиральные рукава
    float spiral = sin(angle * 3.0 - dist * 8.0 + t * 0.5) * 0.5 + 0.5;
    
    // Плотность уменьшается от центра
    float density = exp(-dist * 2.0);
    
    // Добавляем турбулентность
    float turbulence = fbm(uv * 3.0, t);
    
    return spiral * density * turbulence;
}

// Звёзды в галактике
vec3 galaxyStars(vec2 uv, float t) {
    vec3 color = vec3(0.0);
    
    // Вращение галактики
    float rotation = t * 0.1;
    float c = cos(rotation);
    float s = sin(rotation);
    mat2 rot = mat2(c, -s, s, c);
    uv = rot * uv;
    
    float density = 15.0;
    vec2 gridUV = uv * density;
    vec2 gridID = floor(gridUV);
    vec2 gridLocal = fract(gridUV) - 0.5;
    
    for (float y = -1.0; y <= 1.0; y++) {
        for (float x = -1.0; x <= 1.0; x++) {
            vec2 neighbor = vec2(x, y);
            vec2 cellID = gridID + neighbor;
            
            float random = hash13(vec3(cellID, 1.0));
            if (random < 0.5) continue;
            
            vec2 starPos = neighbor + vec2(
                hash(cellID + vec2(1.0, 0.0)) - 0.5,
                hash(cellID + vec2(0.0, 1.0)) - 0.5
            ) * 0.8;
            
            float dist = length(gridLocal - starPos);
            float size = 0.015 + hash(cellID + vec2(2.0, 3.0)) * 0.02;
            
            // Мерцание
            float twinkle = sin(t * 3.0 + random * 6.28318) * 0.5 + 0.5;
            twinkle = smootherstep(0.0, 1.0, twinkle) * 0.4 + 0.6;
            
            float star = exp(-dist * dist / (size * size)) * twinkle;
            
            // Цвет звезды
            vec3 starColor = mix(vec3(1.0, 0.9, 0.8), vec3(0.8, 0.9, 1.0), random);
            color += starColor * star;
        }
    }
    
    return color;
}

// Туманность
vec3 nebula(vec2 uv, float t) {
    // Медленное вращение
    float rotation = t * 0.05;
    float c = cos(rotation);
    float s = sin(rotation);
    mat2 rot = mat2(c, -s, s, c);
    uv = rot * uv;
    
    // Многослойный шум
    float n1 = fbm(uv * 2.0, t * 0.3);
    float n2 = fbm(uv * 3.0 + vec2(5.0, 3.0), t * 0.2);
    float n3 = fbm(uv * 4.0 - vec2(2.0, 7.0), t * 0.4);
    
    // Комбинируем шумы
    float nebula = n1 * 0.5 + n2 * 0.3 + n3 * 0.2;
    
    // Форма туманности
    float dist = length(uv);
    float shape = exp(-dist * 1.5) * (1.0 + sin(dist * 5.0 - t * 0.5) * 0.3);
    
    nebula *= shape;
    
    // Цветовая палитра туманности
    vec3 color1 = baseColor.rgb * 1.5;
    vec3 color2 = vec3(0.2, 0.4, 1.0);
    vec3 color3 = vec3(1.0, 0.3, 0.6);
    
    vec3 color = mix(color1, color2, nebula);
    color = mix(color, color3, pow(nebula, 2.0));
    
    return color * nebula;
}

// Яркое ядро галактики
vec3 galacticCore(vec2 uv, float t) {
    float dist = length(uv);
    
    // Пульсирующее ядро
    float pulse = sin(t * 2.0) * 0.2 + 0.8;
    
    // Яркий центр (уменьшен размер и яркость)
    float core = exp(-dist * dist * 30.0) * pulse;
    
    // Аккреционный диск
    float diskAngle = atan(uv.y, uv.x);
    float disk = exp(-abs(dist - 0.15) * 20.0);
    disk *= (sin(diskAngle * 8.0 + t * 3.0) * 0.5 + 0.5);
    disk *= smoothstep(0.3, 0.1, dist);
    
    vec3 coreColor = vec3(1.0, 0.95, 0.8) * core * 0.8;
    vec3 diskColor = baseColor.rgb * disk * 0.5;
    
    return coreColor + diskColor;
}

// Космическая пыль
vec3 cosmicDust(vec2 uv, float t) {
    vec3 color = vec3(0.0);
    
    // Несколько слоёв пыли
    for (float i = 0.0; i < 3.0; i++) {
        float offset = i * 2.5;
        vec2 dustUV = uv * (2.0 + i * 0.5);
        
        // Движение пыли
        dustUV += vec2(sin(t * 0.1 + offset), cos(t * 0.15 + offset)) * 0.3;
        
        float dust = fbm(dustUV, t + offset);
        dust = pow(dust, 2.0);
        
        // Цвет пыли
        vec3 dustColor = mix(baseColor.rgb * 0.3, vec3(0.1, 0.1, 0.2), i / 3.0);
        color += dustColor * dust * 0.2;
    }
    
    return color;
}

void main() {
    vec2 uv = (gl_FragCoord.xy / screenSize) * 2.0 - 1.0;
    uv.x *= screenSize.x / screenSize.y;
    
    // Компенсируем зум
    uv /= zoomFactor;
    
    float t = time;
    
    // Масштабируем для лучшего вида
    uv *= 1.5;
    
    vec3 color = vec3(0.0);
    
    // Фон - глубокий космос
    color += vec3(0.01, 0.01, 0.03);
    
    // Туманность
    color += nebula(uv, t) * 0.8;
    
    // Космическая пыль
    color += cosmicDust(uv, t);
    
    // Спиральная структура галактики
    float galaxyPattern = galaxy(uv, t);
    color += baseColor.rgb * galaxyPattern * 0.5;
    
    // Звёзды
    color += galaxyStars(uv, t) * 0.6;
    
    // Яркое ядро
    color += galacticCore(uv, t);
    
    // Общее свечение
    float dist = length(uv);
    float glow = exp(-dist * 0.5) * 0.1;
    color += baseColor.rgb * glow;
    
    // Виньетирование
    float vignette = 1.0 - smoothstep(0.5, 1.5, dist);
    color *= vignette;
    
    // Ограничиваем яркость
    color = clamp(color, 0.0, 2.0);
    
    // Динамическая прозрачность
    float finalAlpha = alpha * (0.4 + length(color) * 0.2);
    
    fragColor = vec4(color, finalAlpha);
}
