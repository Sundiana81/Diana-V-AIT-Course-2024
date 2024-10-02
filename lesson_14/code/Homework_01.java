
// Часть1. Заполните массив целыми числами от 1 до 100. Создайте второй массив с размером на 1 больше, чем имеющийся.
// Скопируйте первый массив в новый массив.
// Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
// Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.

import java.util.Arrays;
import java.util.Random;

 public class Homework_01 {

    public static void main(String[] args) {

        int[] array = new int[100]; // sozdajem i zapolniaem masiv
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int[] newArray = new int[array.length + 1]; // sozdajem na odim masiv bolse

        System.arraycopy(array, 0, newArray, 0, array.length); // kopi 1 na 2 []

        System.out.println("Original array: " + Arrays.toString(array));


        Random random = new Random();
        int randomNum = random.nextInt(100) + 1; //dobolviaem sluciainoe cislo
        int randomIndex = random.nextInt(newArray.length); // sluciainyj index


        for (int i = newArray.length - 1; i > randomIndex; i--) { // vstavliaem sluciajnoe cislo v novyj []
            newArray[i] = newArray[i - 1]; //sdvigaem element v pravo
        }
        newArray[randomIndex] = randomNum;

        System.out.println("Array after inserting random number: " + Arrays.toString(newArray));

        for (int i = 0; i < newArray.length; i++) {
            if (i >= array.length || array[i] != newArray[i]) { // nahodim dobavlenoe cislo
                System.out.println("Added number: " + newArray[i]);
                break;
            }
        }
    }
}

