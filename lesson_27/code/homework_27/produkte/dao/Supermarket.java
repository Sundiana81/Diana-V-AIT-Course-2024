package homework_27.produkte.dao;

import homework_27.produkte.model.Product;

import java.util.List;

public interface Supermarket {

    void printProducts(); // печать всех продуктов
    double totalPrice(); // общая стоимость всех продуктов
    // найти продукты по сроку годности
    List<Product> findProductsByExpirationDate(String expDate);
}
