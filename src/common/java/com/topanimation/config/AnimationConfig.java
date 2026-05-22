package com.topanimation.config;

import java.util.HashMap;
import java.util.Map;

public class AnimationConfig {
    private static final Map<String, Float> ANIMATION_SPEEDS = new HashMap<>();
    private static final Map<String, Boolean> ANIMATION_ENABLED = new HashMap<>();
    
    static {
        // Скорости анимаций
        ANIMATION_SPEEDS.put("sword_slash", 1.0f);
        ANIMATION_SPEEDS.put("sword_stab", 1.0f);
        ANIMATION_SPEEDS.put("sword_spin", 1.0f);
        ANIMATION_SPEEDS.put("player_walk", 1.0f);
        ANIMATION_SPEEDS.put("player_run", 1.0f);
        ANIMATION_SPEEDS.put("player_idle", 1.0f);
        ANIMATION_SPEEDS.put("water_wave", 1.0f);
        ANIMATION_SPEEDS.put("water_flow", 1.0f);
        
        // Включены ли анимации
        ANIMATION_ENABLED.put("sword_slash", true);
        ANIMATION_ENABLED.put("sword_stab", true);
        ANIMATION_ENABLED.put("sword_spin", true);
        ANIMATION_ENABLED.put("player_walk", true);
        ANIMATION_ENABLED.put("player_run", true);
        ANIMATION_ENABLED.put("player_idle", true);
        ANIMATION_ENABLED.put("water_wave", true);
        ANIMATION_ENABLED.put("water_flow", true);
    }
    
    public static float getAnimationSpeed(String name) {
        return ANIMATION_SPEEDS.getOrDefault(name, 1.0f);
    }
    
    public static boolean isAnimationEnabled(String name) {
        return ANIMATION_ENABLED.getOrDefault(name, true);
    }
    
    public static void setAnimationSpeed(String name, float speed) {
        ANIMATION_SPEEDS.put(name, speed);
    }
    
    public static void setAnimationEnabled(String name, boolean enabled) {
        ANIMATION_ENABLED.put(name, enabled);
    }
}
