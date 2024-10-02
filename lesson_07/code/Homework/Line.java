package Homework;
import java.util.Scanner;

// Задача 1. Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз. Пример: строка - молоко, кол-во раз 3 молоко молоко молоко

public class Line {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите какое слово повторять");
        String word = scanner.nextLine();


        System.out.println("Сколько раз писать слово " +word+ " ?");
        int times = scanner.nextInt();

        while(times > 0) {
            times--;
            System.out.println(word);
        }
    }
}
