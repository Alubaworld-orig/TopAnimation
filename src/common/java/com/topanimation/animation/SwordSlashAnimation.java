package com.topanimation.animation;

import com.topanimation.core.Animation;

public class SwordSlashAnimation extends Animation {
    private float rotationX;
    private float rotationZ;
    private float posX;
    private float posY;
    
    public SwordSlashAnimation() {
        super(0.6f); // 600ms анимация
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        // Реалистичный взмах меча
        if (progress < 0.3f) {
            // Первая фаза - разгон
            float phase1 = progress / 0.3f;
            rotationX = -90f * phase1;  // Вращение вниз
            rotationZ = -30f * phase1;   // Боковой наклон
            posX = 0.5f * phase1;
            posY = -0.3f * phase1;
        } else if (progress < 0.7f) {
            // Вторая фаза - максимальная скорость
            float phase2 = (progress - 0.3f) / 0.4f;
            rotationX = -90f - 60f * phase2;
            rotationZ = -30f - 20f * phase2;
            posX = 0.5f + 0.2f * phase2;
            posY = -0.3f - 0.2f * phase2;
        } else {
            // Третья фаза - торможение
            float phase3 = (progress - 0.7f) / 0.3f;
            rotationX = -150f + 150f * phase3;
            rotationZ = -50f + 50f * phase3;
            posX = 0.7f - 0.7f * phase3;
            posY = -0.5f + 0.5f * phase3;
        }
    }
    
    public float getRotationX() { return rotationX; }
    public float getRotationZ() { return rotationZ; }
    public float getPosX() { return posX; }
    public float getPosY() { return posY; }
}
