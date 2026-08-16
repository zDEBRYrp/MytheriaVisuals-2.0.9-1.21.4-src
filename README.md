# Mytheria Visuals — исходники 2.0.9 / Source code 2.0.9

Русская версия

## Описание
Исходный код модификации **Mytheria Visuals 2.0.9** для Minecraft 1.21.4 (Fabric).

### 🔗 Ссылки
- Telegram-канал: https://t.me/MythBlogVisual

---

## Требования
- Minecraft 1.21.4 (Fabric)
- Fabric Loader, совместимый с 1.21.4
- Fabric API 0.113.0+1.21.4
- Java JDK 21

> Примечание: сборка использует Fabric Loom и требует именно JDK 21 (не выше и не ниже) — более новые версии Java (22+) не поддерживаются используемой версией Gradle.

## Сборка
Перейдите в папку с исходным кодом проекта и соберите его.

Unix / macOS / WSL:

```bash
cd MytheriaVisuals
./gradlew build
```

Windows (PowerShell или cmd.exe):

```powershell
cd MytheriaVisuals
.\gradlew.bat build
```

Если возникают проблемы с зависимостями, выполните:

```bash
./gradlew --refresh-dependencies
```

Собранный артефакт появится в `build/libs/`. Полученный `.jar` можно поместить в папку `mods/` клиента.

---

## Установка (для игроков)
1. Установите Fabric Loader и Fabric API.
2. Скопируйте полученный `mytheria-2.0.9.jar` в `minecraft/mods/`.
3. Запустите Minecraft с профилем Fabric.

---

## Разработка / запуск в IDE
- Откройте проект в IntelliJ IDEA или VSCode.
- Импортируйте Gradle-проект.
- Используйте конфигурацию `runClient` (Fabric Loom) для тестирования.

> Если проект лежит в WSL, а IDE запущена на Windows — открывайте проект по сетевому пути `\\wsl.localhost\<дистрибутив>\home\<пользователь>\MytheriaVisuals`, чтобы избежать проблем с регистрозависимостью имён файлов на NTFS.

---

*Вопросы и обновления:* [Telegram-канал](https://t.me/MythBlogVisual)

---

English version

# Mytheria Visuals — source 2.0.9

## Overview
Source code for the Mytheria Visuals mod version 2.0.9 targeting Minecraft 1.21.4 (Fabric).

### Links
- Telegram channel: https://t.me/MythBlogVisual

---

## Requirements
- Minecraft 1.21.4 (Fabric)
- Fabric Loader compatible with 1.21.4
- Fabric API 0.113.0+1.21.4
- Java JDK 21

Note: the build uses Fabric Loom and specifically requires JDK 21 — newer Java versions (22+) are not supported by the Gradle version used here.

## Build
Navigate into the project source folder and build it.

Unix / macOS / WSL:

```bash
cd MytheriaVisuals
./gradlew build
```

Windows (PowerShell or cmd.exe):

```powershell
cd MytheriaVisuals
.\gradlew.bat build
```

If you have dependency issues, run:

```bash
./gradlew --refresh-dependencies
```

The built artifact will appear in `build/libs/`. Place the resulting `.jar` into the client's `mods/` folder.

---

## Installation (for players)
1. Install Fabric Loader and Fabric API.
2. Copy `mytheria-2.0.9.jar` into your `minecraft/mods/` directory.
3. Launch Minecraft using the Fabric profile.

---

## Development / IDE
- Open the project in IntelliJ IDEA or VSCode.
- Import the Gradle project.
- Use the `runClient` (Fabric Loom) configuration for testing.

> If the project lives inside WSL while the IDE runs on Windows, open it via the network path `\\wsl.localhost\<distro>\home\<user>\MytheriaVisuals` to avoid NTFS case-sensitivity issues with filenames.

---

*Updates and support:* [Telegram channel](https://t.me/MythBlogVisual)
