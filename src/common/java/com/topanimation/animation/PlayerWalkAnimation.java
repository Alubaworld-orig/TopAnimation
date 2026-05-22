package com.topanimation.animation;

import com.topanimation.core.Animation;

public class PlayerWalkAnimation extends Animation {
    private float armSwing;
    private float legSwing;
    private float bodyTilt;
    
    public PlayerWalkAnimation() {
        super(1.0f);
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        armSwing = (float) Math.sin(progress * Math.PI * 2) * 45f;
        
        if (progress < 0.5f) {
            legSwing = (progress / 0.5f) * 30f;
            bodyTilt = (progress / 0.5f) * 5f;
        } else {
            legSwing = ((1 - progress) / 0.5f) * 30f;
            bodyTilt = ((1 - progress) / 0.5f) * 5f;
        }
    }
    
    public float getArmSwing() { return armSwing; }
    public float getLegSwing() { return legSwing; }
    public float getBodyTilt() { return bodyTilt; }
}
