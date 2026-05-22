package com.topanimation.animation;

import com.topanimation.core.Animation;

public class PlayerIdleAnimation extends Animation {
    private float bodyBobbing;
    private float armSwing;
    
    public PlayerIdleAnimation() {
        super(2.0f); // Медленный цикл
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        // Легкое покачивание туловища
        bodyBobbing = (float) Math.sin(progress * Math.PI * 2) * 0.05f;
        
        // Легкое колебание рук
        armSwing = (float) Math.sin(progress * Math.PI * 2) * 5f;
    }
    
    public float getBodyBobbing() { return bodyBobbing; }
    public float getArmSwing() { return armSwing; }
}
