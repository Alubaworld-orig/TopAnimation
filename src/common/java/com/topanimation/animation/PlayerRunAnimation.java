package com.topanimation.animation;

import com.topanimation.core.Animation;

public class PlayerRunAnimation extends Animation {
    private float armSwing;
    private float legSwing;
    private float bobbing;
    private float bodyLean;
    
    public PlayerRunAnimation() {
        super(0.6f);
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        armSwing = (float) Math.sin(progress * Math.PI * 2) * 60f;
        legSwing = (float) Math.sin(progress * Math.PI * 2) * 45f;
        bobbing = (float) Math.abs(Math.sin(progress * Math.PI * 2)) * 0.2f;
        bodyLean = (float) Math.sin(progress * Math.PI * 2) * 3f;
    }
    
    public float getArmSwing() { return armSwing; }
    public float getLegSwing() { return legSwing; }
    public float getBobbing() { return bobbing; }
    public float getBodyLean() { return bodyLean; }
}
