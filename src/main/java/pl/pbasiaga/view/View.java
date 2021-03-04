package pl.pbasiaga.view;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

    public String getFilePath() {
        System.out.println("Enter file's path: ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        return filename;
    }

    public int showFileDetailsMenuAndGetSelectedPosition() {

        int option;

        try {
            System.out.println("Enter a number: ");
            System.out.println("[1] Show number of words in the file.");
            System.out.println("[2] Show longest word in the file.");
            System.out.println("[3] Show average number of letters in the file.");
            System.out.println("[4] Show occurrences of letters in file.");
            System.out.println("[0] Return");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
        } catch (InputMismatchException e) {
            option = -1;
        }
        return option;
    }

    public void showNumberOfWordsInFile(int number) {
        System.out.println("The number of words in your file is: " + number);
        System.out.println();
    }

    public void showLongestWordInFile(String word) {
        if (!word.equals("")) {
            System.out.println("The longest word in your file is: " + word);
        } else {
            System.out.println("There are no words in this file.");
        }
        System.out.println();
    }

    public void showAverageNumberOfLettersInWord(double number) {
        System.out.printf("Average number of letters in word is: %.2f \n", number);
        System.out.println();
    }

    public void showLetterOccurrences(HashMap<Character, Integer> letterOccurrences) {
        System.out.println("Number of letter occurrences: ");
        System.out.println();
        letterOccurrences.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();
    }

    public void showIncorrectNumberInformation() {
        System.out.println("Use only valid numbers.");
        System.out.println();
    }
}
