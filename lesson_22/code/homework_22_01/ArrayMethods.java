package homework_22_01;

public class ArrayMethods {

    public int sumOddIndexElements(int[] array) {
        int sum = 0;  // Переменная для хранения суммы элементов с нечетными индексами

        // Цикл, который начинается с индекса 1 (нечетный) и увеличивается на 2 на каждой итерации
        for (int i = 1; i < array.length; i += 2) {//Начинается с индекса 1,
            // что соответствует первому элементу с нечетным индексом.
            sum += array[i];//На каждой итерации мы берем элемент массива с
            // текущим нечетным индексом i и прибавляем его к переменной sum.
        }


        return sum;  // Возвращаем итоговую сумму
    }
    // Метод для поиска 5-го элемента массиваМетод findFifthElement проверяет,
    // что в массиве достаточно элементов, и если это так, возвращает пятый элемент.
    // Если элементов меньше 5, он выбрасывает исключение с объяснением ошибки.
    public int findFifthElement(int[] array) {
        if (array.length < 5) {
            throw new IllegalArgumentException("Array must contain at least 5 elements.");
        }
        return array[4];
    }



    }




