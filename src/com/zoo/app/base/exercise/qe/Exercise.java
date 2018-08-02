package com.zoo.app.base.exercise.qe;

import com.zoo.app.base.Animal;

public class Exercise {

    public static void main(String... args) {


        Animal[] animals = new Animal[]{

                new Animal(false, false, true, true, false, "Quack Quack"), //Duck
                new Animal(false, false, true, true, false, "Quack Quack"), //Duck

        };

        int swimCount = 0;
        int walkCount = 0;
        int singCount = 0;
        int flyCount = 0;

        for(Animal animal : animals){
            if(animal.isCanFly()){
                flyCount++;
            }

            if(animal.isCanWalk()){
                walkCount++;
            }

            if(animal.isCanSing()){
                singCount++;
            }

            if(animal.isCanSwim()){
                swimCount++;
            }
        }

    }

}
