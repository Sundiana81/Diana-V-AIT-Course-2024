package homework_27.produkte.test;

import homework_27.produkte.dao.SupermarketImpl;
import homework_27.produkte.model.Food;
import homework_27.produkte.model.MeatFood;
import homework_27.produkte.model.MilkFood;
import homework_27.produkte.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SupermarketTest {

    private SupermarketImpl supermarket;

    @BeforeEach
    public void setUp() {
        List<Product> products = new ArrayList<>();
        products.add(new MeatFood(35.7, "Fisch", 8473639L, "24-10-24", "Fisch"));
        products.add(new MilkFood(3.0, "Milk", 8373637281L, "24-10-24", "Zige", 3.5));
        products.add(new Food(1.0, "Bread", 5748395L, "31-12-24"));

        supermarket = new SupermarketImpl(products);
    }

    @Test
    public void testTotalPrice() {
        double expectedTotalPrice = 35.7 + 3.0 + 1.0;
        double actualTotalPrice = supermarket.totalPrice();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01);
    }

    @Test
    public void testFindProductsByExpirationDate() {
        List<Product> expiringProducts = supermarket.findProductsByExpirationDate("2024-10-01");
        assertEquals(3, expiringProducts.size());
        assertTrue(expiringProducts.get(0) instanceof Food);


    }

    @Test
    public void testPrintProducts() {
        supermarket.printProducts();
    }
}

