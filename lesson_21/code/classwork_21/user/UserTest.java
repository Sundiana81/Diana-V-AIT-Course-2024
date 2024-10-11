package classwork_21.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        String email = "p.eter@mailde"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change

    }

    @Test
    void setEmailSymbol() {
        String email = "p||eter@mail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change


    }
}
