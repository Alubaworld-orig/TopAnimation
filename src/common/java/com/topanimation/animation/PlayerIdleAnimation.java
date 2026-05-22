package com.topanimation.animation;

import com.topanimation.core.Animation;

public class PlayerIdleAnimation extends Animation {
    private float bodyBobbing;
    private float armSwing;
    private float headNod;
    
    public PlayerIdleAnimation() {
        super(2.0f);
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        bodyBobbing = (float) Math.sin(progress * Math.PI * 2) * 0.05f;
        armSwing = (float) Math.sin(progress * Math.PI * 2) * 5f;
        headNod = (float) Math.sin(progress * Math.PI * 2) * 2f;
    }
    
    public float getBodyBobbing() { return bodyBobbing; }
    public float getArmSwing() { return armSwing; }
    public float getHeadNod() { return headNod; }
}
