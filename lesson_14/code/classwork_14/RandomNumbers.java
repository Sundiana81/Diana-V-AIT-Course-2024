package classwork_14;

//**Задача 1.**
//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//Выполните сортировку полученного массива.
//Попало ли число 0 в этот массив? (выяснить с помощью binary search)
//Если да, то на какое место (индекс) в массиве?
//Если нет, то на какой индекс его следует поставить?

public class RandomNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[20];

        numbers = ArrayMethods.fillArray(-100, 100,20);    // tip ne void polozili v nombers
        ArrayMethods.printArray(numbers); //print
        // sortiruem
        ArrayMethods.bubbleSort(numbers);
        ArrayMethods.printArray(numbers); //rint
        int index = ArrayMethods.binarySearch(numbers, 0);

        index = (index > 0) ? index : -index -1;
        System.out.println(index);



    }
}
