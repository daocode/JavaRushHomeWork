package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();

        int m1 = Integer.parseInt(n1);
        int m2 = Integer.parseInt(n2);
        int m3 = Integer.parseInt(n3);

        if(m1 != m2 && m1 != m3){
            if(m2 == m3);
            System.out.println(1);
        }
        if(m2 != m1 && m2 != m3){
            if(m1 == m3);
            System.out.println(2);
        }
        if(m3 != m2 && m3 != m1){
            if(m2 == m1);
            System.out.println(3);
        }



    }
}
