#version 150

in vec2 texCoord;
out vec4 fragColor;

uniform float time;
uniform vec2 screenSize;
uniform vec4 baseColor;
uniform float alpha;
uniform float zoomFactor;

// Быстрая хеш-функция
float hash(vec2 p) {
    return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);
}

float hash13(vec3 p3) {
    p3 = fract(p3 * 0.1031);
    p3 += dot(p3, p3.zyx + 31.32);
    return fract((p3.x + p3.y) * p3.z);
}

// Плавная интерполяция (smootherstep)
float smootherstep(float edge0, float edge1, float x) {
    x = clamp((x - edge0) / (edge1 - edge0), 0.0, 1.0);
    return x * x * x * (x * (x * 6.0 - 15.0) + 10.0);
}

// Функция для создания звезды
float star(vec2 uv, float size, float rotation) {
    // Поворачиваем UV координаты
    float c = cos(rotation);
    float s = sin(rotation);
    mat2 rot = mat2(c, -s, s, c);
    uv = rot * uv;
    
    // Создаём форму звезды (4 луча)
    float d = length(uv);
    float angle = atan(uv.y, uv.x);
    
    // 4 луча звезды с плавными переходами
    float rays = abs(sin(angle * 2.0)) * 0.5 + 0.5;
    rays = smootherstep(0.3, 1.0, rays);
    
    // Основная форма звезды
    float star = 1.0 - smoothstep(0.0, size, d);
    star *= rays;
    
    // Добавляем яркий центр
    float core = exp(-d * d / (size * size * 0.1));
    
    // Добавляем лучи
    float beams = exp(-abs(sin(angle * 2.0)) * 5.0) * exp(-d * 2.0);
    
    return star + core * 2.0 + beams * 0.5;
}

// Слой звёзд
vec3 starLayer(vec2 uv, float layer, float t) {
    vec3 color = vec3(0.0);
    
    // Параметры слоя
    float speed = 0.2 + layer * 0.15;
    float density = 8.0 + layer * 4.0;
    
    // Плавное движение звёзд
    vec2 offset = vec2(
        sin(t * speed * 0.3) * 0.5 + t * speed * 0.5,
        cos(t * speed * 0.2) * 0.3 + t * speed * 0.3
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
            if (random < 0.3) continue;
            
            // Позиция звезды в ячейке
            vec2 starPos = neighbor + vec2(
                hash(cellID + vec2(1.0, 0.0)) - 0.5,
                hash(cellID + vec2(0.0, 1.0)) - 0.5
            ) * 0.8;
            
            vec2 toStar = gridLocal - starPos;
            
            // Размер звезды
            float size = 0.02 + hash(cellID + vec2(2.0, 3.0)) * 0.03;
            
            // Плавное мерцание (несколько частот для более органичного эффекта)
            float twinkleSpeed = 2.0 + hash(cellID + vec2(7.0, 8.0)) * 2.0;
            float twinkle1 = sin(t * twinkleSpeed + random * 6.28318) * 0.5 + 0.5;
            float twinkle2 = sin(t * twinkleSpeed * 0.7 + random * 3.14159) * 0.5 + 0.5;
            float twinkle = mix(twinkle1, twinkle2, 0.5);
            twinkle = smootherstep(0.0, 1.0, twinkle);
            twinkle = twinkle * 0.5 + 0.5; // Минимальная яркость 50%
            
            // Плавное вращение звезды
            float rotation = t * 0.3 + random * 6.28318;
            
            // Рисуем звезду
            float starValue = star(toStar, size, rotation);
            starValue *= twinkle;
            
            // Цвет звезды (разные оттенки)
            vec3 starColor;
            float colorRand = hash(cellID + vec2(5.0, 6.0));
            
            if (colorRand < 0.25) {
                // Белые звёзды
                starColor = vec3(1.0, 1.0, 1.0);
            } else if (colorRand < 0.45) {
                // Голубоватые
                starColor = vec3(0.8, 0.9, 1.0);
            } else if (colorRand < 0.65) {
                // Желтоватые
                starColor = vec3(1.0, 0.95, 0.8);
            } else if (colorRand < 0.85) {
                // Розоватые
                starColor = vec3(1.0, 0.85, 0.9);
            } else {
                // Цвет темы
                starColor = baseColor.rgb;
            }
            
            color += starColor * starValue;
        }
    }
    
    return color;
}

