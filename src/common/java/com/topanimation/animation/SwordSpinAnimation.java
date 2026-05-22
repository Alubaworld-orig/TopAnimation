package com.topanimation.animation;

import com.topanimation.core.Animation;

public class SwordSpinAnimation extends Animation {
    private float rotationY;
    
    public SwordSpinAnimation() {
        super(0.8f);
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        rotationY = progress * 360f;
    }
    
    public float getRotationY() { return rotationY; }
}
