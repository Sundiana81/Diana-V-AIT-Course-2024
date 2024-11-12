package homework_45.dao;


    import java.util.*;
import java.util.stream.Collectors;

    public class ComputerImpl {
        public static void main(String[] args) {
            // Создаем список компьютеров
            List<Computer> computers = Arrays.asList(
                    new Computer("Dell", 8, 512),
                    new Computer("HP", 16, 256),
                    new Computer("Apple", 8, 1024),
                    new Computer("Lenovo", 32, 512),
                    new Computer("Acer", 16, 256)
            );

            // Находим компьютер с максимальной оперативной памятью
            Optional<Computer> maxRamComputer = computers.stream()
                    .max(Comparator.comparingInt(Computer::getRam));

            // Находим компьютер с минимальным объемом SSD
            Optional<Computer> minSsdComputer = computers.stream()
                    .min(Comparator.comparingInt(Computer::getSsd));

            maxRamComputer.ifPresent(computer -> System.out.println("Computer with max RAM: " + computer));
            minSsdComputer.ifPresent(computer -> System.out.println("Computer with min SSD: " + computer));

            // Фильтруем компьютеры с RAM больше 8 ГБ
            System.out.println("Computers with more than 8GB RAM:");
            findComputersWithMoreRam(computers, 8).forEach(System.out::println);

            // Сортируем компьютеры по объему SSD в порядке убывания
            System.out.println("Computers sorted by SSD (descending):");
            sortComputersBySsd(computers).forEach(System.out::println);
        }

        // Метод для поиска компьютеров с RAM больше заданного значения
        private static List<Computer> findComputersWithMoreRam(List<Computer> computers, int minRam) {
            return computers.stream()
                    .filter(computer -> computer.getRam() > minRam)
                    .collect(Collectors.toList());
        }

        // Метод для сортировки компьютеров по объему SSD (в порядке убывания)
        private static List<Computer> sortComputersBySsd(List<Computer> computers) {
            return computers.stream()
                    .sorted(Comparator.comparingInt(Computer::getSsd).reversed())
                    .collect(Collectors.toList());
        }
    }


