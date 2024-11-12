package homework_43;

//Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам.
// Смоделируйте этот набор данных,найдите студентов с максимальным/минимальным средним баллом.
// Используйте методы stream()

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentImpl {
    public static void main(String[] args) {

        // Генерация списка студентов с оценками
        List<Student> students = IntStream.range(0, 20)
                .mapToObj(i -> new Student("Student" + (i + 1), generateGrades()))
                .collect(Collectors.toList());

        // Находим студента с максимальным средним баллом
        //Optional<Student> применяется для обработки возможного отсутствия результата (например,
        // если поток пуст и нет студентов с максимальным или минимальным средним баллом).
        Optional<Student> maxAvgStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade));

        // Находим студента с минимальным средним баллом
        Optional<Student> minAvgStudent = students.stream()
                .min(Comparator.comparingDouble(Student::getAverageGrade));


        maxAvgStudent.ifPresent(student -> System.out.println("Student with max average grade: " + student));
        minAvgStudent.ifPresent(student -> System.out.println("Student with min average grade: " + student));
    }

    private static List<Integer> generateGrades() {
        Random random = new Random();
        return IntStream.range(0, 10)
                //Этот метод является частью потока IntStream.
                // Он преобразует каждый элемент потока IntStream (индекс i) в объект.
                .mapToObj(i -> random.nextInt(5) + 1) // включительно 5
                .collect(Collectors.toList());
    }
}


