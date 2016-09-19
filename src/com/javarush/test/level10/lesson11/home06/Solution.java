package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        boolean sex;
        int age;
        int height;
        int weight;
        String address;

        public Human(String name, boolean sex, int age, int height, int weight, String address)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.address = address;
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, int height)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }

        public Human(String name, boolean sex, int age, int height, int weight)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String address)
        {
            this.name = name;
            this.address = address;
        }

        public Human(String name, boolean sex, String address)
        {
            this.name = name;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, boolean sex, int age, String address)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
        }

        public Human(String name, boolean sex, int age, int height, String address)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.address = address;
        }
    }
}
