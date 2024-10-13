package classwork_22.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    User user; // vziali klass i podkliucili objekt

    final String email = "peter@mail.de"; // ideal email
    final String passwod = "123456Az!"; // ideal password


    @BeforeEach
    void setUp() {
        user = new User(email, passwod); // create new 'fresh' object user
    }

    @Test
    void testValidEmail() {
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void testValidPassword() {
        assertEquals("123456Az!", user.getPassword()); // i on sovpadiot s getEmail


    }

    // dajem polzavateliu nevernyj parol
    @Test
    void setEmailNoAt() {
        String email = "petermail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change


    }

    @Test
    void setEmailNoDot() {
        String email = "peter@mailde"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change
    }

    @Test
    void setEmail() {
        String email = "peter@maild.e"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change

    }

    @Test
    void setEmailSymbol() {
        String email = "p||eter@mail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change


    }
    //@DisplayName // PISEM TO CTO TESTIRUEM
    @Test
    void setEmailWithTwoDots() {
        String email = "peter@mailukco"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change
        System.out.println(user.getEmail());
    }

    //----------------------------------------------------------------------------------------------
    @Test
    void setValidPasswodLength() {
        user.setPassword("1234Az!"); // 7 symbol // polzovatel zavodi
        assertEquals("123456Az!", user.getPassword());
        user.setPassword("123456123456123456Az!"); // 21 symbol
        assertEquals("123456Az!", user.getPassword());


    }

    @Test
    void setValidPasswodMinOneDigit() {
        user.setPassword("Asjgjgh!");
        assertEquals("123456Az!", user.getPassword());

    }

    @Test
    void setValidPasswordOneLetterUpperCase() {  // NET BOLSOJ BUKVY
        user.setPassword("123456az!");
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordOneLetterLowerCase() { // NET MALENKOJ BUKVY
        user.setPassword("123456AZ!");
        assertEquals("123456Az!", user.getPassword());

    }

    @Test
    void setValidPasswordOneSpecialSymbol() {
        user.setPassword("123456Az");
        assertEquals("123456Az!", user.getPassword());

    }
}