package classwork_43.stream_primitives;

//Стримы примитивов Integer, Long, Double
//- получить случайные целые числа в интервале от min = 1  до max = 10 в нужном количестве
//- получение простейших статистических данных с помощью summaryStatistics
//- моделирование лотереи 6 из 49

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PrimitiveStreamExample {

    private static final int MIN = 1;
    private static final int MAX = 10;
    private static final int N_NUMBERS = 20;

    public static void main(String[] args) {

        Stream<Integer> numbers = getRandomNumbers(MIN, MAX + 1, N_NUMBERS);
        //numbers.forEach(System.out::println); // отрабатывает только один раз
        // numbers.forEach(n -> System.out.println(n + " "));

        System.out.println("________________sum of numbers_________________");
        int sum = numbers.mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum =" + sum);

        System.out.println("______________SummaryStatistics____________");
        IntSummaryStatistics intSummaryStatistics = getRandomNumbers(MIN, MAX, N_NUMBERS)
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Min value:" + intSummaryStatistics.getMin());
        System.out.println("Max value:" + intSummaryStatistics.getMax());
        System.out.println("Average value:" + intSummaryStatistics.getAverage());
        System.out.println("Count value:" + intSummaryStatistics.getCount());
        System.out.println("Sum:" + intSummaryStatistics.getSum());

        System.out.println("_____________моделирование лотереи 6 иэ 49");

        Stream<Integer> lotteryNumbers = getRandomNumbers(1, 50, 6)
                .distinct()
                .limit(6);

        lotteryNumbers.forEach(System.out::println);


    }
    // Методы .ints(), .doubles(), и аналогичные в классе java.util.Random используются для
    // генерации потоков случайных чисел различных типов, таких как int, double, и long.
    // Эти методы полезны для получения последовательностей случайных чисел, которые можно обработать как потоки (Stream),
    // что особенно удобно для работы с большими наборами данных.
    // объект с методами интерфейса Stream<Integer>
    private static Stream<Integer> getRandomNumbers(int min, int max, int nNumbers) {
        return new Random() // заполняем случайными числами Random
                .ints(nNumbers, min, max) // возвращает intStream и заполняет
                .boxed(); // пакуем поток и отдаём методу, прилетит объектом нимдерс


    }


}
