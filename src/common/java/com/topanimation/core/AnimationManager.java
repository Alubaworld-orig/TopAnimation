package com.topanimation.core;

import java.util.HashMap;
import java.util.Map;

public class AnimationManager {
    private static final AnimationManager INSTANCE = new AnimationManager();
    private final Map<String, Animation> animations = new HashMap<>();
    private float globalDeltaTime;
    
    private AnimationManager() {
        initializeAnimations();
        this.globalDeltaTime = 0f;
    }
    
    public static AnimationManager getInstance() {
        return INSTANCE;
    }
    
    private void initializeAnimations() {
        // Анимации мечей
        try {
            animations.put("sword_slash", Class.forName("com.topanimation.animation.SwordSlashAnimation").getDeclaredConstructor().newInstance());
            animations.put("sword_stab", Class.forName("com.topanimation.animation.SwordStabAnimation").getDeclaredConstructor().newInstance());
            animations.put("sword_spin", Class.forName("com.topanimation.animation.SwordSpinAnimation").getDeclaredConstructor().newInstance());
            
            // Анимации игроков
            animations.put("player_walk", Class.forName("com.topanimation.animation.PlayerWalkAnimation").getDeclaredConstructor().newInstance());
            animations.put("player_run", Class.forName("com.topanimation.animation.PlayerRunAnimation").getDeclaredConstructor().newInstance());
            animations.put("player_idle", Class.forName("com.topanimation.animation.PlayerIdleAnimation").getDeclaredConstructor().newInstance());
            
            // Анимации воды
            animations.put("water_wave", Class.forName("com.topanimation.animation.WaterWaveAnimation").getDeclaredConstructor().newInstance());
            animations.put("water_flow", Class.forName("com.topanimation.animation.WaterFlowAnimation").getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.err.println("Failed to initialize animations: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public Animation getAnimation(String name) {
        return (Animation) animations.get(name);
    }
    
    public void updateAnimations(float deltaTime) {
        this.globalDeltaTime = deltaTime;
        for (Object animation : animations.values()) {
            if (animation instanceof Animation) {
                ((Animation) animation).update(deltaTime);
            }
        }
    }
    
    public float getGlobalDeltaTime() {
        return globalDeltaTime;
    }
    
    public boolean hasAnimation(String name) {
        return animations.containsKey(name);
    }
    
    public void playAnimation(String name) {
        Animation anim = getAnimation(name);
        if (anim != null) {
            anim.play();
        }
    }
}
