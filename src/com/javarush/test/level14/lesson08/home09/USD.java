package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Ziobr on 20.09.2016.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return this.getClass().getSimpleName();
    }
}
