package com.zoo.app.base;

/**
 * @author Kunal
 * @version 1.0
 * @since 02.08.2018
 * <p>
 * This is the base class. This class shall be extended by the all related sub classes.
 */
public class Animal {

    private boolean canWalk;
    private boolean canSing;
    private boolean canSwim;
    private boolean canMakeSound;
    private boolean canFly;
    private String sound;

    public Animal() {

    }

    public Animal(boolean canWalk, boolean canSing, boolean canSwim, boolean canMakeSound, boolean canFly, String sound) {
        this.canWalk = canWalk;
        this.canSwim = canSwim;
        this.canSing = canSing;
        this.canMakeSound = canMakeSound;
        this.canFly = canFly;
        this.sound = sound;
    }


    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    public boolean isCanSing() {
        return canSing;
    }

    public void setCanSing(boolean canSing) {
        this.canSing = canSing;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCanMakeSound() {
        return canMakeSound;
    }

    public void setCanMakeSound(boolean canMakeSound) {
        this.canMakeSound = canMakeSound;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}