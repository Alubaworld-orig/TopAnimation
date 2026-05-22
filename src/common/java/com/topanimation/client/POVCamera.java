package com.topanimation.client;

public class POVCamera {
    private static boolean hiddenBodyParts = false;
    private static float fovMultiplier = 1.0f;
    
    public static void setupPOVCamera() {
        hiddenBodyParts = true;
        fovMultiplier = 1.1f;
    }
    
    public static boolean shouldHideBodyPart(String partName) {
        if (!hiddenBodyParts) return false;
        return !partName.equals("right_arm") && 
               !partName.equals("left_arm") &&
               !partName.equals("right_hand") &&
               !partName.equals("left_hand");
    }
    
    public static void resetCamera() {
        hiddenBodyParts = false;
        fovMultiplier = 1.0f;
    }
    
    public static boolean isPOVCameraActive() {
        return hiddenBodyParts;
    }
    
    public static float getFOVMultiplier() {
        return fovMultiplier;
    }
}
