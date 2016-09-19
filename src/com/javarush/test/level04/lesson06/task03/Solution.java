package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();

        if (i1 > i2 && i1> i3)
            System.out.println(i1 + " " + Math.max(i2, i3) + " " + Math.min(i2, i3));
        else if (i2 > i1 && i2> i3)
            System.out.println(i2 + " " + Math.max(i1, i3) + " " + Math.min(i1, i3));
        else
            System.out.println(i3 + " " + Math.max(i1, i2) + " " + Math.min(i1, i2));

    }
}
