package classwork_10;

public class Maxelement {

    public static void main(String[] args) {

        int[] ages = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18,38, 35, 41, 18, 43};

        int max = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if(ages[i] > max) { //ESLI MENSE MIN TO MIN MY EGO I DELAEM
                max = ages[i];

            }
        }
        System.out.println("Max age = " + max);

    }



}

