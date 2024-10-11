package classwork_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {

    ArrayTdd arrayTdd; // TIANEM KLASS I SOZDAJEM OBIEKT
    int[] array = {10,-10, 20, -15, 45};

    @BeforeEach
    void setUp() {
        arrayTdd = new ArrayTdd(array);// array otdajem na objekt (array)
    }

    @Test
    void countPositive() {
        int[] array = {10,-10, 20, -15, 45, 23, 46};
      // expected
        int expencted = 5;
       // actual
        int actual = arrayTdd.countPositive(array);

        assertEquals(actual, expencted, "Bad  info");



    }
}