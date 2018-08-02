package com.zoo.app.base.exercise.q3;

import com.zoo.app.base.Animal;
import com.zoo.app.base.Bird;
import com.zoo.app.base.exercise.q2.Chicken;

/**
 * @author Kunal
 * @version 1.0
 * @see Animal
 * @see Bird
 * @see Chicken
 * @since 02.08.2018
 * <p>
 * This is the Chicken class. This class extends {@link Bird}
 */
public class Rooster extends Chicken {


    public static void main(String... args) {
        Rooster rooster = new Rooster();
        rooster.setCanMakeSound(true);
        rooster.setSound("Cock-a-doodle-doo");
        System.out.println(rooster.getSound());
    }

}
