package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Ziobr on 16.10.2016.
 */
public class Sun implements Planet
{
    private static Sun instance;
    private Sun(){super();}

    public static Sun getInstance()
    {
        if (instance == null) instance = new Sun();
        return instance;
    }
}
