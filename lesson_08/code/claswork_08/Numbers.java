package claswork_08;

//Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

public class Numbers {

    public static void main(String[] args) {

        int i = 1; // parametr cikla
        int y = 100;

        while (i <= y) {
            if (i % 5 == 0) { // 26 % 5 = 5 * 5 + 1
                System.out.print(i + " ");

            }
            // simvol probela kod 32 // ubrat ( ln) printl
            i++; // POSTFIKSNAJA OPIRACIJA, UVELICIVAET NA 1


        }


    }


}
