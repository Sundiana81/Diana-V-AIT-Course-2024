package classwork_28.car_garage.ait.cars.test;

import classwork_28.car_garage.ait.cars.dao.Garage;
import classwork_28.car_garage.ait.cars.dao.GarageImpl;
import classwork_28.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp() {

        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

        // TODO add cars to garage
        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }

    }

    @Test
    void addCarTest() {
        Car newCar = new Car("Number5", "Model5", "Company3", 3.0, "Blue");
        assertTrue(garage.addCar(newCar)); // проверяем, что машина успешно добавляется
        assertEquals(5, garage.size()); // проверяем, что размер гаража увеличился
        assertFalse(garage.addCar(newCar)); // пробуем добавить ту же машину снова (должно вернуть false)
    }

    @Test
    void removeCarTest() {
        Car removedCar = garage.removeCar("Number1");
        assertNotNull(removedCar); // Check that a car was removed
        assertEquals("Number1", removedCar.getRegNumber()); // Verify correct car removed
        assertEquals(3, garage.size()); // Ensure size decreases after removal

        // Verify that the car no longer exists in the garage
        assertNull(garage.findCarByRegNumber("Number1"));
    }


    @Test
    void findCarByRegNumberTest() {
        Car car = garage.findCarByRegNumber("Number3");
        assertNotNull(car); // проверяем, что машина найдена
        assertEquals(cars[2], car); // проверяем, что найдена нужная машина
        assertNull(garage.findCarByRegNumber("InvalidNumber")); // проверяем, что несуществующая машина не найдена
    }

    @Test
    void findCarsByModelTest() {
        Car[] expected = {cars[0], cars[2]};
        Car[] actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompanyTest() {
        Car[] expected = {cars[0], cars[1]};
        Car[] actual = garage.findCarsByCompany("Company1");
        assertArrayEquals(expected, actual); // проверяем, что машины найдены по компании
    }

    @Test
    void findCarsByEngineTest() {
        Car[] expected = {cars[3]}; // ожидаем только одну машину с двигателем 2.0 в диапазоне
        Car[] actual = garage.findCarsByEngine(1.8, 2.5);
        assertArrayEquals(expected, actual); // проверяем машины по диапазону двигателя
    }

    @Test
    void findCarsByColorTest() {
        Car[] expected = {cars[1], cars[3]};
        Car[] actual = garage.findCarsByColor("Green");
        assertArrayEquals(expected, actual); // проверяем машины по цвету
    }

    @Test
    void sizeTest() {
        assertEquals(4, garage.size()); // проверяем правильный размер гаража
    }

    @Test
    void printCarsTest() {
        garage.printCars(); // выводим список машин (визуальная проверка)
        // можно дополнительно проверять через OutputStream, если нужно тестировать вывод
    }

}// end of class
