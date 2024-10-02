package classwork_10;

//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        Random random = new Random(); // sdelali objekt v moment obrascenija smesivaet s formulai //
        // i predostovsiaet nam sluciajnye cisla
        int[] toss = new int[20];


        // fill in
        for (int i = 0; i < toss.length; i++) { // dast 20 popytok
            // vyzov datcika cluciajnyx cisel
            int n = random.nextInt(6) + 1; // prisvoenie. diapizon ot 0-5(vkliucena)+1 ctody sdvinut deapozon
            // 0102000222033345   // togda bez 0 i 17364
            toss[i] = n ;
            System.out.print(n + " ");

        }
        System.out.println(); // pustaja strocka


        // skolko vipodal kakaja gran vypola
        int[] res = new int[6]; // PODGOTOTLINYE MASIVY Ih 6 // INDEKSAV 5
        // array for resulta
        for (int i = 0; i < toss.length; i++) {
            int n = toss[i];
            switch (n) {
                case 1 -> res[0]++;
                case 2 -> res[1]++;
                case 3 -> res[2]++;
                case 4 -> res[3]++;
                case 5 -> res[4]++;
                case 6 -> res[5]++;

            }

        }
        //print res
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }
    }
}