package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Ziobr on 23.10.2016.
 */
public class Plane implements Flyable
{
    private int passengers;
    public Plane (int passengers){
        this.passengers = passengers;
    }
    @Override
    public void fly()
    {

    }
}
