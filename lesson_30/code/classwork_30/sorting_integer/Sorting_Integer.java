package classwork_30.sorting_integer;

import java.util.Arrays;

public class Sorting_Integer {
    public static void main(String[] args) {


        Integer[] numers = {
                -100,
                2,
                Integer.MIN_VALUE,
                2,
                15, 35,
                Integer.MIN_VALUE,
                71
        };

        Arrays.sort(numers, (n1, n2) -> Integer.compare(n2, n1));

        System.out.println(Arrays.toString(numers));
        // peciataem klasivo masiv , draft print
        // for each
        for (Integer i : numers) { // po kapotam i, iterator nasleduetsia dva metoda
            System.out.print(i + " ");  // i eto ibjekt

        }
    }
}