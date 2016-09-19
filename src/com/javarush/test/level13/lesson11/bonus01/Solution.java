package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fileReader =  new BufferedReader(new FileReader(fileName));
        ArrayList<Integer> inputInts = new ArrayList<>();

        while (true)
        {
            String str = fileReader.readLine();
            if (str == null || str.isEmpty()) break;

            Integer intToAdd = Integer.parseInt(str);
            if (intToAdd % 2 == 0)
                inputInts.add(intToAdd);
        }

        Collections.sort(inputInts);

        for (Integer i : inputInts)
        {
            System.out.println(i);
        }
    }
}

