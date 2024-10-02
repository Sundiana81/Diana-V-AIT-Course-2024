public class Homework_13_01 {
    //  Написать метод copyOfArray.
    //  Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
    //  Метод должен создать новый массив длиной newLength.
    //  В новый массив должны быть скопированы элементы из входящего массива: Пример:
    //  Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

    public static int[] copyOfArray(int[] array, int newLength) { // metod kopirovanij masiva

        int[] newArray = new int[newLength]; // sozdajem novyj masiv s ukazanoj dlinoj
        int lengthToCopy = Math.min(array.length, newLength); // opredeliaem min dlinu dlia kopirovanija



        for (int i = 0; i < lengthToCopy; i++) { // kopiruem elementy iz ishodnogo masiva v novyj
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6}; // ishodnyj masiv
        int newLength = 3; // novaja dlinna

        int[] result = copyOfArray(array, newLength); //kopirovanija massiva

        // vivod novogo masiva
        for (int i :  result) {
            System.out.print(i + " ");
        }
    }
}

