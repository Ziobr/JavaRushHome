package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        if ((i1> i2 && i1<i3) || (i1<i2 && i1> i3))
            System.out.println(i1);
        else if ((i2> i1 && i2< i3) || (i2< i1 && i2>i3))
            System.out.println(i2);
        else
            System.out.println(i3);
    }
}
