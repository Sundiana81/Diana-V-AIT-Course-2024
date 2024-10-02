import java.util.Scanner;

public class Homework_12_01 {
    //Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
    // Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value n: ");
        int n = scanner.nextInt();


        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }


        System.out.println("Amount: " + sum); // SUMMA + SUM


    }
}

