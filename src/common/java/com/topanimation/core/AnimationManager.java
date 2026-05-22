package com.topanimation.core;

import java.util.HashMap;
import java.util.Map;

public class AnimationManager {
    private static final AnimationManager INSTANCE = new AnimationManager();
    private final Map<String, Animation> animations = new HashMap<>();
    
    private AnimationManager() {
        initializeAnimations();
    }
    
    public static AnimationManager getInstance() {
        return INSTANCE;
    }
    
    private void initializeAnimations() {
        // Анимации мечей
        animations.put("sword_slash", new SwordSlashAnimation());
        animations.put("sword_stab", new SwordStabAnimation());
        animations.put("sword_spin", new SwordSpinAnimation());
        
        // Анимации игроков
        animations.put("player_walk", new PlayerWalkAnimation());
        animations.put("player_run", new PlayerRunAnimation());
        animations.put("player_idle", new PlayerIdleAnimation());
        
        // Анимации воды
        animations.put("water_wave", new WaterWaveAnimation());
        animations.put("water_flow", new WaterFlowAnimation());
    }
    
    public Animation getAnimation(String name) {
        return animations.get(name);
    }
    
    public void updateAnimations(float deltaTime) {
        for (Animation animation : animations.values()) {
            animation.update(deltaTime);
        }
    }
}
