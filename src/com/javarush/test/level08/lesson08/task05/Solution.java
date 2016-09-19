package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        System.out.println(map);
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, Integer> counter = new HashMap<>();
        for (Map.Entry<String, String> keyValuePair : map.entrySet())
        {
            String name = keyValuePair.getValue();
            if (!counter.keySet().contains(name))
                counter.put(name, 1);
            else
                counter.put(name, counter.get(name) + 1);
        }

        for (Map.Entry<String, Integer> pair: counter.entrySet())
        {
            if (pair.getValue() > 1)
                removeItemFromMapByValue(map, pair.getKey());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
