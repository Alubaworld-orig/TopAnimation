package com.topanimation.animation;

import com.topanimation.core.Animation;

public class PlayerWalkAnimation extends Animation {
    private float armSwing;
    private float legSwing;
    
    public PlayerWalkAnimation() {
        super(1.0f); // Цикл 1 секунда
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        // Качание рук (синусоида)
        armSwing = (float) Math.sin(progress * Math.PI * 2) * 45f;
        
        // Ходьба ног
        if (progress < 0.5f) {
            legSwing = (progress / 0.5f) * 30f;  // Вперед
        } else {
            legSwing = ((1 - progress) / 0.5f) * 30f;  // Назад
        }
    }
    
    public float getArmSwing() { return armSwing; }
    public float getLegSwing() { return legSwing; }
}
