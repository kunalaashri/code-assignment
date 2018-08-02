package com.zoo.app.base.exercise.q2;

import com.zoo.app.base.Animal;
import com.zoo.app.base.Bird;

/**
 * @author Kunal
 * @version 1.0
 * @see Animal
 * @see com.zoo.app.base.Bird
 * @since 02.08.2018
 * <p>
 * This is the Duck class. This class extends {@link com.zoo.app.base.Bird}
 */
public class Duck extends Bird {


    public static void main(String... args) {
        Duck duck = new Duck();
        duck.setCanMakeSound(true);
        duck.setCanSwim(true);
        duck.setSound("Cluck, cluck");
        System.out.println("Sound: " + duck.getSound());
        System.out.println("swim: " + duck.isCanSwim());
    }
}
