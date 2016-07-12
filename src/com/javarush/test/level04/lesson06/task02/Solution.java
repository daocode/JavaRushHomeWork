package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();

        int a = Integer.parseInt(n), b = Integer.parseInt(n1),
                c = Integer.parseInt(n2), d = Integer.parseInt(n3);

        if(a > b && a > c && a > d) System.out.println(a);
        if(b > a && b > c && b > d) System.out.println(b);
        if(d > c && d > a && d > b) System.out.println(d);
        if(c > a && c > b && c > d) System.out.println(c);


    }
}
