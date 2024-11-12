package homework_44.dao;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BookImpl {
    public static void main(String[] args) {


        List<Book> books = IntStream.range(0, 20)
                .mapToObj(i -> new Book("Book" + (i + 1), generateRatings()))
                .collect(Collectors.toList());

        // Находим книгу с максимальным средним рейтингом
        Optional<Book> maxAvgRatingBook = books.stream()
                .max(Comparator.comparingDouble(Book::getAverageRating));

        // Находим книгу с минимальным средним рейтингом
        Optional<Book> minAvgRatingBook = books.stream()
                .min(Comparator.comparingDouble(Book::getAverageRating));

        maxAvgRatingBook.ifPresent(book -> System.out.println("The book with the highest average rating: " + book));
        minAvgRatingBook.ifPresent(book -> System.out.println("The book with the lowest average rating: " + book));
    }

    private static List<Integer> generateRatings() {
        Random random = new Random();
        return IntStream.range(0, 5)
                .mapToObj(i -> random.nextInt(5) + 1) // оценки от 1 до 5 включительно
                .collect(Collectors.toList());

    }

}
