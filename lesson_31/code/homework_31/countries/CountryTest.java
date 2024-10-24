package homework_31.countries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    Country[] countries;


    @BeforeEach
    void setUp() {

        countries = new Country[5];

        countries[0] = new Country("Deutschland", 83_862_225);
        countries[1] = new Country("Monaco", 31_223);
        countries[2] = new Country("Russland", 145_900_000);
        countries[3] = new Country("Litauen", 2_893_887);
        countries[4] = new Country("France", 66_548_530);

    }
    public void printArray(Object[] array, String titleOfReport) {
        System.out.println("--------------- " + titleOfReport + " ------------------- ");
        for (Object o : array) {
            System.out.println(o);
        }
    }

    @Test
    void testComparable() {
        printArray(countries, "List of countries as is");
        Arrays.sort(countries);
        printArray(countries, "List of countries sorted by population");
        Country pattern = new Country(null, 20_000_000);
        int index = Arrays.binarySearch(countries, pattern);
        System.out.println(index);
    }

    @Test
    void testComparatorByName() {
        Comparator<Country> comparatorByName = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(countries, comparatorByName);
        printArray(countries, "List of countries sorted by name");
        Country pattern = new Country("Italia", 0);
        int index = Arrays.binarySearch(countries, pattern, comparatorByName);
        if (index >= 0) {
            System.out.println("Found country " + pattern.getName() + " at index: " + index);
        } else {
            System.out.println("Country " + pattern.getName() + " not found, but it could be at index: " + (-index - 1));
        }
    }

    @Test
    void testArrayCopy() {
        Country[] countriesCopy = Arrays.copyOf(countries, countries.length * 2);
        printArray(countriesCopy, "Countries copy as is");
        Comparator<Country> comparatorByName = Comparator.nullsLast(Comparator.comparing(Country::getName));
        Arrays.sort(countriesCopy, comparatorByName);
        printArray(countriesCopy, "Countries after sorting by name");
    }

    @Test
    void testInsertKeepSorting() {
        Arrays.sort(countries);
        printArray(countries, "Sorted by population");
        Country[] countriesCopy7 = Arrays.copyOf(countries, countries.length + 1);
        Country newCountry = new Country("Mexica", 48_389_000);
        int index = Arrays.binarySearch(countriesCopy7, 0, countriesCopy7.length - 1, newCountry);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(countriesCopy7, index, countriesCopy7, index + 1, countriesCopy7.length - index - 1);
        countriesCopy7[index] = newCountry;
        countries = countriesCopy7;
        printArray(countries, "List with added country");
    }
}

