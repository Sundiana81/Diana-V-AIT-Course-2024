package classwork_14;
//сравниваем всегда 2 соседних элемента, переставляем их местами, если они расположены не в порядке возрастания
// цикл должен идти слева направо
// упорядоченные элементы выключаются из цикла

public class ArrayMethods {

    public  static void bubbleSort (int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1 -i; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j +1] = temp;
                }
            }
        }
    }
//-----------------------------------------------------------------------------------------

 // array turn around,reverse     razvorot masiva
    // step 1 metod swap
// METOD POMENIAT
    public static void  swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    //METOD VYZVAT
//eto razvorot masiva
    // dlia razvorota my dolzny pomeniat mestami
      // step 2 reverse array
    public static void reverseArray(int[] array){              // j pravyj indeks masiva
        for (int i = 0, j = array.length -1; i < j; i++, j--) {// idut na vstreciu drug drugu poka i menise j
            swap(array, i, j);
        }


    }










//______________________________________________________________________________________________________________

// /  - заполнение массива случайными целыми числами из интервала от a до b +
////  - печать массива целых чисел
//// - поиск элеlementa

    // O(long(n))
    // binary search

    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length -1;// indeks mid eto seredina indeksa

        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            if(array[midIndex] == n){
                return midIndex;

            } else if (n < array[midIndex]) { // esli mense
                rightIndex = midIndex -1;// pravuju polovinu otbrasyvaem
            }else {
                leftIndex = midIndex + 1;// levuju nado otbrosit
            }
        }
        return -leftIndex -1;  // testiruem s levogo tak udobnee


    }


     // 0(n) - cem bolse elementov v masive tem bolse rabotaet metod

      // linear search, return index elementy togo vto naidiot( if element absent return - 1 )
     // esli metod vernul - 1 to lement nenaiden
    public static int  lineasSearch(int[] array, int n ){
        for (int i = 0; i < array.length; i++) {
          if(array[i] == n ){
              return i; // i eto  indeks kotojyj nam nuzen pervyj popavsijsia // go out from method

          }

        }
        return -1; // nesucestvujuscij indeks
    }






    //-------------------------------------------------------------------------------------------------

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
