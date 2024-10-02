package classwork_07;
//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits {


    public static void main(String[] args) {

        // 5 467
        // ------------
        // 5 467 % 10 = 7 - eto nasha c prava pervaja cifra ostatok
        // 5 467 / 10 = 546
        // prodolzym delenie na 10 poka rezultat > 0


        Scanner scanner = new Scanner(System.in);
        System.out.println("Imout....");
        int number = scanner.nextInt();
        int number1 = number;



        int count = 0;

        while (number > 0){

            number= number / 10; // number parametr cikla
            System.out.println(number);
            count = count + 1; // uvelicivaem na edinicu  skolko cifr v cisle


        }

        System.out.println("Digint in number" + number1 + " are =" + count);





    }
}
