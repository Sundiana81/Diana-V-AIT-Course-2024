package classwork_05;

//Проверка положительное или отрицательное число.
//Проверка четное или нечетное целое число.
//Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
//прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".

public class ConditionsEx {

    public static void main(String[] args) {

        int x = 158;

        if (x > 0) {
            System.out.println(" x =" + x + " is positive number");

        }

        if (x < 0) {
            System.out.println(" x =" + x + " is negative number");
        }

// polnyj uslobnyj operator

        x = 234;

        if (x > 0) {
            System.out.println(" x =" + x + " is positiv number");

        } else {
            System.out.println(" x =" + x + " is negative number");

        }

        x = 111;

        if (x % 2 == 0) {
            System.out.println(" x = " + x + " is even");

        } else {
            System.out.println("x =" + x + " ist odd");
        }

        int age = 20;
        if (age >= 18) {
            System.out.println("Go");
        } else {
            System.out.println("Not go");
        }
    }

}// end of main

