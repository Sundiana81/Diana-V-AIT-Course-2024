package classwork_05;

public class Maximum {
    public static void main(String[] args) {
        // vizov methoda
        int a = 45;
        int b = 34;

        int max = maximum(a, b);
        System.out.println("Maximum = " + max);
    }

    // merhod
    private static int maximum(int a, int b) {
        int max = 0;
        if (a >= b) {
            max = a;

        } else {
            max = b;
        }
        return max;
    }


}















