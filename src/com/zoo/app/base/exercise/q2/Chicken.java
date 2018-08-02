package com.zoo.app.base.exercise.q2;

import com.zoo.app.base.Animal;
import com.zoo.app.base.Bird;

/**
 * @author Kunal
 * @version 1.0
 * @see Animal
 * @see Bird
 * @since 02.08.2018
 * <p>
 * This is the Chicken class. This class extends {@link Bird}
 */
public class Chicken extends Bird {

    public static void main(String... args) {
        Chicken chicken = new Chicken();
        chicken.setCanMakeSound(true);
        chicken.setCanFly(false);
        chicken.setSound("Quack, quack");

        System.out.println("Sound: " + chicken.getSound());
        System.out.println("fly: " + chicken.isCanFly());
    }

}
