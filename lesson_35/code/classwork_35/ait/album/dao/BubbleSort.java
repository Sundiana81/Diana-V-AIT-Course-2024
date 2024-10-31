package classwork_35.ait.album.dao;

import java.util.Random;

public class BubbleSort {

        public static void main(String[] args) {
            int[] sizes = {10, 100, 1000};
            for (int size : sizes) {
                int[] array = generateRandomArray(size, 1000);
                int operations = bubbleSort(array);
                System.out.println("Array size: " + size + ", Operations: " + operations);
            }
        }

        // Метод для сортировки пузырьком с подсчетом операций
        public static int bubbleSort(int[] array) {
            int n = array.length;
            int operations = 0; // счетчик операций
            boolean sort;

            for (int i = 0; i < n - 1; i++) {
                sort = false;
                for (int j = 0; j < n - i - 1; j++) {
                    operations++; // подсчет операции сравнения
                    if (array[j] > array[j + 1]) {
                        // Перестановка
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        sort = true;
                        operations++; // подсчет операции перестановки
                    }
                }
                if (!sort) break;
            }
            return operations;
        }

        // Метод для генерации массива случайных чисел
        public static int[] generateRandomArray(int size, int bound) {
            Random random = new Random();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(bound);
            }
            return array;
        }
    }


