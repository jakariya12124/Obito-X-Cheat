package obitoXCheat.animation;

import obitoXCheat.animation.Easing.EasingFunction;

public class Animation {
    private double startValue;
    private double endValue;
    private long duration;
    private EasingFunction easingFunction;
    private long startTime;
    private boolean finished;
    private Runnable onComplete;
    
    public Animation(double startValue, double endValue, long duration, EasingFunction easingFunction) {
        this.startValue = startValue;
        this.endValue = endValue;
        this.duration = duration;
        this.easingFunction = easingFunction;
        this.startTime = System.currentTimeMillis();
        this.finished = false;
    }
    
    public double getValue() {
        if (finished) return endValue;
        
        long elapsed = System.currentTimeMillis() - startTime;
        if (elapsed >= duration) {
            finished = true;
            if (onComplete != null) onComplete.run();
            return endValue;
        }
        
        double progress = (double) elapsed / duration;
        double eased = easingFunction.apply(progress);
        return startValue + (endValue - startValue) * eased;
    }
    
    public boolean isFinished() {
        return finished || System.currentTimeMillis() - startTime >= duration;
    }
    
    public void setOnComplete(Runnable runnable) {
        this.onComplete = runnable;
    }
    
    public void reset() {
        this.startTime = System.currentTimeMillis();
        this.finished = false;
    }
}