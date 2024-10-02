package classwork_10;
//Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
// Распечатать массив в порядке возрастания, затем в порядке убывания.

import java.util.Arrays;

public class Homework_10_02 {

    public static void main(String[] args) {
        // Создаём массив для четных чисел от 0 до 50
        int[] evenNumbers = new int[26]; // 26 четных чисел от 0 до 50

        // Заполняем массив четными числами
        int index = 0;
        for (int i = 0; i <= 50; i += 2) {
            evenNumbers[index] = i;
            index++;
        }

        // Выводим массив в порядке возрастания
        System.out.println("Массив в порядке возрастания: " + Arrays.toString(evenNumbers));

        // Выводим массив в порядке убывания
        System.out.print("Массив в порядке убывания: [");
        for (int i = evenNumbers.length - 1; i >= 0; i--) {
            System.out.print(evenNumbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
