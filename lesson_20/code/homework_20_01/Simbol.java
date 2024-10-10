package homework_20_01;

import java.util.Scanner;

public class Simbol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        int totalChars = input.length();

        int upperCaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);


            if (Character.isUpperCase(currentChar)) {
                upperCaseCount++;
            }
            if (Character.isDigit(currentChar)) {
                digitCount++;
            }
            if (Character.isWhitespace(currentChar)) {
                spaceCount++;
            }
        }


        char lastChar = input.charAt(input.length() - 1);
        String sentenceType = "unknown sentence type";

        if (lastChar == '.') {
            sentenceType = "declarative sentence";
        } else if (lastChar == '?') {
            sentenceType = "interrogative sentence";
        } else if (lastChar == '!') {
            sentenceType = "exclamatory sentence";
        }


        System.out.println("Number of characters: " + totalChars);
        System.out.println("Number of uppercase characters: " + upperCaseCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("Sentence type: " + sentenceType);


        scanner.close();
    }
}
