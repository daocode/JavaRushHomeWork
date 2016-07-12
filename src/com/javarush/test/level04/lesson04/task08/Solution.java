package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int a = Integer.parseInt(n);

        String m = reader.readLine();
        int b = Integer.parseInt(m);

        String s = reader.readLine();
        int c = Integer.parseInt(s);

        if ((a + b) < c) s = ("Треугольник не существует.");
        if ((a + b) > c) {
            if ((a + c) > b) {
                s = ("Треугольник не существует.");
                if ((c + b) > a) s = ("Треугольник существует.");
            } else s = ("Треугольник не существует.");

        } else s = ("Треугольник не существует.");


        System.out.println(s);


        //напишите тут ваш код

    }
}