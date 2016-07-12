package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String n1 = reader.readLine();
        String n2 = reader.readLine();

        int a = Integer.parseInt(n), b = Integer.parseInt(n1),
                c = Integer.parseInt(n2), a1=0, b1=0, c1=0;

        if (a > c || b > c) {
            if (a > b && a > c) {
                a1 = a;
                if (b > c) {
                    b1 = b;
                    c1 = c;
                }
                else {
                    b1 = c;
                    c1 = b;
                }
            }

            if (b > a && b > c) {
                a1 = b;
                if (a > c) {
                    b1 = a;
                    c1 = c;
                }
                else {
                    b1 = c;
                    c1 = a;
                }
            }

        } else if (c > b && c > a) {
            a1 = c;
            if(a > b) {
                b1 = a;
                c1 = b;
            }
            else {
                b1 = b;
                c1 = a;
            }
        }
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
    }

}