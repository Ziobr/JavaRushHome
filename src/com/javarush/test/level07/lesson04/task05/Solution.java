package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int[] bigArr = new int[20];
        int[] littleArr1 = new int[10];
        int[] littleArr2 = new int[10];

        for (int i = 0; i < bigArr.length; i++)
        {
            int tmp = scanner.nextInt();
            bigArr[i] = tmp;
            if (i<10)
                littleArr1[i] = tmp;
            else
                littleArr2[i-10] = tmp;
        }

        for (int i : littleArr2             )
        {
            System.out.println(i);
        }
    }
}
