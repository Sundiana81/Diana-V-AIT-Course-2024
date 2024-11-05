package homework_01.students;
// Напишите программу, которая: Создает список студентов, зарегистрированных на два разных курса:
// "Математика" и "Информатика". Выводит: Список студентов, которые записаны на оба курса.
// Список студентов, которые записаны только на один из курсов. Условия:
// Используйте два HashSet для хранения студентов каждого курса.
// Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.

import java.util.HashSet;
import java.util.Set;

public class StudentCourse {
    public static void main(String[] args) {
        // Создаем списки студентов для каждого курса
        Set<String> mathStudents = new HashSet<>();
        Set<String> csStudents = new HashSet<>();

        // Добавляем студентов в курс "Математика"
        mathStudents.add("Olia");
        mathStudents.add("Nastia");
        mathStudents.add("Tania");
        mathStudents.add("Alex");

        // Добавляем студентов в курс "Информатика"
        csStudents.add("Alex");
        csStudents.add("Katia");
        csStudents.add("Olia");
        csStudents.add("Sergej");

        // Список студентов, зарегистрированных на оба курса (пересечение)
        Set<String> bothCourses = new HashSet<>(mathStudents);
        bothCourses.retainAll(csStudents);//Метод retainAll используется для нахождения пересечения двух множеств,
        // то есть оставляет в множестве только те элементы,
        // которые присутствуют и в текущем, и в переданном множестве.
        System.out.println("Students enrolled in both courses: " + bothCourses);

        // Список студентов, зарегистрированных только на один из курсов
        Set<String> onlyOneCourse = new HashSet<>(mathStudents);
        onlyOneCourse.addAll(csStudents); // Объединяем оба множества
        onlyOneCourse.removeAll(bothCourses); // Убираем студентов, записанных на оба курса
        System.out.println("Students enrolled in only one course: " + onlyOneCourse);
    }
}

