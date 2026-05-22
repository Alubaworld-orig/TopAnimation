package com.topanimation.animation;

import com.topanimation.core.Animation;

public class WaterFlowAnimation extends Animation {
    private float flowOffset;
    private float turbulence;
    
    public WaterFlowAnimation() {
        super(4.0f);
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        flowOffset = progress * 2.0f;
        turbulence = (float) Math.sin(progress * Math.PI * 3) * 0.1f;
    }
    
    public float getFlowOffset() { return flowOffset; }
    public float getTurbulence() { return turbulence; }
}
