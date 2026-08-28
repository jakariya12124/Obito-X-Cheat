package obitoXCheat.utils;

import obitoXCheat.animation.Animation;
import obitoXCheat.animation.Easing;
import obitoXCheat.animation.Easing.EasingFunction;

public class AnimationUtils {
    
    /**
     * Create a fade-in animation
     */
    public static Animation createFadeIn(long duration) {
        return new Animation(0, 1, duration, Easing.EASE_IN_OUT);
    }
    
    /**
     * Create a fade-out animation
     */
    public static Animation createFadeOut(long duration) {
        return new Animation(1, 0, duration, Easing.EASE_IN_OUT);
    }
    
    /**
     * Create a scale animation
     */
    public static Animation createScale(double startScale, double endScale, long duration) {
        return new Animation(startScale, endScale, duration, Easing.EASE_OUT);
    }
    
    /**
     * Create a slide animation
     */
    public static Animation createSlide(double startPos, double endPos, long duration) {
        return new Animation(startPos, endPos, duration, Easing.EASE_IN_OUT);
    }
    
    /**
     * Create a bounce animation
     */
    public static Animation createBounce(double startValue, double endValue, long duration) {
        return new Animation(startValue, endValue, duration, Easing.BOUNCE_OUT);
    }
    
    /**
     * Create an elastic animation
     */
    public static Animation createElastic(double startValue, double endValue, long duration) {
        return new Animation(startValue, endValue, duration, Easing.ELASTIC);
    }
    
    /**
     * Interpolate between two values with custom easing
     */
    public static double interpolate(double start, double end, double progress, EasingFunction easing) {
        return start + (end - start) * easing.apply(Math.max(0, Math.min(1, progress)));
    }
}