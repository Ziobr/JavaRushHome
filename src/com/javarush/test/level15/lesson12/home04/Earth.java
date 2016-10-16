package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Ziobr on 16.10.2016.
 */
public class Earth implements Planet
{
    private static Earth instance;
    private Earth(){super();}

    public static Earth getInstance()
    {
        if (instance == null) instance = new Earth();
        return instance;
    }
}