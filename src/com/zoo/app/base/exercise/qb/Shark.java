package com.zoo.app.base.exercise.qb;


import com.zoo.app.base.Animal;

/**
 * @author Kunal
 * @version 1.0
 * @see Animal
 * @see Fish
 * @since 02.08.2018
 * <p>
 * This is the Shark class. This class extends {@link Fish}
 */
public class Shark extends Fish {

    @Override
    public String size() {
        return "large";
    }

    @Override
    public String color() {
        return "grey";
    }

    public String eats() {
        return "Fish";
    }

    public static void main(String... args) {
        Shark shark = new Shark();
        System.out.println("color : " + shark.color());
        System.out.println("size : " + shark.size());
    }
}
