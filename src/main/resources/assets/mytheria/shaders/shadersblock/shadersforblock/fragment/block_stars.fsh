#version 150

in vec2 texCoord;
out vec4 fragColor;

uniform float time;
uniform vec2 screenSize;
uniform vec4 baseColor;
uniform float alpha;
uniform float zoomFactor;

// Хеш функция
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

// Функция для создания крестообразной звезды
float crossStar(vec2 uv, float size, float rotation) {
    // Поворачиваем UV координаты
    float c = cos(rotation);
    float s = sin(rotation);
    mat2 rot = mat2(c, -s, s, c);
    uv = rot * uv;
    
    float dist = length(uv);
    
    // Основное тело звезды (яркое)
    float core = exp(-dist * dist / (size * size * 0.3));
    
    // Лучи звезды (крестообразные, длинные и яркие)
    float beamH = exp(-abs(uv.y) / (size * 2.5)) * exp(-abs(uv.x) * 2.0);
    float beamV = exp(-abs(uv.x) / (size * 2.5)) * exp(-abs(uv.y) * 2.0);
    float beams = max(beamH, beamV);
    
    // Увеличенное свечение
    float glow = exp(-dist / (size * 2.5)) * 0.5;
    
    return core * 2.0 + beams * 1.5 + glow;
}

// Слой звёзд с плавным движением
vec3 starLayer(vec2 uv, float layer, float t) {
    vec3 color = vec3(0.0);
    
    // Параметры слоя
    float speed = 0.05 + layer * 0.03;
    float density = 6.0 + layer * 2.0;
    
    // Плавное круговое движение
    vec2 offset = vec2(
        sin(t * speed * 0.5 + layer) * 0.3,
        cos(t * speed * 0.3 + layer) * 0.3
    );
    
    vec2 gridUV = (uv + offset) * density;
    vec2 gridID = floor(gridUV);
    vec2 gridLocal = fract(gridUV) - 0.5;
    
    // Создаём звёзды в сетке
    for (float y = -1.0; y <= 1.0; y++) {
        for (float x = -1.0; x <= 1.0; x++) {
            vec2 neighbor = vec2(x, y);
            vec2 cellID = gridID + neighbor;
            
            // Случайные параметры для каждой звезды
            float random = hash13(vec3(cellID, layer));
            
            // Не все ячейки имеют звёзды
            if (random < 0.4) continue;
            
            // Позиция звезды в ячейке с небольшим движением
            vec2 localOffset = vec2(
                sin(t * 0.2 + random * 6.28318) * 0.1,
                cos(t * 0.15 + random * 3.14159) * 0.1
            );
            
            vec2 starPos = neighbor + vec2(
                hash(cellID + vec2(1.0, 0.0)) - 0.5,
                hash(cellID + vec2(0.0, 1.0)) - 0.5
            ) * 0.6 + localOffset;
            
            vec2 toStar = gridLocal - starPos;
            
            // Размер звезды (разные размеры)
            float sizeRand = hash(cellID + vec2(2.0, 3.0));
            float size;
            if (sizeRand < 0.3) {
                size = 0.04 + hash(cellID + vec2(4.0, 5.0)) * 0.02; // Большие звёзды
            } else if (sizeRand < 0.6) {
                size = 0.025 + hash(cellID + vec2(6.0, 7.0)) * 0.015; // Средние звёзды
            } else {
                size = 0.015 + hash(cellID + vec2(8.0, 9.0)) * 0.01; // Маленькие звёзды
            }
            
            // Плавное мерцание
            float twinkleSpeed = 1.0 + hash(cellID + vec2(10.0, 11.0)) * 1.5;
            float twinkle1 = sin(t * twinkleSpeed + random * 6.28318) * 0.5 + 0.5;
            float twinkle2 = sin(t * twinkleSpeed * 0.7 + random * 3.14159) * 0.5 + 0.5;
            float twinkle = mix(twinkle1, twinkle2, 0.5);
            twinkle = smootherstep(0.0, 1.0, twinkle) * 0.4 + 0.6;
            
            // Медленное вращение звезды
            float rotation = t * 0.2 + random * 6.28318;
            
            // Рисуем крестообразную звезду
            float starValue = crossStar(toStar, size, rotation);
            starValue *= twinkle;
            
            // Цвет звезды
            vec3 starColor;
            float colorRand = hash(cellID + vec2(12.0, 13.0));
            
            if (colorRand < 0.4) {
                // Белые звёзды
                starColor = vec3(1.0, 1.0, 1.0);
            } else if (colorRand < 0.7) {
                // Слегка голубоватые
                starColor = vec3(0.9, 0.95, 1.0);
            } else {
                // Цвет темы
                starColor = mix(vec3(1.0, 1.0, 1.0), baseColor.rgb, 0.5);
            }
            
            color += starColor * starValue;
        }
    }
    
    return color;
}

