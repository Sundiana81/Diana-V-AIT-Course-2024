package homework_26.bau.detail.dao;

import homework_26.bau.detail.model.Detail;

import java.util.HashMap;
import java.util.Map;

public class StockImpl implements Stock{

    private Map<Long, Detail> stock = new HashMap<>();
    // Map<Long, Detail> — это интерфейс Java коллекции, представляющий собой структуру данных "словарь",
    // которая хранит элементы в формате "ключ-значение". В данном случае:
    //  Ключ: Long — штрих-код детали (barCode), по которому можно найти деталь.
    // Значение: Detail — объект детали, которая хранится на складе.
    // stock — это поле класса StockImpl, в котором хранятся все детали склада.
    // Оно является экземпляром карты (Map), где штрих-коды (типа Long) сопоставлены с объектами типа Detail.
    // new HashMap<>() — создание новой хэш-таблицы (реализации интерфейса Map).
    // Она позволяет эффективно хранить и извлекать объекты на основе ключей.
    // Здесь HashMap обеспечивает:
    // Вставку, поиск и удаление элементов за время O(1) в среднем случае.
    // В ней не поддерживается упорядоченность ключей.
    //Таким образом, переменная stock представляет собой коллекцию,
    // где ключом является штрих-код (тип Long), а значением — объект типа Detail,
    // представляющий конкретную деталь на складе.
    @Override
    public void addDetail(Detail detail) {

    }

    @Override
    public Detail findDetailByBarCode(long barCode) {
        return null;
    }

    @Override
    public void updateDetail(Detail detail) {

    }

    @Override
    public void removeDetail(long barCode) {

    }

    @Override
    public double getTotalMass() {
        return 0;
    }

    @Override
    public double getAverageMass() {
        return 0;
    }
}
