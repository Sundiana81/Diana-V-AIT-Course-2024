package classwork_31.cities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

//City("Denver", 600_000);
//City("Boston", 670_000);
//City("Chicago", 2_700_000);
//City("Atlanta", 470_000);
//City("New York", 8_500_000);
//City("Dallas", 1_300_000);

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {

        cities = new City[6];

        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    public void printArray (Object[] array, String titleOfReport){
        System.out.println("--------------- " + titleOfReport + " ------------------- ");
        for (Object o : array) {
            System.out.println(o);
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
    }

//    Распечатать в отсортированном виде.
//    Есть ли в списке городов город с населением 1.2 млн человек?
//    Отсортируйте список по алфавиту.
//    Есть ли в списке город по имени Chicago? Какой он имеет номер в списке?

    @Test
    void testComparable(){
        printArray(cities, ":List of cities as is");
        Arrays.sort(cities);
        printArray(cities, "List of cities sorted by population.");
        City pattern = new City(null, 600_000);
        int index = Arrays.binarySearch(cities,pattern);
        System.out.println(index);
    }

    @Test

    void testComparatorByName(){

        // pojavliaetsia  posle napisanoj strocki
        Comparator<City> comparatorByCityName = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(cities, comparatorByCityName);
        printArray(cities,"List of cities sorted by name.");
        City pattern = new City("Las Vegas",0);
        int index = Arrays.binarySearch(cities, pattern, comparatorByCityName);
        if (index > 0){
            System.out.println("Find city" + pattern.getName() + "on index:" + index );
        } else {
            System.out.println("City " + pattern.getName() + "did not find, but it could be on index" +(-index - 1));

        }
    }
// Скопируйте массив в другой, имеющий в 2 раза большую длину.
//Отсортируйте полученный массив.
//Имеется ли в списке городов город Salem?
//"Salem", 690_000

@Test
    void testArrayCopy(){
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
    printArray(citiesCopy, "Citiescopy s is");
    System.out.println(citiesCopy.length);
    Comparator<City> comparatorByName =  Comparator.nullsLast((c1,c2) -> c1.getName().compareTo(c2.getName()));
    // sorting
  Arrays.sort(citiesCopy, comparatorByName);
    // printArray
    printArray(citiesCopy, "cities after sorting by name");

    City pattern = new City("Salem", 0);
    // masiv s nulevogo indeksa do 6 pozicii naidi po paternu on otsartirovan po compbyname
    int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparatorByName);
    System.out.println(index);
}
//Вставьте город Salem в список, сохранив порядок сортировки по населению.

    @Test
    void testInsertKeepSorting(){
        Arrays.sort(cities);
        printArray(cities, "Natiev sorting");
        // increase up to 7
        City[] citiesCopy7 = Arrays.copyOf(cities, cities.length +1);
        City city = new City("Salem", 690_000);
        int index = Arrays.binarySearch(citiesCopy7, 0, citiesCopy7.length - 1, city);
        // ternarnyj operator
        index = index >=0 ? index : - index - 1; // obrabotka indeksa
        // razdvigaem masiv
        System.arraycopy(citiesCopy7, index, citiesCopy7 ,index + 1, citiesCopy7.length -index - 1);
        citiesCopy7[index] = city;
        cities = citiesCopy7; // pereopredilili ssylku na massiv
        printArray(cities, "List with added city");

    }
   // smenit komparator esli iskat po gorogam

    //Проверьте работу метода System.arraycopy, скопировав часть массива.
    //Проверьте работу метода Arrays.copyOfRange

  @Test
    void testSystemArrayCopy(){
        // нам нужно расширить массив на 2 ЕЛИМЕНТА
      City[] citiesCopyPlius2 = new City[cities.length + 2];
      // копируем старый массив в новый
      // 0 скакого элимента, 3 с какий позиции, до 4 строки
      System.arraycopy(cities, 2, citiesCopyPlius2, 3, 3);
      printArray(cities, "Original array");
      printArray(citiesCopyPlius2, "Coppy of array");

  }
  // проверить работу метода Array.copyOfRange
  @Test
    void testArraysCopyOfRange(){
        City[] citiesCopy = Arrays.copyOfRange(cities, 1, 3);
        printArray(cities, "Original (sourse) array");
        printArray(citiesCopy,"Copy of range");



  }
}
