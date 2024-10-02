package classwork_09;
//Написать программу, выводящую на экран максимальное из трех целых чисел.
// Числа задайте самостоятельно внутри программы.
// Решите эту задачу с помощью тернарного оператора.

public class Homework_09_02Ter {

    public static void main(String[] args) {
        //znacenie

        int a = 60;
        int b = 70;
        int c = 34;

        // ispolzuem ternalnyj operator dlia nahozdenija max cisla

        int max = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

        System.out.println("Max number:" + max);

    }
}


