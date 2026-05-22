package com.topanimation.animation;

import com.topanimation.core.Animation;

public class SwordStabAnimation extends Animation {
    private float posZ;
    private float rotationX;
    
    public SwordStabAnimation() {
        super(0.4f);
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        if (progress < 0.4f) {
            float phase = progress / 0.4f;
            posZ = 1.0f * phase;
            rotationX = -20f * phase;
        } else {
            float phase = (progress - 0.4f) / 0.6f;
            posZ = 1.0f - 1.0f * phase;
            rotationX = -20f + 20f * phase;
        }
    }
    
    public float getPosZ() { return posZ; }
    public float getRotationX() { return rotationX; }
}
