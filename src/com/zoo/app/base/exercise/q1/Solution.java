package com.zoo.app.base.exercise.q1;

/**
 * @author Kunal
 * @version 1.0
 * @since 02.08.2018
 *
 * This is solution of the first exercise.
 * @see com.zoo.app.base.Animal
 * @see com.zoo.app.base.Bird
 */
import com.zoo.app.base.Bird;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.setCanFly(true);
        bird.setCanSing(true);
        bird.setCanFly(true);

        System.out.println("Can walk: " + bird.isCanWalk());
        System.out.println("can fly:" + bird.isCanFly());
        System.out.println("can sing"+ bird.isCanSing());
    }
}