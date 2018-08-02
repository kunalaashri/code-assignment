package com.zoo.app.base.exercise.qb;

import com.zoo.app.base.Animal;

/**
 * @author Kunal
 * @version 1.0
 * @see Animal
 * @see Fish
 * @since 02.08.2018
 * <p>
 * This is the Clownfish class. This class extends {@link Fish}
 */
public class Clownfish extends Fish{

    @Override
    public String size(){
        return "small";
    }

    @Override
    public String color(){
        return "orange";
    }

    public String demeanor(){
        return "cracks jokes";
    }

    public static void main(String...args){
        Clownfish clownfish = new Clownfish();
        System.out.println("color : " + clownfish.color());
        System.out.println("demeanor : " + clownfish.demeanor());
        System.out.println("size : " + clownfish.size());
    }
}
