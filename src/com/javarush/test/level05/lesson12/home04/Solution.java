package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        System.out.println(new MyDate(6, 9, 2016));

    }

    public static class MyDate{
        private String day;
        private String month;
        private String year;

        public MyDate(int day, int month, int year){
            if (day < 10)
                this.day = "0" + day;
            else
                this.day = "" + day;
            if (month < 10)
                this.month = "0" + month;
            else
                this.month = "" + month;
            this.year = "" + year;
        }

        @Override
        public String toString(){
            return day + " " + month + " " + year;
        }
    }
}