// Функция для создания падающих звёзд (больше и чаще)
vec3 shootingStars(vec2 uv, float t) {
    vec3 color = vec3(0.0);
    
    // 6 падающих звёзд
    for (float i = 0.0; i < 6.0; i++) {
        float offset = i * 2.0;
        float cycleDuration = 4.0; // Быстрее появляются
        float localTime = mod(t * 0.5 + offset, cycleDuration);
        
        // Позиция падающей звезды
        float startX = hash(vec2(i, 1.0)) * 2.4 - 1.2;
        float startY = 1.3;
        
        // Разные направления для разнообразия
        float angle = -0.3 + hash(vec2(i, 2.0)) * 0.4;
        vec2 velocity = vec2(sin(angle), -cos(angle)) * 0.4;
        
        vec2 starPos = vec2(startX, startY) + velocity * localTime;
        
        // Направление хвоста
        vec2 direction = normalize(velocity);
        
        // Расстояние до линии хвоста
        vec2 toStar = uv - starPos;
        float alongTrail = dot(toStar, direction);
        
        // Плавное появление и исчезновение
        float fadeIn = smootherstep(0.0, 0.3, localTime);
        float fadeOut = smootherstep(cycleDuration, cycleDuration - 0.5, localTime);
        float fade = fadeIn * fadeOut;
        
        if (alongTrail > 0.0 && alongTrail < 0.4) {
            float perpDist = length(toStar - direction * alongTrail);
            
            // Хвост с плавным затуханием
            float trail = exp(-perpDist * 40.0) * exp(-alongTrail * 8.0);
            trail *= fade;
            
            // Цвет хвоста
            vec3 trailColor = mix(baseColor.rgb, vec3(1.0, 1.0, 1.0), 0.5);
            color += trailColor * trail * 0.6;
        }
        
        // Голова падающей звезды
        float dist = length(toStar);
        float head = exp(-dist * dist * 150.0);
        head *= fade;
        
        color += vec3(1.0, 1.0, 1.0) * head * 1.5;
    }
    
    return color;
}

// Пульсирующие волны света (новая анимация)
vec3 pulsingWaves(vec2 uv, float t) {
    vec3 color = vec3(0.0);
    
    float dist = length(uv);
    
    // Несколько волн с разной скоростью
    for (float i = 0.0; i < 3.0; i++) {
        float waveTime = t * 0.5 + i * 2.0;
        float wave = mod(waveTime, 3.0);
        
        // Кольцо расширяется от центра
        float ring = abs(dist - wave * 0.5);
        float intensity = exp(-ring * 15.0);
        
        // Плавное затухание волны
        intensity *= smootherstep(3.0, 0.0, wave);
        
        color += baseColor.rgb * intensity * 0.15;
    }
    
    return color;
}

// Плавающие частицы света (дополнительная анимация)
vec3 floatingParticles(vec2 uv, float t) {
    vec3 color = vec3(0.0);
    
    // 8 плавающих частиц
    for (float i = 0.0; i < 8.0; i++) {
        float seed = i * 123.456;
        
        // Круговое движение
        float angle = t * 0.3 + hash(vec2(seed, 1.0)) * 6.28318;
        float radius = 0.3 + hash(vec2(seed, 2.0)) * 0.4;
        
        vec2 particlePos = vec2(
            cos(angle) * radius,
            sin(angle) * radius * 0.7
        );
        
        // Вертикальное колебание
        particlePos.y += sin(t * 0.5 + seed) * 0.2;
        
        float dist = length(uv - particlePos);
        
        // Мягкое свечение частицы
        float particle = exp(-dist * dist * 30.0);
        
        // Пульсация
        float pulse = sin(t * 2.0 + seed) * 0.3 + 0.7;
        particle *= pulse;
        
        // Цвет частицы
        vec3 particleColor = mix(baseColor.rgb, vec3(1.0, 1.0, 1.0), 0.3);
        color += particleColor * particle * 0.2;
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
    
    // Несколько слоёв звёзд с разной скоростью (эффект параллакса)
    color += starLayer(uv, 0.0, t) * 0.5;
    color += starLayer(uv, 1.0, t) * 0.7;
    color += starLayer(uv, 2.0, t) * 0.9;
    
    // Добавляем падающие звёзды (больше и чаще)
    color += shootingStars(uv, t);
    
    // Пульсирующие волны
    color += pulsingWaves(uv, t);
    
    // Плавающие частицы
    color += floatingParticles(uv, t);
    
    // Общее плавное свечение базового цвета
    float globalPulse = sin(t * 0.8) * 0.5 + 0.5;
    globalPulse = smootherstep(0.0, 1.0, globalPulse);
    float glow = exp(-length(uv) * 0.6) * 0.15 * globalPulse;
    color += baseColor.rgb * glow;
    
    // Виньетирование
    float vignette = 1.0 - length(uv * 0.5);
    vignette = smootherstep(0.2, 1.0, vignette);
    color *= vignette;
    
    // Ограничиваем яркость
    color = clamp(color, 0.0, 2.0);
    
    // Динамическая прозрачность
    float finalAlpha = alpha * (0.35 + length(color) * 0.2);
    
    fragColor = vec4(color, finalAlpha);
}
