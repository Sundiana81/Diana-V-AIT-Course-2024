package homework_30.person;

//сортировка по умолчанию
// сортировка по 2-м критериям
// поиск в массиве с помощью Arrays.binarySearch()

import classwork_30.soldier.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;


import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person[] people;

    @BeforeEach
    void setUp() {

        people = new Person[]{

                new Person("Natalia", 60, 120.4),
                new Person("Anna", 45, 85.1),
                new Person("Nastia", 45, 48.3),
                new Person("Inessa", 50, 65.1)

        };

    } // end of method

    ////- отсортировать солдат "естественным" образом - по росту
//    @Test
//    void testNativSorting() {
//        System.out.println(".............Print as is..........");
//        printArray(soldiers);
//        Arrays.sort(soldiers); // ntive, by gefault
//        System.out.println(".............Print after native sorting..........");
//        printArray(soldiers);
//    }
    @Test
    void NativSortingTest() {
        System.out.println("..........Print as is............");
        printArray(people);
        Arrays.sort(people);
        System.out.println("...........Print after native sorrting.....");
        printArray(people);
    }

    @Test
    void SortingByNameTest() {
        Comparator comparatorByName = new Comparator<Person>() {


            @Override
            public int compare(Person o1, Person o2) {

                return o1.getName().compareTo(o2.getName()); // reverse sorting, s minusom
            }
        };
        System.out.println(".............Print as is..........");
        printArray(people);
        Arrays.sort(people, comparatorByName);
        System.out.println(".............Print after sorting by name..........");
        printArray(people);

    }

    @Test
    void SortingByWeightTest() {
        System.out.println(".............Print as is..........");
        printArray(people);
        Arrays.sort(people, (p1, p2) -> Double.compare(p1.getWeight(), p2.getWeight()));
        printArray(people);
        System.out.println(".............Print sorting by weight..........");
        printArray(people);
    }

      // Comparator<Soldier> comparatorNameAndHeitht = new Comparator<Soldier>() {
    //            @Override
    //            public int compare(Soldier o1, Soldier o2) {
    //                int res = o1.getName().compareTo(o2.getName());
    //                // ternarnyj operator
    //                // esli imena  raznye to do : odinakovye sravnivai po rostu
    //                return res != 0 ? res : Integer.compare(o1.getHeight(), o2.getHeight());
    //
    //            }
    //        };
  @Test
  void SortingByAgeAndNameTest(){

        Comparator<Person> comparatorAgeAndName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res != 0 ? res : Integer.compare(o1.getAge(), o2.getAge());

            }
        };

      System.out.println(".............Print as is..........");
      printArray(people);
      Arrays.sort(people, comparatorAgeAndName);
      System.out.println(".............Print sorting by Name and Height..........");
      printArray(people);

  }
    @Test
    void testBinarySearch() {
        System.out.println(".............Print as is..........");
        printArray(people);

        // Sorting the array by name as binarySearch requires a sorted array
//        Arrays.sort(people, Comparator.comparing(Person::getName));
//        System.out.println(".............Print sorting by Name..........");
//        printArray(people);
        Arrays.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(".............Print sorting by Name..........");
        printArray(people);

        // Creating a pattern to search for (must match exactly by name)
        Person pattern = new Person("Anna", 0, 0); // Age and weight are not considered in this case

        // Searching in the sorted array by name
        int index = Arrays.binarySearch(people, pattern, Comparator.comparing(Person::getName));

        System.out.println("Index of the search pattern = " + index);

        // Assertion to ensure correctness (assuming "Anna" is present)
        assertTrue(index >= 0);
    }




    public void printArray (Object[]array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
