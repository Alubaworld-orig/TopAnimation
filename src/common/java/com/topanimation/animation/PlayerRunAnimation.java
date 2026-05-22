package com.topanimation.animation;

import com.topanimation.core.Animation;

public class PlayerRunAnimation extends Animation {
    private float armSwing;
    private float legSwing;
    private float bobbing;
    
    public PlayerRunAnimation() {
        super(0.6f); // Более быстрый цикл
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        // Быстрое качание рук
        armSwing = (float) Math.sin(progress * Math.PI * 2) * 60f;
        
        // Быстрая ходьба ног
        legSwing = (float) Math.sin(progress * Math.PI * 2) * 45f;
        
        // Прыгающее движение туловища
        bobbing = (float) Math.abs(Math.sin(progress * Math.PI * 2)) * 0.2f;
    }
    
    public float getArmSwing() { return armSwing; }
    public float getLegSwing() { return legSwing; }
    public float getBobbing() { return bobbing; }
}
