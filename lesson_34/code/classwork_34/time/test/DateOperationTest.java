package classwork_34.time.test;

import classwork_34.time.utils.DateOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateOperationTest {

    @Test
    void getAge() {
        assertEquals(63, DateOperation.getAge("12/04/1961"));
        assertEquals(62, DateOperation.getAge("1961-11-28"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        String[] expected = {"1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05"};
        assertArrayEquals(expected, actual);
    }
    //В классе DateOperation из классной работы, реализовать метод sortStringDates,
    // принимающий массив дат в виде массива стрингов,
    // и возвращающий отсортированный массив стрингов-дат.
    //Для проверки используйте класс DateOperationTest с юнит-тестами.

    @Test
    void sortStringDates2() {
        String[] dates = {
                "12/04/1961",
                "1961-11-28",
                "01/01/2000",
                "15/08/1947"
        };
        String[] expectedSortedDates = {
                "15/08/1947",
                "12/04/1961",
                "1961-11-28",
                "01/01/2000"
        };

        String[] sortedDates = DateOperation.sortStringDates(dates);
        assertArrayEquals(expectedSortedDates, sortedDates);
    }

}

