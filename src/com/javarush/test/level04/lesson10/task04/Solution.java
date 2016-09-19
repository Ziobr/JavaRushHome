package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int i1 = 10;
        while (i1 > 0){
            int i2 = 10;
            while (i2 > 0){
                System.out.print("S");
                i2--;
            }
            System.out.println();
            i1--;
        }

    }
}
