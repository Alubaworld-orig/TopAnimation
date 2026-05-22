#!/bin/bash

# Сборка всех версий
echo "Building TopAnimation mods..."

# Создание директорий
mkdir -p dist/forge
mkdir -p dist/fabric

# Компилируем и создаем JAR для каждой версии
echo "Compiling Forge versions..."
for version in 1.16.5 1.17 1.18 1.19 1.20 1.21 1.26.1; do
    echo "Building Forge $version..."
    ./gradlew :$version-forge:build
    cp $version-forge/build/libs/*.jar dist/forge/TopAnimation-$version-forge.jar
done

echo "Compiling Fabric versions..."
for version in 1.16.5 1.17 1.18 1.19 1.20 1.21 1.26.1; do
    echo "Building Fabric $version..."
    ./gradlew :$version-fabric:build
    cp $version-fabric/build/libs/*.jar dist/fabric/TopAnimation-$version-fabric.jar
done

echo "Creating RAR archive..."
# Создание RAR архива (требуется WinRAR или rar утилита)
rar a -r TopAnimation-Mods.rar dist/

echo "Done! TopAnimation-Mods.rar created"
