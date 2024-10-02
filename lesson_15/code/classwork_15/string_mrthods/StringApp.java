package classwork_15.string_mrthods;

public class StringApp {


    public static void main(String[] args) {
        String str1 = "Hello,";  //srt1 ssylka  , String novyj tip, Hello znacenie

        char[] chars = {32, 'W', 'o', 'r', 'l', 'd', '!' };  // 32 kod probela
        String str2 = new String(chars); // str2 - eto objekt klassa String, sdelanyj konstruktorom (toze metod)
        System.out.println(str1); // Hello,
        System.out.println(str2); // World!  vtoraja stroka

        // concat - objediniaem objekty tipa String
        // est metot v klasse String
        String str = str1 + str2;  // + raspeciatka na odnoj stroke
        System.out.println(str);

        // v staku 1 dobovliaem stroku 2
        System.out.println(str1.concat(str2)); //() OTDAJEM STR2 // konkatenacija s pomoju metoda
        System.out.println(str1); // str1 neizmenilos,tak kak tip Strin imutable

        // length of String
        int l = str.length(); // objekt tocka metod , dlina stroki str
        // str - eto objeks tipa string
        System.out.println(l);

        // last symbol
        char ch = str.charAt(0); // u straki stoit na pozicii 0  , u objekta srt budet otrobatyvatsia simbol
        System.out.println("Fiest symbol:" + ch);
        ch = str.charAt(str.length() - 1); // iz elementa char
        System.out.println("Last symbol:" + ch);


        // print with spaces s probelami
        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");  // " _ "  eto pobel, (i) parametr cikla,

        }
        System.out.println(); // NEW LINE
        // check equals
        String str3 = " worLD!";
        boolean checker = str3.equals(str); // str2 = " World"
        System.out.println(checker); // false
        checker = str3.equalsIgnoreCase(str2); // "World!"  ignariruet bolsie malenkie bukvy, glavnoe pisledovatelinost
        System.out.println(checker); // true

        System.out.println("----------------------------------");
        // symbole in pisition
        System.out.println(str);
        int index = str.indexOf('W');
        System.out.println(index); // 7 pozicija v stroke
        int index1 = str.lastIndexOf('d'); // idiom s prava na leva pri poiske
        System.out.println(index1);
        index = str.indexOf('o');
        index1 = str.lastIndexOf('o'); // s leva na prava
        System.out.println(index + ", " + index1);
        index = str.indexOf('x');
        System.out.println(index); // predpolozenie -1


        System.out.println("--------- substrings---------");
        System.out.println(str.substring(7));  // 7 stroka // World!
        System.out.println(str.substring(7,10)); //  10 Wor eto peciataetsia v konsole

        System.out.println("--------- replace---------");
        System.out.println( str.replace("o","O-O-O"));

        System.out.println("--------------split------------");
        //number of words
        String str4 = "I love string in Java";
        String[] wolds = str4.split(" "); // VSIO CTO MEZDU SLOV PROBELI ETO RAZDELITEL I SCITAET SLOVA S LEVA NA PRAVA
        int w = wolds.length; // SPRSIVAEM U MASIVA KAKAJA POLUCILAS DLINA
        System.out.println("Numbers of words in sentence:" + w);

        // numbers of letters
        String[] letters = str4.split("");
        int let = letters.length;
        System.out.println("Numbers of letters in sentence:" + let);

        System.out.println("----------String.format----------");
        //Вставьте в строку дату полета Гагарина в виде:
        //"Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
        //Используйте String.format()

        int day = 12;
        String month = "April"; // tip pered peremennoj
        int year = 1961;

        // novaja stoka
        String gagarinDay = String.format("Дата полета Гагарина в космос: %d - %s - %d", day, month, year );
        System.out.println(gagarinDay);


        }
    }