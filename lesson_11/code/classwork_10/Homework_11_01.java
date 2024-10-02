package classwork_10;
//У стрелка есть 10 попыток поразить мишень. Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок? Попал ли он хоть раз в центр мишени?
import java.util.Random;

public class Homework_11_01 {
    public static void main(String[] args) {

        Random random = new Random() ; // sdelali objekt
        int[] shoots = new int[10]; // massiv dlia rezultatov

        for (int i = 0; i < shoots.length; i++) {
            int shoot = random.nextInt(11);
            shoots[i] = shoot;
            System.out.print(shoots[i] + " ");
        }
        System.out.println(); //novaja strocka

        int sum = 0; // объявили переменную

        for (int i = 0; i < shoots.length; i++) {
            sum = sum + shoots[i];
        }

        System.out.println("Result = " + sum);

        boolean apple = false;

        for (int i = 0; i < shoots.length; i++) {
            if( shoots[i] == 10 ){
                apple = true;
            }
        }

        System.out.println("Hit the apple: " + apple);

    }
}


