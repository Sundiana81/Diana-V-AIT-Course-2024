package homework_22_02;
//Создайте массив из 100 случайных целых чисел в интервале от -10 до 10.
// Подсчитайте, сколько в этом массиве оказалось:
//
//    положительных чисел;
//    отрицательных чисел;
//    четных чисел;
//    нулей. Реализуйте все подсчеты методами и напишите для них тесты.
import java.util.Random;

public class ArrayAnalyser {


    public static class ArrayAnalyzer {

        // Метод для создания массива из 100 случайных чисел в диапазоне от -10 до 10
        public int[] generateRandomArray() {
            Random random = new Random();
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(21) - 10; // Случайные числа от -10 до 10 (включительно)
            }
            return array;
        }

        // Метод для подсчета положительных чисел в массиве
        public int countPositiveNumbers(int[] array) {
            int count = 0;
            for (int num : array) {
                if (num > 0) {
                    count++;
                }
            }
            return count;
        }

        // Метод для подсчета отрицательных чисел в массиве
        public int countNegativeNumbers(int[] array) {
            int count = 0;
            for (int num : array) {
                if (num < 0) {
                    count++;
                }
            }
            return count;
        }

        // Метод для подсчета четных чисел в массиве
        //Оператор % (остаток от деления) используется для проверки, является ли число четным.
        // Если остаток от деления числа на 2 равен нулю, это означает, что число четное.
       // Условие num % 2 == 0 проверяет, является ли текущее число num четным.
        public int countEvenNumbers(int[] array) {
            int count = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    count++;
                }
            }
            return count;
        }

        // Метод для подсчета количества нулей в массиве
        public int countZeros(int[] array) {
            int count = 0;
            for (int num : array) {
                if (num == 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