// Дополнительные маленькие звёздочки
vec3 tinyStars(vec2 uv, float t) {
    vec3 color = vec3(0.0);
    
    float density = 25.0;
    vec2 gridUV = uv * density;
    vec2 gridID = floor(gridUV);
    vec2 gridLocal = fract(gridUV) - 0.5;
    
    for (float y = -1.0; y <= 1.0; y++) {
        for (float x = -1.0; x <= 1.0; x++) {
            vec2 neighbor = vec2(x, y);
            vec2 cellID = gridID + neighbor;
            
            float random = hash13(vec3(cellID, 5.0));
            if (random < 0.8) continue;
            
            vec2 starPos = neighbor + vec2(
                hash(cellID + vec2(1.0, 0.0)) - 0.5,
                hash(cellID + vec2(0.0, 1.0)) - 0.5
            ) * 0.8;
            
            float dist = length(gridLocal - starPos);
            
            // Мерцание
            float twinkle = sin(t * 3.0 + random * 6.28318) * 0.5 + 0.5;
            
            float star = exp(-dist * dist * 2000.0) * twinkle;
            
            color += vec3(1.0, 1.0, 1.0) * star * 0.3;
        }
    }
    
    return color;
}

// Мягкое свечение
vec3 ambientGlow(vec2 uv, float t) {
    vec3 color = vec3(0.0);
    
    // Несколько источников мягкого света
    for (float i = 0.0; i < 5.0; i++) {
        float seed = i * 234.567;
        
        // Позиция источника света
        vec2 lightPos = vec2(
            sin(t * 0.1 + seed) * 0.8,
            cos(t * 0.15 + seed * 1.5) * 0.8
        );
        
        float dist = length(uv - lightPos);
        
        // Мягкое свечение
        float glow = exp(-dist * 0.8) * 0.08;
        
        // Пульсация
        float pulse = sin(t * 0.5 + seed) * 0.3 + 0.7;
        glow *= pulse;
        
        color += baseColor.rgb * glow;
    }
    
    return color;
}

void main() {
    vec2 uv = (gl_FragCoord.xy / screenSize) * 2.0 - 1.0;
    uv.x *= screenSize.x / screenSize.y;
    
    // Компенсируем зум
    uv /= zoomFactor;
    
    float t = time;
    
    vec3 color = vec3(0.0);
    
    // Тёмный космический фон
    color += vec3(0.0, 0.0, 0.02);
    
    // Мягкое свечение
    color += ambientGlow(uv, t);
    
    // Несколько слоёв звёзд с разной скоростью (эффект параллакса)
    color += starLayer(uv, 0.0, t) * 0.4;
    color += starLayer(uv, 1.0, t) * 0.6;
    color += starLayer(uv, 2.0, t) * 0.8;
    
    // Маленькие звёздочки
    color += tinyStars(uv, t);
    
    // Виньетирование
    float dist = length(uv);
    float vignette = 1.0 - smoothstep(0.5, 2.0, dist);
    color *= vignette;
    
    // Ограничиваем яркость
    color = clamp(color, 0.0, 2.0);
    
    // Динамическая прозрачность
    float finalAlpha = alpha * (0.35 + length(color) * 0.25);
    
    fragColor = vec4(color, finalAlpha);
}
