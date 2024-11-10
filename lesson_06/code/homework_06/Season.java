package homework_06;
//Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает, какому времени года принадлежит введенный месяц.

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of Season");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1 -> {
                System.out.println("January");
            }
            case 2 -> {
                System.out.println("February");
            }
            case 3 -> {
                System.out.println("March");
            }
            case 4 -> {
                System.out.println("April");
            }
            case 5 -> {
                System.out.println("May");
            }
            case 6 -> {
                System.out.println("June");
            }
            case 7 -> {
                System.out.println("Juli");
            }
            case 8 -> {
                System.out.println("August");
            }
            case 9 -> {
                System.out.println("September");
            }
            case 10 -> {
                System.out.println("Otober");
            }
            case 11 -> {
                System.out.println("November");
            }
            case 12 -> {
                System.out.println("December");
            }
            default -> System.out.println("wrong imput");

        }
        switch (monthNumber) {
            case 1, 2, 12 -> {
                System.out.println("This is WINTER");
            }
            case 3, 4, 5 -> {
                System.out.println("This is SPRING");
            }
            case 6, 7, 8 -> {
                System.out.println("This is SUMMER");
            }
            case 9, 10, 11 -> {
                System.out.println("This is AUTUM");
            }
            default -> System.out.println("Wrong imput!");
        }
    }
}


