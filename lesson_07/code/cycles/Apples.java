package cycles;
// Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины до тех пор,
// пока они там есть. Последнее сообщение: "Яблоки кончились!".

public class Apples {

    public static void main(String[] args) {

        int apples = 30; // nacialnye dannye
        int count = 0; // parametr cikla
        int startApples = 30;

        while (count < 30) {

            System.out.println("Take one apple from the basket");
            apples = apples - 1;
            count = count + 1;
            System.out.println("Now we have only" + apples + " in the basket.");



        }
        System.out.println("The job is done!" + " apples added in the pie");




    }
}
