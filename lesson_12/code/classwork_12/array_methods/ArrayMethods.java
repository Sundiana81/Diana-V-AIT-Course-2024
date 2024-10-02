package classwork_12.array_methods;

// /  - заполнение массива случайными целыми числами из интервала от a до b +
////  - печать массива целых чисел
//// - поиск эле

public class ArrayMethods {

    // fill array  i vernul zapilnenyj masiv
    // a - left border, b - RIGHT BORDER; n - quantity
    public static int[] fillArray(int a, int b, int n) {
        // objavliaem masiv
        int[] res = new int[n]; // n eto massivov skolko
        for (int i = 0; i < res.length; i++) { // STOLKO RAZ ZAPUSTIM
            res[i] = (int) (Math.random() * (b - a + 1) + a); // PRAVAJA GRANICA - LEVAJA PLIUS !77 kasting zadajom
            // math random datcik cluciainyh cisel
        }
        return res;
    }

    //print array
    public static void printArray(int[] array) { // KAKOJ MASIV POLUCIS TOT I PECIATAI
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");

        }
        System.out.println();
        System.out.println(".....................");
    }

    //search in array

    public static boolean searchInarray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;

            }

        }

        return false;
    }// end of method

}
