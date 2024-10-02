package classwork_09;
//Написать программу, выводящую на экран максимальное из трех целых чисел.
// Числа задайте самостоятельно внутри программы.
// Решите эту задачу с помощью if ... else.


public class Homeworck_09_02 {

    public static void main(String[] args) {
        //ZADAEM ZNACENIE
        int a = 60;
        int b = 70;
        int c = 34;

        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Maximum number" + max);
    }
}

