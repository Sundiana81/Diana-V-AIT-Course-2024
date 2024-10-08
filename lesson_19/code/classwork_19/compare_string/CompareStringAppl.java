package classwork_19.compare_string;
// ravenstvo strok _ kak poniat?

public class CompareStringAppl {

    public static void main(String[] args) {

       int x = 5; // stek
       int y = 5; // stek

        boolean checker = (x == y);

        System.out.println(checker);

       String str1 = "Europe"; // str1 - stack => (link) Europe _ heap
       String str2 = "Europe"; // str2 -stack => (link) Europe _ heap

        System.out.println("____________________");


        checker = (str1 == str2);  //compare string
        System.out.println(checker);

        System.out.println("---------------");

        String str3 = new String("Europe"); // create new object
        checker = (str1 == str3);
        System.out.println(checker);  // false, because link Not equals!

        System.out.println("-----------");
        checker = str1.equals(str3);  // compare Strings with eguals
        System.out.println(checker);



    }
}
