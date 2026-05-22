package com.topanimation.core;

public abstract class Animation {
    protected float duration;
    protected float currentTime;
    protected boolean isPlaying;
    
    public Animation(float duration) {
        this.duration = duration;
        this.currentTime = 0;
        this.isPlaying = false;
    }
    
    public void play() {
        this.isPlaying = true;
        this.currentTime = 0;
    }
    
    public void stop() {
        this.isPlaying = false;
    }
    
    public void update(float deltaTime) {
        if (!isPlaying) return;
        
        currentTime += deltaTime;
        if (currentTime >= duration) {
            currentTime = 0;
            isPlaying = false;
        }
        
        onUpdate(deltaTime);
    }
    
    protected abstract void onUpdate(float deltaTime);
    
    public float getProgress() {
        return currentTime / duration;
    }
    
    public boolean isFinished() {
        return !isPlaying;
    }
}
