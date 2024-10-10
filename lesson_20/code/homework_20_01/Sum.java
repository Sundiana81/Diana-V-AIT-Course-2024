package homework_20_01;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        // vvodim cisla s probelom
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of integers separated by spaces:");
        String input = scanner.nextLine();

        // metod split razbivaet stroku na otdelnye cisla
        String[] numbers = input.split(" ");

        // zavodim peremennyu dlia hranenija summy
        int sum = 0;

        // kazdoe cislo preobrazuetsia iz stroki v celoe cislo s ispolzovaniem, OBIORTKI

        // for (String число : числа): Это цикл for-each, который перебирает массив строк числа.
        // В каждой итерации переменная число принимает значение одного из элементов массива.
        //Integer.parseInt(число): Метод Integer.parseInt() преобразует строковое представление числа в целое число (int).
        //сумма += Integer.parseInt(число): Преобразованное число добавляется к переменной сумма с помощью оператора +=.

        for (String number : numbers) { // cikl for-each perebiraet masiv strok cisla
            sum += Integer.parseInt(number); //преобразует строковое представление числа в целое число (int).
            // Преобразованное число добавляется к переменной сумма с помощью оператора +=.
        }

        // summa vvedionyh cisel
        System.out.println("The sum of the entered integers is: " + sum);


    }
}


