package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());

        int max=1;

        if (i1 > i2)
        {
            for (int i = 1; i < i2; i++)
            {
                if (i1 % i == 0 && i2 %i == 0)
                    max = i;
            }
        }
        else
        {
            for (int i = 1; i < i1; i++)
            {
                if (i1 % i == 0 && i2 %i == 0)
                    max = i;
            }
        }

        System.out.println(max);
    }
}
