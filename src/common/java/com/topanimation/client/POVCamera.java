package com.topanimation.client;

public class POVCamera {
    private static boolean hiddenBodyParts = false;
    
    public static void setupPOVCamera() {
        // Скрываем тело игрока в POV
        hiddenBodyParts = true;
    }
    
    public static boolean shouldHideBodyPart(String partName) {
        if (!hiddenBodyParts) return false;
        
        // Скрываем все части кроме рук с оружием
        return !partName.equals("right_arm") && !partName.equals("left_arm");
    }
    
    public static void resetCamera() {
        hiddenBodyParts = false;
    }
    
    public static boolean isPOVCameraActive() {
        return hiddenBodyParts;
    }
}
