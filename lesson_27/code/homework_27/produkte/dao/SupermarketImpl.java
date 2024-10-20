package homework_27.produkte.dao;
//Supermarket, искать продукты по сроку годности (срок задается строкой вида yyyy-MM-dd),
// общая стоимость всех товаров, средняя стоимость, ...

import homework_27.produkte.model.Food;
import homework_27.produkte.model.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SupermarketImpl implements Supermarket {

    private List<Product> products;

    public SupermarketImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public void printProducts() {
        for (int i = 0; i < products.size(); i++) {  // цикл fori
            System.out.println(products.get(i));
        }

    }

    @Override
    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {  // цикл fori
            total += products.get(i).getPrice();
        }
        return total;

    }

    @Override
    public List<Product> findProductsByExpirationDate(String expDate) {

        List<Product> result = new ArrayList<>();
        // Этот вызов найдёт все продукты, чей срок годности истекает до или на дату "2024-10-01".
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //Попытка парсинга переданной даты expDate:
            //Метод пытается преобразовать строку expDate (например, "2024-10-10") в объект Date.
            // Если строка не соответствует ожидаемому формату,
            // будет выброшено исключение ParseException.
            Date date = sdf.parse(expDate);
            for (int i = 0; i < products.size(); i++) {
               // Проверяется, является ли продукт экземпляром класса Food,
                // поскольку только продукты питания имеют срок годности.
                if (products.get(i) instanceof Food) {
                    //products.get(i): Получает продукт из списка products по индексу i.
                    //(Food): Приведение типа. Мы уверены, что полученный объект является экземпляром класса Food,
                    // поэтому мы можем использовать его специфические методы.
                    //getExpirationDate(): Вызывает метод, который возвращает строку,
                    // представляющую срок годности этого продукта (например, "2024-10-10").
                    //sdf.parse(...): Использует объект SimpleDateFormat (sdf),
                    // который был ранее создан для преобразования строки (срока годности) в объект Date.
                    //    Если строка не соответствует формату yyyy-MM-dd, будет выброшено исключение ParseException.
                    Date productDate = sdf.parse(((Food) products.get(i)).getExpirationDate());
                    //productDate.compareTo(date): Сравнивает дату срока годности (productDate) с другой датой (date),
                    // которая также является объектом Date.
                    if (productDate.compareTo(date) <= 0) {

                        result.add(products.get(i));
                    }
                }
            }
           // Если происходит ошибка при преобразовании даты, вызывается блок catch,
            // который выводит стек ошибки с помощью e.printStackTrace().
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    }