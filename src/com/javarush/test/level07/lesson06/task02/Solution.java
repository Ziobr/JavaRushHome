package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
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
        int maxSize = 0;
        for (int i = 0; i < 5; i++)
        {
            String temp = scanner.nextLine();
            arrayList.add(temp);
            if (temp.length() > maxSize)
                maxSize = temp.length();
        }

        for (String s :arrayList)
        {
            if (s.length() == maxSize)
                System.out.println(s);
        }
    }
}
