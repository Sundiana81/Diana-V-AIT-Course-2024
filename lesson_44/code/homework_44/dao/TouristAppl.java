package homework_44.dao;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TouristAppl {
    private static List<Tourist> getTourists() {
        return List.of(

                new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina", "Italy", "France", "Italy"),
                new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
                new Tourist("Andrii", "UK", "Ireland", "Spain"),
                new Tourist("Liubov", "Croatien", "Slovenien", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }

    // Main method
    public static void main(String[] args) {
        List<Tourist> tourists = getTourists();

        // Set of Mediterranean countries
        // Список стран Средиземноморья
        Set<String> mediterraneanCountries = Set.of("Spain", "France", "Italy", "Greece", "Turkey", "Tunis");

        // Counting the visits for each Mediterranean country
        // Подсчет посещений для каждой страны Средиземноморья
        Map<String, Long> countryPopularity = tourists.stream()
                //Для каждого туриста (tourist) получаем массив стран, которые он посетил,
                // используя метод getVisitedCountries().
                .flatMap(tourist -> Arrays.stream(tourist.getVisitedCountries()))
                .filter(mediterraneanCountries::contains)// фильтрует страны в потоке,
                // оставляя только те, которые находятся в наборе mediterraneanCountries.
                .collect(Collectors.groupingBy(Function.identity(), // указывает, что каждая уникальная
                                                               // страна будет ключом (String) в Map.
                        Collectors.counting()));//считает количество вхождений каждой страны в потоке
                                                // и сохраняет это значение (Long) как значение в Map.

        // Sorting countries by popularity
        //countryPopularity — это Map<String, Long>, где ключ (String) — название страны, а значение (Long) — количество посещений.
        //Метод entrySet() возвращает набор всех записей (Map.Entry<String, Long>) из Map.
        // Каждая запись (Map.Entry) представляет собой пару ключ-значение, то есть название страны и количество посещений.
        //entrySet() возвращает Set<Map.Entry<String, Long>>, в котором хранятся все эти пары.
        List<Map.Entry<String, Long>> sortedCountries = countryPopularity.entrySet()
                .stream()//Преобразует Set<Map.Entry<String, Long>> в поток (Stream),
                // чтобы можно было применять операции над каждой записью в Map.
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))//Сортирует элементы потока,
                // используя значения (количество посещений) каждой записи.
                .collect(Collectors.toList());// собирает отсортированные элементы потока

        System.out.println("Most popular countries:");
       // Здесь Map.Entry<String, Long> entry — это переменная, которая на каждом шаге цикла
        // представляет одну запись (одну страну и её количество посещений) из списка sortedCountries.
        for (Map.Entry<String, Long> entry : sortedCountries) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " visits");
        }

        // Finding the tourist who visited the most unique Mediterranean countries
        // Поиск туриста, посетившего наибольшее количество уникальных стран Средиземноморья
        Tourist mostCountriesVisited = tourists.stream()
                .max(Comparator.comparing(tourist -> Arrays.stream(tourist.getVisitedCountries())
                        .filter(mediterraneanCountries::contains)
                        .distinct()
                        .count()))
                .orElse(null);

        System.out.println("\nTourist who visited the most unique Mediterranean countries:");
        if (mostCountriesVisited != null) {
            System.out.println(mostCountriesVisited.getName() + " - " +
                    Arrays.stream(mostCountriesVisited.getVisitedCountries())
                            .filter(mediterraneanCountries::contains)
                            .distinct()
                            .count() + " countries");
        }
    }

}