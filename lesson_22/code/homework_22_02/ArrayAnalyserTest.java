package homework_22_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class ArrayAnalyserTest {



        ArrayAnalyser.ArrayAnalyzer arrayAnalyzer = new ArrayAnalyser.ArrayAnalyzer();

        @Test
        public void testCountPositiveNumbers() {
            int[] array = {-5, 0, 3, 9, -2, 10, -1};
            assertEquals(3, arrayAnalyzer.countPositiveNumbers(array)); // 3 положительных числа: 3, 9, 10
        }

        @Test
        public void testCountNegativeNumbers() {
            int[] array = {-5, 0, 3, 9, -2, 10, -1};
            assertEquals(3, arrayAnalyzer.countNegativeNumbers(array)); // 3 отрицательных числа: -5, -2, -1
        }

        @Test
        public void testCountEvenNumbers() {
            int[] array = {-5, 0, 3, 9, -2, 10, -1};
            assertEquals(3, arrayAnalyzer.countEvenNumbers(array)); // 3 четных числа: 0, -2, 10
        }

        @Test
        public void testCountZeros() {
            int[] array = {-5, 0, 3, 0, -2, 10, -1};
            assertEquals(2, arrayAnalyzer.countZeros(array)); // 2 нуля
        }

        @Test
        public void testGenerateRandomArray() {
            int[] array = arrayAnalyzer.generateRandomArray();
            assertEquals(100, array.length); // Убедимся, что массив длиной 100 элементов
        }
    }

