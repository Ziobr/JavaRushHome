package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Ziobr on 16.10.2016.
 */
public class Moon implements Planet
{
    private static Moon instance;
    private Moon(){super();}

    public static Moon getInstance()
    {
        if (instance == null) instance = new Moon();
        return instance;
    }
}
