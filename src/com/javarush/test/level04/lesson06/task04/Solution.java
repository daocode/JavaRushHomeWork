package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String m = reader.readLine();

        int n1 = n.length();
        int m1 = m.length();

        if (n.equals(m)) System.out.println("Имена идентичны");
        else if (n1 == m1) System.out.println("Длины имен равны");

    }
}
