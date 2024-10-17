package classwork_25.regex_appl;

public class RegexAppl {

    public static void main(String[] args) {

        String text = " Java";
        String pattern = " *(J|j)ava([1-9]|[1-9][0-9])?"; // pozvolit provert ,nabor
        // ? eto nol ili 1
        //nabor trebovanija symbolav
        // * my razresaem  symbol pered slovom
        // | ili libo obno libo 2 cifry
        // ? ogranicevaet drugie vozmoznosti , mozet byt mozet ne byt
        boolean checker = text.matches(pattern);
        System.out.println(checker);
        System.out.println("________________________________");
        // domain

        String domain = "A-b-r.a-kadabra.com";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)\\.(com|org|de|il)";
        checker = domain.matches(pattern);
        System.out.println(checker);


        // e-mail
        /*
    1) @ exists and only one (done)
    2) dot after @ (done)
    3) after last dot 2 or more symbols (done)
    4) alphabetic, digits, '_', '-', '.', '@' (done)
*/

        System.out.println("----------------------------------------------------------");
        String email = "peter@mail.Co";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)@[a-zA-Z0-9](\\w|-|\\.)*\\.[A-Za-z]{2,6}";
        checker = email.matches(pattern);
        System.out.println(checker);
    }

}
