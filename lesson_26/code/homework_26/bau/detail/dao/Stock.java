package homework_26.bau.detail.dao;
// Интерфейс Stock c методами:
////    добавить деталь на склад
////    найти деталь по barCode
////    обновить данные о детали
////    удалить деталь
////    общая масса всех деталей на складе
////    средняя масса деталей на складе
import homework_26.bau.detail.model.Detail;


public interface Stock {

    // Добавить деталь на склад
    void addDetail(Detail detail);

    // Найти деталь по штрих-коду
    Detail findDetailByBarCode(long barCode);

    // Обновить данные о детали
    void updateDetail(Detail detail);

    // Удалить деталь со склада
    void removeDetail(long barCode);

    // Общая масса всех деталей на складе
    double getTotalMass();

    // Средняя масса всех деталей на складе
    double getAverageMass();
}

