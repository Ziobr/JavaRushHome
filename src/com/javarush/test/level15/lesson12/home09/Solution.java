package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int paramsStart = url.indexOf("?");
        String params = url.substring(paramsStart + 1);
        String[] paramsArr = params.split("&");
        List<ArrayList<String>> paramsList = new ArrayList<>();
        for (String s : paramsArr)
        {
            ArrayList<String> p = new ArrayList<>();
            if (s.contains("="))
            {
                p.add(s.substring(0,s.indexOf("=")));
                p.add(s.substring(s.indexOf("=") + 1 ,s.length()));
            }
            else
            {
                p.add(s);
                p.add("");
            }
            paramsList.add(p);
        }

        for (ArrayList<String> arrayList : paramsList)
        {
            System.out.print(arrayList.get(0) + " ");
        }

        System.out.println();
        for (ArrayList<String> arrayList : paramsList)
        {
            if(arrayList.get(0).equals("obj"))
            {
                try
                {
                    double dbl = Double.parseDouble(arrayList.get(1));
                    alert(dbl);
                }
                catch (Exception e)
                {
                    alert(arrayList.get(1));
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
