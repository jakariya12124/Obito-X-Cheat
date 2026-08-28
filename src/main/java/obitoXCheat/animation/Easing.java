package obitoXCheat.animation;

public class Easing {
    public static final EasingFunction LINEAR = t -> t;
    
    public static final EasingFunction EASE_IN_QUAD = t -> t * t;
    public static final EasingFunction EASE_OUT_QUAD = t -> 1 - (1 - t) * (1 - t);
    public static final EasingFunction EASE_IN_OUT_QUAD = t -> t < 0.5 ? 2 * t * t : -1 + (4 - 2 * t) * t;
    
    public static final EasingFunction EASE_IN_CUBIC = t -> t * t * t;
    public static final EasingFunction EASE_OUT_CUBIC = t -> 1 - (1 - t) * (1 - t) * (1 - t);
    public static final EasingFunction EASE_IN_OUT_CUBIC = t -> t < 0.5 ? 4 * t * t * t : 1 - Math.pow(-2 * t + 2, 3) / 2;
    
    public static final EasingFunction EASE_IN = EASE_IN_CUBIC;
    public static final EasingFunction EASE_OUT = EASE_OUT_CUBIC;
    public static final EasingFunction EASE_IN_OUT = EASE_IN_OUT_CUBIC;
    
    public static final EasingFunction BOUNCE_OUT = t -> {
        if (t < 0.36363636) return 7.5625f * t * t;
        if (t < 0.72727272) return 0.75f + 0.75f * 7.5625f * (t - 0.54545454f) * (t - 0.54545454f);
        if (t < 0.90909090) return 0.9375f + 0.75f * 7.5625f * (t - 0.77272727f) * (t - 0.77272727f);
        return 0.984375f + 0.75f * 7.5625f * (t - 0.95454545f) * (t - 0.95454545f);
    };
    
    public static final EasingFunction ELASTIC = t -> {
        if (t == 0 || t == 1) return t;
        double p = 0.3;
        double s = p / 4;
        return -Math.pow(2, 10 * (t - 1)) * Math.sin((t - 1 - s) * (2 * Math.PI) / p);
    };
    
    @FunctionalInterface
    public interface EasingFunction {
        double apply(double t);
    }
}