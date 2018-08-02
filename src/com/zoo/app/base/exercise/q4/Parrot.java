package com.zoo.app.base.exercise.q4;

import com.zoo.app.base.Animal;
import com.zoo.app.base.Bird;
import com.zoo.app.base.exercise.q2.Duck;
import com.zoo.app.base.exercise.q3.Rooster;

/**
 * @author Kunal
 * @version 1.0
 * @see Animal
 * @see Bird
 * @since 02.08.2018
 * <p>
 * This is the Parrot class. This class extends {@link Bird}
 */
public class Parrot extends Bird {

    private Animal animal;

    public Parrot(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getSound() {
        return this.animal.getSound();
    }


    public static void main(String... args) {
        // Parrot near Duck.
        Duck duck = new Duck();
        duck.setSound("Quack, quack");
        duck.setCanMakeSound(true);
        Parrot duckNeighbor = new Parrot(duck);
        System.out.println(duckNeighbor.getSound());

        // Parrot near Rooster.
        Rooster rooster = new Rooster();
        rooster.setSound("Cock-a-doodle-doo");
        rooster.setCanMakeSound(true);
        Parrot roosterNeighbor = new Parrot(rooster);
        System.out.println(roosterNeighbor.getSound());
    }

}
