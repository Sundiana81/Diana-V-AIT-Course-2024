package homework_22_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ArrayMethodsTest {

        ArrayMethods arrayMethods = new ArrayMethods();
        //
        @Test
        public void testSumOddIndexedElements() {
            //Здесь создается массив array с элементами {1, 2, 3, 4, 5, 6}.
            //    Вызов метода sumOddIndexElements на этом массиве означает,
            //    что мы ищем сумму элементов с нечетными индексами.
            //    В Java индексация массива начинается с 0, поэтому:
            //        Индекс 1: элемент 2
            //        Индекс 3: элемент 4
            //        Индекс 5: элемент 6
            //    Метод должен вернуть сумму этих элементов: 2 + 4 + 6 = 12.
            //    assertEquals(12, ...) сравнивает результат метода с ожидаемым значением 12.
            //    Если результат отличается, тест провалится
            int[] array = {1, 2, 3, 4, 5, 6};
            assertEquals(12, arrayMethods.sumOddIndexElements(array)); // 2 + 4 + 6 = 12

            int[] array2 = {10, 20, 30, 40, 50};
            assertEquals(60, arrayMethods.sumOddIndexElements(array2)); // 20 + 40 = 60
        }

        @Test
        public void testGetFifthElement() throws Exception {
            int[] array = {1, 2, 3, 4, 5, 6};
            assertEquals(5, arrayMethods.findFifthElement(array));

            int[] array2 = {10, 20, 30, 40, 50, 60};
            assertEquals(50, arrayMethods.findFifthElement(array2));
        }
         //Метод assertThrows проверяет, что при выполнении определенного кода выбрасывается исключение заданного типа.
         // В данном случае проверяется, что выбрасывается исключение типа Exception.
         //Лямбда-выражение () -> {arrayMethods.findFifthElement(shortArray); } указывает код, который должен привести к выбросу исключения.
         // Здесь вызывается метод findFifthElement с массивом shortArray.
         //Если метод не выбросит исключение, тест провалится.
         //Если метод выбросит исключение, оно будет сохранено в переменной exception.
        @Test
        public void testGetFifthElementWithException() {
            int[] shortArray = {1, 2, 3};
            Exception exception = assertThrows(Exception.class, () -> {
                arrayMethods.findFifthElement(shortArray);
            });

            assertEquals("Array has less than 5 elements.", exception.getMessage());
        }
    }


