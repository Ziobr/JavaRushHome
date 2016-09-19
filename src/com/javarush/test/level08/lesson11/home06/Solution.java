package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("Ch1", true, 15);
        Human child2 = new Human("Ch2", false, 10);
        Human child3 = new Human("Ch3", true, 5);

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("F", true, 35, children);
        Human mother = new Human("M", false, 33, children);

        ArrayList<Human> parent1 = new ArrayList<>();
        parent1.add(father);

        ArrayList<Human> parent2 = new ArrayList<>();
        parent2.add(mother);

        Human grandFather1 = new Human("GF1", true, 65, parent1);
        Human grandMother1 = new Human("GM1", false, 62, parent1);
        Human grandFather2 = new Human("GF2", true, 61, parent2);
        Human grandMother2 = new Human("GM2", false, 60, parent2);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather1);
        System.out.println(grandMother2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
