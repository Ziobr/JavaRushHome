package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Ziobr on 19.09.2016.
 */
public class Computer
{
    private Keyboard Keyboard;
    private Mouse Mouse;
    private Monitor Monitor;

    public Computer()
    {
        this.Keyboard = new Keyboard();
        this.Mouse = new Mouse();
        this.Monitor = new Monitor();
    }

    public Keyboard getKeyboard()
    {
        return Keyboard;
    }

    public Mouse getMouse()
    {
        return Mouse;
    }

    public Monitor getMonitor()
    {
        return Monitor;
    }
}
