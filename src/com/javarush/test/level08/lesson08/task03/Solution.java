package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Иван"));
        System.out.println(getCountTheSameLastName(map, "Иванов"));
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Иванников", "Петр");
        map.put("Петров", "Иван");
        map.put("Васильев", "Василий");
        map.put("Кузнецов", "Иван");
        map.put("Сидоров", "Сидор");
        map.put("Александров", "Иван");
        map.put("Алексеев", "Александр");
        map.put("Сергеев", "Александр");
        map.put("Рабинович", "Абрам");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            if (entry.getValue().equals(name))
                count ++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            if (entry.getKey().equals(lastName))
                count ++;
        }
        return count;
    }
}
