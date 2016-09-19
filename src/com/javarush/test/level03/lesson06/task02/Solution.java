package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        for (int i = 1; i<11; i++){
            printTableRow(i);
        }
    }

    public static void printTableRow(int i1){
        for (int i2 = 1; i2<11; i2++){
            System.out.print(i1 * i2 );
            if (i2<10){
                System.out.print(" ");}
            else{
                System.out.println();
            }
        }
    }
}