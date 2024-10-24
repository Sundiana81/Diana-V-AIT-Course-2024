package homework_30_02;
//Создайте массив действительных чисел на базе класса-обертки Double на 10 элементов,
// заполните его случайными числами в интервале от 0 до 10. Выполните сортровки:
//    ascending;
//    descending.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

    public class Array {

        public static void main(String[] args) {
            // Создаем массив на базе класса-обертки Double
            Double[] numbers = new Double[10];
            Random random = new Random();

            // Заполняем массив случайными числами в диапазоне от 0 до 10
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextDouble() * 10;
            }

            // Выводим оригинальный массив
            System.out.println("Original array:");
            printArray(numbers);

            // Сортировка по возрастанию
            Arrays.sort(numbers);
            System.out.println("Array sorted in ascending order:");
            printArray(numbers);

            // Сортировка по убыванию
            Arrays.sort(numbers, Comparator.reverseOrder());
            System.out.println("Array sorted in descending order:");
            printArray(numbers);
        }

        // Метод для вывода массива
        public static void printArray(Double[] array) {
            for (Double num : array) {
                System.out.printf("%.2f ", num);
            }
            System.out.println();
        }
    }


