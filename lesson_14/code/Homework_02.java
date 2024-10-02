import java.util.Random;

//Для решения задачи "поиск счастливого пельменя" мы можем использовать алгоритм взвешивания.
// У нас есть 30 пельменей, один из которых весит на 15 грамм больше остальных.
// Чтобы найти "счастливый пельмень", мы можем использовать метод последовательного взвешивания.
public class Homework_02 {

    public static void main(String[] args) {

        int[] dumplings = new int[30];
        for (int i = 0; i < dumplings.length; i++) {
            dumplings[i] = 50;
        }

        Random random = new Random();
        int luckyIndex = random.nextInt(dumplings.length);
        dumplings[luckyIndex] = 65;

        System.out.println("Index of lucky dumpling: " + luckyIndex);


        int foundIndex = -1;
        for (int i = 0; i < dumplings.length; i++) {
            if (dumplings[i] > 50) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Lucky dumpling on position: " + foundIndex);
        }

    }

}