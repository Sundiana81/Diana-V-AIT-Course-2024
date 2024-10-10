package classwork_20.application;

public class ArgAppl {
    public static void main(String[] args) {  // massi zavut args

        // metod main poluciaet v () argumenty
        // String[] args - eto macciv dannyx tipa String, arg - eto imia massiva


        String str1 = args[0];
        int n1 = Integer.parseInt(str1);


        String str2 = args[1];
        int n2 = Integer.parseInt(str2);


        System.out.println(str1 + " * " + str2 + " = " + n1 * n2);






    }

}
