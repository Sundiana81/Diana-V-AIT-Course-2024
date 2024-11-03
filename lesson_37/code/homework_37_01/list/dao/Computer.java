package homework_37_01.list.dao;

import java.util.List;

public interface Computer {
    void addComputer(Computer computer);
    void sortByBrand();
    void sortByRamThenSsd();
    int getTotalSsd();
    double getAverageSsd();
    List<Computer> getComputers();
}
