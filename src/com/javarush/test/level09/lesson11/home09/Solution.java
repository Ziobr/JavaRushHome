package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Васька", new Cat("Васька"));
        catMap.put("Пушок", new Cat("Пушок"));
        catMap.put("Дымок", new Cat("Дымок"));
        catMap.put("Рыжик", new Cat("Рыжик"));
        catMap.put("Пират", new Cat("Пират"));
        catMap.put("Аксель", new Cat("Аксель"));
        catMap.put("Том", new Cat("Том"));
        catMap.put("Матроскин", new Cat("Матроскин"));
        catMap.put("Леопольд", new Cat("Леопольд"));
        catMap.put("Гарфилд", new Cat("Гарфилд"));

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<>();
        for (Map.Entry<String, Cat> catEntry: map.entrySet())
        {
            catSet.add(catEntry.getValue());
        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
