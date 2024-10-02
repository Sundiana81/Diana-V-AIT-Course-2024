package classwork_15.string_mrthods;

import java.util.Scanner;
// Напишите программу, которая запрашивает строку от пользователя и затем:
//
//    сообщает сколько слов в строке
//    сообщает сколько букв (символов) в строке
//    печатает строку задом наперед, начиная с последнего слова.

public class Homework_02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        // 1. сообщает сколько слов в строке
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words in the line: " + wordCount);

        // 2. сообщает сколько букв (символов) в строке
        int letterCount = input.length();
        System.out.println("Number of letters (symbols) in the line: " + letterCount);

        // 3.  печатает строку задом наперед, начиная с последнего слова.
        StringBuilder reversedString = new StringBuilder(); // Создается объект StringBuilder,
        // который используется для создания строки, начиная с последнего слова.
        // Цикл проходит по массиву слов в обратном порядке, добавляя каждое слово к StringBuilder.
        for (int i = wordCount - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" ");
            }
        }
        System.out.println("Line printed backwards, starting with the last word: " + reversedString.toString());

        // Close the scanner
        scanner.close();
    }
}



