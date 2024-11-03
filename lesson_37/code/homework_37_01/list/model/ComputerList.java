package homework_37_01.list.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerList {
    //создает приватное поле computers типа List<Computer>,
    // инициализируя его как новый экземпляр ArrayList.
    private List<Computer> computers = new ArrayList<>();

    // Метод для добавления компьютера в список
    public void addComputer(Computer computer) {
        computers.add(computer);
    }
    // Метод для сортировки по бренду
    // computers.sort(...): Вызывает метод sort() на списке computers для сортировки его элементов. Метод sort() принимает в качестве аргумента Comparator, который определяет порядок сортировки.
    // Comparator.comparing(Computer::getBrand):
    // Comparator.comparing(...) создает компаратор, который будет использовать указанный метод для сравнения объектов.
    // Computer::getBrand — это ссылка на метод getBrand() из класса Computer. Этот метод возвращает строку с названием бренда.
    // С помощью этого компаратора sort() упорядочивает объекты Computer в алфавитном порядке их брендов.
    //Таким образом, список computers будет отсортирован так, что компьютеры с брендами, начинающимися с буквы "A", будут располагаться перед компьютерами с брендами, начинающимися с буквы "B", и так далее.
    public void sortByBrand() {
        computers.sort(Comparator.comparing(Computer::getBrand));
    }
    // Метод для сортировки по RAM и SSD
    // thenComparingInt(Computer::getSsd):
    // thenComparingInt(...) — добавляет второй уровень сравнения к компаратору.
    // Этот метод используется для случаев, когда значения RAM совпадают.
    // Computer::getSsd — ссылка на метод getSsd(), возвращающий объем SSD.
    // При одинаковых значениях RAM объекты Computer будут упорядочены по значению SSD в порядке возрастания.
    //Список computers будет отсортирован сначала по RAM, а если у нескольких объектов одинаковое значение RAM, они будут упорядочены по SSD.
    public void sortByRamThenSsd() {
        computers.sort(Comparator.comparingInt(Computer::getRam).thenComparingInt(Computer::getSsd));
    }

    // Подсчет общего объема SSD
    // computers.stream(): Создает поток (Stream) из списка computers, чтобы можно было выполнить операции над каждым объектом Computer в списке.
    //.mapToInt(Computer::getSsd): Преобразует поток объектов Computer в числовой поток (IntStream) из значений SSD. Этот метод вызывает getSsd() для каждого объекта Computer, извлекая значение SSD.
    //.sum(): Вычисляет сумму всех значений SSD в потоке IntStream.
    public int getTotalSsd() {
        return computers.stream().mapToInt(Computer::getSsd).sum();
    }

    // Подсчет среднего значения SSD
    //computers.stream(): Создает поток (Stream) из списка computers.
    //.mapToInt(Computer::getSsd): Преобразует каждый объект Computer в значение типа int,
    // используя метод getSsd(), который возвращает объем SSD для конкретного компьютера.
    // Это делает поток числовым (IntStream), состоящим из значений SSD.
    //.average(): Вычисляет среднее значение всех элементов в потоке IntStream.
    // Результат — OptionalDouble, потому что список может быть пустым (в этом случае среднего значения не будет).
    //.orElse(0): Если список пуст и нет значения для среднего, возвращается 0 по умолчанию.
    public double getAverageSsd() {
        return computers.stream().mapToInt(Computer::getSsd).average().orElse(0);
    }

    // Метод для отображения всех компьютеров
    public void displayComputers() {
        computers.forEach(System.out::println);
    }
}

