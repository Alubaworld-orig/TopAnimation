package com.topanimation.fabric;

import com.topanimation.core.AnimationManager;
import net.fabricmc.api.ModInitializer;

public class TopAnimationFabric implements ModInitializer {
    public static final String MODID = "topanimation";
    
    @Override
    public void onInitialize() {
        System.out.println("[TopAnimation] Fabric mod initializing...");
        AnimationManager manager = AnimationManager.getInstance();
        System.out.println("[TopAnimation] AnimationManager loaded successfully!");
        System.out.println("[TopAnimation] Available animations: sword_slash, sword_stab, sword_spin, player_walk, player_run, player_idle, water_wave, water_flow");
    }
}
