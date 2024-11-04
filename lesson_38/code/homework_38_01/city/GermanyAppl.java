package homework_38_01.city;
// В классе GermanyAppl cоздать LinkedList, содержащий города - столицы земель Германии.
// Опробовать на нем методы, которые доступны для класса LinkedList.
// Добавить вольный город Гамбург в начало, в середину списка, в конец списка.
// Отсортировать список по алфавиту и в обратном порядке.

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class GermanyAppl {
    public static void main(String[] args) {
        // Create LinkedList of German cities
        LinkedList<String> germanCities = new LinkedList<>();

        // Adding capital cities of German states
        germanCities.add("Berlin");         // Capital of Germany
        germanCities.add("Munich");         // Capital of Bavaria
        germanCities.add("Stuttgart");      // Capital of Baden-Württemberg
        germanCities.add("Dresden");        // Capital of Saxony
        germanCities.add("Hanover");        // Capital of Lower Saxony
        germanCities.add("Düsseldorf");     // Capital of North Rhine-Westphalia
        germanCities.add("Kiel");           // Capital of Schleswig-Holstein

        // Print the initial list
        System.out.println("Initial list of cities:");
        System.out.println(germanCities);

        // Adding Hamburg at the beginning, middle, and end
        germanCities.addFirst("Hamburg");
        germanCities.add(germanCities.size() / 2, "Hamburg"); // Adding to the middle
        germanCities.addLast("Hamburg");
        System.out.println("______________________________________");

        // Sorting list in alphabetical order
        Collections.sort(germanCities);
        System.out.println("Sorted list (Alphabetical Order):");
        System.out.println(germanCities);
        System.out.println("_______________________________________________");

        // Sorting list in reverse alphabetical order
        Collections.sort(germanCities, Collections.reverseOrder());
        System.out.println("Sorted list (Reverse Alphabetical Order):");
        System.out.println(germanCities);
        System.out.println("_________________________________________");


        // Remove the first and last occurrences of Hamburg
        germanCities.removeFirstOccurrence("Hamburg");
        germanCities.removeLastOccurrence("Hamburg");
        System.out.println("List after removing first and last occurrences of Hamburg:");
        System.out.println(germanCities);
        System.out.println("__________________________________________________-");

        // Iterating through the list
        //Здесь создается объект ListIterator с именем iterator, который позволяет перебрать элементы списка germanCities.
        // Мы используем listIterator() для получения итератора,
        // который обеспечивает доступ к элементам списка в обоих направлениях (вперед и назад).
        System.out.println("Iterating through the cities:");
        ListIterator<String> iterator = germanCities.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
