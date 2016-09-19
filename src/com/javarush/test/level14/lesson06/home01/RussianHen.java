package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ziobr on 18.09.2016.
 */
public class RussianHen extends Hen
{
    private static final int eggCount = 5;
    private String country;

    public RussianHen(String country)
    {
        this.country = country;
    }

    @Override
    public int getCountOfEggsPerMonth()
    {
        return eggCount;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
