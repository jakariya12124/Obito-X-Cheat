package obitoXCheat.animation;

import obitoXCheat.animation.Easing.EasingFunction;

public class PropertyAnimation {
    private double currentValue;
    private double targetValue;
    private long duration;
    private EasingFunction easing;
    private long startTime;
    private boolean active;
    private Runnable onComplete;
    
    public PropertyAnimation(double initialValue, double targetValue, long duration, EasingFunction easing) {
        this.currentValue = initialValue;
        this.targetValue = targetValue;
        this.duration = duration;
        this.easing = easing;
        this.startTime = System.currentTimeMillis();
        this.active = true;
    }
    
    public void update() {
        if (!active) return;
        
        long elapsed = System.currentTimeMillis() - startTime;
        if (elapsed >= duration) {
            currentValue = targetValue;
            active = false;
            if (onComplete != null) {
                onComplete.run();
            }
            return;
        }
        
        double progress = (double) elapsed / duration;
        double eased = easing.apply(progress);
        currentValue = (currentValue * (1 - eased)) + (targetValue * eased);
    }
    
    public double getCurrentValue() {
        update();
        return currentValue;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setOnComplete(Runnable runnable) {
        this.onComplete = runnable;
    }
    
    public void reset() {
        this.startTime = System.currentTimeMillis();
        this.active = true;
    }
}