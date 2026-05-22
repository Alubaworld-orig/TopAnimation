package com.topanimation.forge;

import com.topanimation.core.AnimationManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod("topanimation")
public class TopAnimationForge {
    public static final String MODID = "topanimation";
    
    public TopAnimationForge() {
        System.out.println("[TopAnimation] Forge mod initializing...");
    }
    
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientEvents {
        @net.minecraftforge.eventbus.api.SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            AnimationManager manager = AnimationManager.getInstance();
            System.out.println("[TopAnimation] Client setup complete. AnimationManager loaded.");
            System.out.println("[TopAnimation] Available animations: sword_slash, sword_stab, sword_spin, player_walk, player_run, player_idle, water_wave, water_flow");
        }
    }
}
