package com.zoo.app.base.exercise.qd;

import com.zoo.app.base.Animal;

public class Insect extends Animal {


    public static void main(String... args) {
        Insect butterfly = new Insect();
        butterfly.setCanFly(true);
        butterfly.setCanMakeSound(false);

        System.out.println("Fly: " + butterfly.isCanFly());
        System.out.println("Sound: " + butterfly.isCanMakeSound());

        Insect caterpillar = new Insect();
        caterpillar.setCanFly(false);
        caterpillar.setCanWalk(true);

        System.out.println("Fly: " + caterpillar.isCanFly());
        System.out.println("Walk: " + caterpillar.isCanWalk());
    }

}
