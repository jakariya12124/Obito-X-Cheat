package obitoXCheat.animation;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class AnimationController {
    private static AnimationController instance;
    private List<Animation> animations;
    private Map<String, Animation> namedAnimations;
    
    private AnimationController() {
        this.animations = new ArrayList<>();
        this.namedAnimations = new HashMap<>();
    }
    
    public static AnimationController getInstance() {
        if (instance == null) {
            instance = new AnimationController();
        }
        return instance;
    }
    
    public void addAnimation(Animation animation) {
        animations.add(animation);
    }
    
    public void addAnimation(String name, Animation animation) {
        namedAnimations.put(name, animation);
        animations.add(animation);
    }
    
    public Animation getAnimation(String name) {
        return namedAnimations.get(name);
    }
    
    public void removeAnimation(Animation animation) {
        animations.remove(animation);
    }
    
    public void removeAnimation(String name) {
        Animation anim = namedAnimations.remove(name);
        if (anim != null) {
            animations.remove(anim);
        }
    }
    
    public void update() {
        animations.removeIf(Animation::isFinished);
    }
    
    public void clear() {
        animations.clear();
        namedAnimations.clear();
    }
    
    public int getAnimationCount() {
        return animations.size();
    }
}