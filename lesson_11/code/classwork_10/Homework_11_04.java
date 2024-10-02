package classwork_10;
//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива и его индекс.
// Поставьте этот элемент в начало массива вместо имеющегося.

public class Homework_11_04 {

    public static void main(String[] args) {
        // Исходный массив
        int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

        // Инициализируем переменные для хранения максимального значения и его индекса
        int maxIndex = 0;
        int maxValue = array[0];

        // Проходим по массиву, чтобы найти максимальное значение и его индекс
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        // Выводим максимальное значение и его индекс
        System.out.println("Максимальный элемент: " + maxValue);
        System.out.println("Индекс максимального элемента: " + maxIndex);

        // Меняем местами максимальный элемент и первый элемент массива
        int temp = array[0];
        array[0] = maxValue;
        array[maxIndex] = temp;

        // Выводим обновленный массив
        System.out.println("Обновленный массив:");
        for (int num : array) {
            System.out.print(num + ", ");
        }
    }
}



