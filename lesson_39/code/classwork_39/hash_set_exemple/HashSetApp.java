package classwork_39.hash_set_exemple;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(4,0.5F);// указаны собственные capacity и loadFactor
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        System.out.println(numbers.size());
        System.out.println("-------------------------");
        for (Integer i: numbers ) {
            System.out.println(i);
        }
        numbers.add(50);
        for (Integer i: numbers ) {
            System.out.println(i);
        }
    }
}
