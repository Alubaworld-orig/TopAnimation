package com.topanimation.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class TopAnimationFabric implements ModInitializer {
    public static final String MODID = "topanimation";
    
    @Override
    public void onInitialize() {
        System.out.println("TopAnimation Fabric Mod загружен!");
        
        // Инициализация клиентских событий
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            // Обновление анимаций
        });
    }
}
