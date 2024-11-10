package homework_42.continents;
// Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли.
// Подсчитайте количество стран на континентах из полученного списка.

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Countries {


    public static void main(String[] args) {
        // Создаем Map с континентами и странами
        Map<String, List<String>> continentCountries = new HashMap<>();


        continentCountries.put("Asia", Arrays.asList("Japan", "China", "South Korea", "India"));
        continentCountries.put("South America", Arrays.asList("Argentina", "Brazil", "Chile"));
        continentCountries.put("Africa", Arrays.asList("Egypt", "Nigeria", "South Africa"));
        continentCountries.put("Europe", Arrays.asList("Germany", "United Kingdom", "Italy", "France"));
        continentCountries.put("Antarctica", Arrays.asList("Antarctica"));
        continentCountries.put("North America", Arrays.asList("Mexico", "Canada", "United States"));
        continentCountries.put("Australia", Arrays.asList("New Zealand", "Australia"));

        // Подсчитываем количество стран на каждом континенте и выводим результат
        for (Map.Entry<String, List<String>> entry : continentCountries.entrySet()) {
            String continent = entry.getKey();
            int countryCount = entry.getValue().size();
            System.out.println("Континент: " + continent + ", Количество стран: " + countryCount);
        }
    }
    // Map.Entry — это интерфейс, который представляет одну запись (пару "ключ-значение") из Map.
    //<String, List<String>> — это обобщённый (generic) тип записи:
    //String — это тип ключа, то есть название континента (например, "Asia").
    //List<String> — это тип значения, т.е. список стран на этом континенте (например, ["China", "Japan", "India"]).
    //entry — это переменная, которая будет ссылаться на текущую пару "ключ-значение" из Map на каждой итерации цикла.
    // continentCountries.entrySet():
    // continentCountries — это Map, который содержит континенты и списки стран.
    // Метод .entrySet() возвращает Set из всех Map.Entry (пар "ключ-значение") в continentCountries.
    //Таким образом, continentCountries.entrySet() предоставляет набор всех записей в Map,
    // по которым мы можем пройтись циклом
}


