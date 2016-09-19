package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        arrayList.add(temp);
        int minSize = temp.length();
        for (int i = 1; i < 5; i++)
        {
            temp = scanner.nextLine();
            arrayList.add(temp);
            if (temp.length() < minSize)
                minSize = temp.length();
        }

        for (String s : arrayList)
        {
            if (s.length() == minSize)
                System.out.println(s);
        }
    }
}