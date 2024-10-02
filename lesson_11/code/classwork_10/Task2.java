package classwork_10;

//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.
//Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
//Найдите максимальный элемент массива и его индекс.
//Поменяйте местами минимальный и максимальный элементы, распечатайте массив.

public class Task2 {

    public static void main(String[] args) {

        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};
                                                            // min 5, max 6
        int minOfArray = array[0]; //gess, predpolozenie
        int indexOfMinElement = 0;  // gess , predpolozenie

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= minOfArray) {
                minOfArray = array[i];
                indexOfMinElement = i;

            }

        }
        System.out.println("Min element of array = " + minOfArray + " , index of min element = " + indexOfMinElement);

        int maxOfArray = array[0]; //gess, predpolozenie
        int indexOfMaxElement = 0;  // gess , predpolozenie

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= maxOfArray) {
                maxOfArray = array[i];
                indexOfMinElement = i;

            }

        }
        System.out.println("Max element of array = " + maxOfArray + " , index of min element = " + indexOfMinElement);
        int temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMaxElement];
        array[indexOfMaxElement] = temp;

        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("rezultat");  // tekuscij element masiva

        }
        System.out.println(); // NEXT LINE
    }



}