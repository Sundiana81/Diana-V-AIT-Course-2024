package homework_43;
// Имеется набор целых чисел: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20.
// Требуется из этого списка отобрать только простые числа. Используйте методы stream()
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {
    public static void main(String[] args) {

                List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

                List<Integer> primeNumbers = numbers.stream()
                        .filter(PrimeNumbers::isPrime)
                        .collect(Collectors.toList());

                System.out.println("Prime numbers: " + primeNumbers);
            }

            private static boolean isPrime(int number) {
                if (number <= 1) { // Если число меньше или равно 1, оно не является простым
                    return false;
                }
                return java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .allMatch(n -> number % n != 0);// Проверяет, что number не делится без остатка
            }
        }

