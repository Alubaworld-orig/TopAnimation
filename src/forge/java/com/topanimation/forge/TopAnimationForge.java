package com.topanimation.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafxmod.FXModLauncher;

@Mod("topanimation")
public class TopAnimationForge {
    public static final String MODID = "topanimation";
    
    public TopAnimationForge() {
        IEventBus modEventBus = FXModLauncher.getInstance().getModEventBus(MODID);
        modEventBus.addListener(this::onClientSetup);
    }
    
    private void onClientSetup(final FMLClientSetupEvent event) {
        // Инициализация клиентских анимаций
        System.out.println("TopAnimation Forge Mod загружен!");
    }
}
