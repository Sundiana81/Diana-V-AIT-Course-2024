package classwork_15.string_mrthods;
// Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!" Выполнить практикум с этой строкой:
//
//    Распечатать последний символ строки.
//    Найти позицию подстроки “Java” в строке.
//    Проверить, содержит ли заданная строка подстроку “Java”.
//    Заменить все символы “o” на “a”.
//    Преобразуйте строку к верхнему регистру.
//    Преобразуйте строку к нижнему регистру.
//    Вырезать подстроку Java c помощью метода substring().
//    Проверить, заканчивается ли строка подстрокой “!!!”.
//    Проверить, начинается ли строка подстрокой “I'm proud”.

public class Homework_01 {


    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

        //  Распечатать последний символ строки.
        System.out.println("Last character: " + str.charAt(str.length() - 1));

        // Найти позицию подстроки “Java” в строке.
        int position = str.indexOf("Java");
        System.out.println("Position of substring \"Java\": " + position);

        // Проверить, содержит ли заданная строка подстроку “Java”.
        boolean containsJava = str.contains("Java");
        System.out.println("Does the string contain \"Java\": " + containsJava);

        // Заменить все символы “o” на “a”.
        String replacedStr = str.replace('o', 'a');
        System.out.println("String after replacing \"o\" with \"a\": " + replacedStr);

        // Преобразуйте строку к верхнему регистру.
        String upperStr = str.toUpperCase();
        System.out.println("String in upper case: " + upperStr);

        // Преобразуйте строку к нижнему регистру.
        String lowerStr = str.toLowerCase();
        System.out.println("String in lower case: " + lowerStr);

        // Вырезать подстроку Java c помощью метода substring().
        String substringJava = str.substring(position, position + 4);
        System.out.println("Extracted substring \"Java\": " + substringJava);

        // Проверить, заканчивается ли строка подстрокой “!!!”.
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Does the string end with \"!!!\": " + endsWithExclamation);

        // Проверить, начинается ли строка подстрокой “I'm proud”.
        boolean startsWithProud = str.startsWith("I'm proud");
        System.out.println("Does the string start with \"I'm proud\": " + startsWithProud);
    }
}





