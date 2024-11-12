package classwork_44.programmer_and_technologies;

//1. Кто из программистов знает больше всего языков (поименно)
//Ф И - > кол-во языков или кол-во языков -> программист
//2. Какие языки пользуются популярностью среди наших программистов
//язык программирования -> сколько программистов его знают

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {
    public static void main(String[] args) {

        // data set
        List<Programmer> programmers = fillListProgrammers(); // новый объект
        // System.out.println(programmers);
        programmers.forEach(System.out::println);

        // print Technology
        System.out.println("========= List of technologies ==================");
        printTechnologies(programmers);

        System.out.println("========= Frequency, popular technologies ==================");
        // technology => frequency
        printTechnologiesByFrequency(programmers);

        System.out.println("========= Frequency, popular technologies, sorted ==================");
        printTechnologiesByFrequencySorted(programmers);





    }

    private static void printTechnologiesByFrequencySorted(List<Programmer> programmers) {
        List<String> technologies = programmers.stream()
                .map(Programmer::getTechnology)
                .flatMap(List::stream)
                .distinct()
                .sorted().toList();
        technologies.forEach(System.out::println);
    }

    private static void printTechnologiesByFrequency(List<Programmer> programmers) {
        // Map frequency => technology
        Map< String , Long > technologiesByFrequency = programmers.stream()
                .map(Programmer::getTechnology)  // получаем список технологий каждого программиста
                .flatMap(List::stream)           // объединяем списки в единый поток
                .collect(Collectors.groupingBy(   // группируем по названию технологии
                        technology -> technology,     // ключ - название технологии
                        Collectors.counting()         // считаем количество каждой технологии
                ));
        System.out.println(technologiesByFrequency);
    }

    private static void printTechnologies(List<Programmer> programmers) {
        List<String> technologies = programmers.stream()
                .map(Programmer::getTechnology) // взяли спискии с языками
                .flatMap(List::stream) // объединили в один список, чтобы работать с новым потоком
                // .distinct()// убрали дубликаты
                .sorted()
                .toList();
        System.out.println(technologies);
        // 2-й способ убрать дубли
        StreamSupport.stream(technologies.spliterator(), false)
                .distinct()
                .forEach(System.out::println);
    }

    private static List<Programmer> fillListProgrammers() {
        return List.of(
                new Programmer("Peter", List.of("C++", "Python", "Java", "Kotlin")),
                new Programmer("John", List.of("Python", "Java")),
                new Programmer("Helen", List.of("Kotlin", "Scala", "Java", "JavaScript")),
                new Programmer("Jakob", List.of("Python", "Go")),
                new Programmer("Mike", List.of("Fortran", "Algol", "PL-1"))
        );
    }
}
