package claswork_08;
//Задача 1.
//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.


import java.util.Scanner;

public class LettersinString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput string:");
        String str = scanner.nextLine();


        System.out.println(str);

        int l = str.length();
        System.out.println(l);
        int i = 0;
        // Diana
        // 01234
        while ( i < l ) {


            System.out.println(str.charAt(i));
            i++; // VYRASCIVANIE NA EDINICU  i = i + i

        }
    }
}
