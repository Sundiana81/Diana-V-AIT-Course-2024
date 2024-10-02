package classwork_10;

public class Alphabet {
    public static void main(String[] args) {

       char[] alphabet = new char[26];
       for (int i = 0; i < alphabet.length; i ++) {

         alphabet[i] = (char) (65 + i);
           System.out.print(alphabet[i] + " "); // skobki s probellov, poluciaetsia v strocku i bez ln
       }


    }
}
