
import java.util.Scanner;


public class Homework_03 {


    //В сберкассу на трёхпроцентный вклад положили s рублей. Какой станет сумма вклада через n лет.
    // Использовать цикл for.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input ruble: ");
        double s = scanner.nextDouble();

        System.out.print("Input years: ");
        int n = scanner.nextInt();

        double procent = 3;


        for (int i = 0; i < n; i++) {
            s *= (1 + procent / 100); }


        System.out.printf("Input years %d years: %.2f ruble%n", n, s);
    }

}