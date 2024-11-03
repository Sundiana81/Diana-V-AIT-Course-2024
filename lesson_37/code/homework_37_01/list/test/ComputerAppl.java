package homework_37_01.list.test;

import homework_37_01.list.model.Computer;
import homework_37_01.list.model.ComputerList;

public class ComputerAppl {
    public static void main(String[] args) {
        ComputerList computerList = new ComputerList();

        // Добавление компьютеров в список
        computerList.addComputer(new Computer("Dell", 16, 512));
        computerList.addComputer(new Computer("HP", 8, 256));
        computerList.addComputer(new Computer("Apple", 16, 1024));
        computerList.addComputer(new Computer("Lenovo", 8, 512));
        computerList.addComputer(new Computer("Asus", 32, 1024));
        computerList.addComputer(new Computer("Acer", 16, 256));

        // Сортировка и вывод по бренду
        System.out.println("Сортировка по бренду:");
        computerList.sortByBrand();
        computerList.displayComputers();

        // Сортировка и вывод по RAM, затем по SSD
        System.out.println("Сортировка по RAM, затем по SSD:");
        computerList.sortByRamThenSsd();
        computerList.displayComputers();

        // Подсчет и вывод общего и среднего объема SSD
        System.out.println("Общий объем SSD: " + computerList.getTotalSsd() + " ГБ");
        System.out.println("Средний объем SSD: " + computerList.getAverageSsd() + " ГБ");
    }
}
