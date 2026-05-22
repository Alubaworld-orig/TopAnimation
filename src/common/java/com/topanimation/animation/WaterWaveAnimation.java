package com.topanimation.animation;

import com.topanimation.core.Animation;

public class WaterWaveAnimation extends Animation {
    private float waveHeight;
    private float waveFrequency;
    
    public WaterWaveAnimation() {
        super(2.0f);
        this.waveFrequency = 1.5f;
    }
    
    @Override
    protected void onUpdate(float deltaTime) {
        float progress = getProgress();
        
        // Реалистичные волны
        waveHeight = (float) Math.sin(progress * Math.PI * 2 * waveFrequency) * 0.15f;
        waveHeight += (float) Math.sin(progress * Math.PI * waveFrequency * 0.5f) * 0.1f;
    }
    
    public float getWaveHeight() { return waveHeight; }
}
