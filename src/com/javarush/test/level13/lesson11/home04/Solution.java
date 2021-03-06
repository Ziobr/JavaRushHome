package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        String fileName = reader.readLine();
        FileOutputStream outFile = new FileOutputStream(fileName);
        PrintStream printStream = new PrintStream(outFile);


        while(true)
        {
            String str = reader.readLine();
            strings.add(str);
            if (str.equals("exit")) break;
        }

        for (String string : strings)
        {
           printStream.println(string);
        }

        printStream.close();
        outFile.close();
        reader.close();
    }
}
