package classwork_21.string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {

    // ZADAEM POLIA
    StringWithNumbers stringWithNumbers; // objekt kotoryj budet testit


    @BeforeEach
    void setUp() {
        stringWithNumbers = new StringWithNumbers("123 321 10"); // 454

    }
    @Test
    void sumOfNumbersInStringTest(){  // OTDAJEM I DOBOLIAEM SLOVO TEST
        String str = "123 321 10";
        int expected = 454;
       int actual = stringWithNumbers.sumOfNumbersInString(str); // vyzvonnyj metod dolzen vernut
        assertEquals(expected, actual); // sravnivaet



    }


}