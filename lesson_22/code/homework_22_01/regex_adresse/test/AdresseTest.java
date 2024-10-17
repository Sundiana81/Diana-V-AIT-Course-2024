package homework_22_01.regex_adresse.test;

import homework_22_01.regex_adresse.model.Adresse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdresseTest {


    @Test

    void AdresseTest(){

        assertFalse(Adresse.isValidCity("vilnius"));
        assertFalse(Adresse.isValidCity("Vilniu345"));
        assertFalse(Adresse.isValidCity("Vil nius"));
        assertTrue(Adresse.isValidCity("Vilnius"));
        assertTrue(Adresse.isValidCity("Berlin"));

    }


    @Test

    void postCodeTest(){

        assertTrue(Adresse.isValidPostalCode("12345"));
        assertTrue(Adresse.isValidPostalCode("54321"));
        assertTrue(Adresse.isValidPostalCode("13583"));
        assertFalse(Adresse.isValidPostalCode("1234"));
        assertFalse(Adresse.isValidPostalCode("123a456"));
        assertFalse(Adresse.isValidPostalCode("123_45"));
    }

}
