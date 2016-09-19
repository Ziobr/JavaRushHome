package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] outArray = new ArrayList[3];
        outArray[0] = new ArrayList<String>();
        outArray[0].add("ololo");
        outArray[0].add("alalala");

        outArray[1] = new ArrayList<>();
        outArray[1].add("hahaha");
        outArray[1].add("hehehehe");

        outArray[2] = new ArrayList<>();
        outArray[2].add("foo");
        outArray[2].add("egg");

        return outArray;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}