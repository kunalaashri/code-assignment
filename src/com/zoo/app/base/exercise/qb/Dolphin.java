package com.zoo.app.base.exercise.qb;

import com.zoo.app.base.Animal;

/**
 * @author Kunal
 * @version 1.0
 * @see Animal
 * @since 02.08.2018
 * <p>
 * This is the Dolphin class. This class extends {@link Animal}
 */
public class Dolphin extends Animal {

    public static void main(String... args) {
        Dolphin dolphin = new Dolphin();
        dolphin.setCanSwim(true);
        System.out.println(dolphin.isCanSwim());
    }
}
