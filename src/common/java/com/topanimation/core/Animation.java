package com.topanimation.core;

public abstract class Animation {
    protected float duration;
    protected float currentTime;
    protected boolean isPlaying;
    protected String name;
    
    public Animation(float duration) {
        this.duration = duration;
        this.currentTime = 0;
        this.isPlaying = false;
        this.name = this.getClass().getSimpleName();
    }
    
    public void play() {
        this.isPlaying = true;
        this.currentTime = 0;
    }
    
    public void stop() {
        this.isPlaying = false;
        this.currentTime = 0;
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
        return duration > 0 ? currentTime / duration : 0f;
    }
    
    public boolean isFinished() {
        return !isPlaying;
    }
    
    public boolean isPlaying() {
        return isPlaying;
    }
    
    public float getCurrentTime() {
        return currentTime;
    }
    
    public float getDuration() {
        return duration;
    }
    
    public String getName() {
        return name;
    }
}
