package com.topanimation.animation;

import com.topanimation.core.Animation;

public class WaterFlowAnimation extends Animation {
    private float flowOffset;
    
    public WaterFlowAnimation() {
        super(4.0f);
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        // Текущее движение воды
        flowOffset = progress * 2.0f;
    }
    
    public float getFlowOffset() { return flowOffset; }
}
