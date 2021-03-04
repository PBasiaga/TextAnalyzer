package pl.pbasiaga.model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Reader {

    public List<String> getWordsFromFile(String filename) throws FileNotFoundException {

        List<String> wordsList = new ArrayList<>();
        String sentenceWithoutSpecialSigns;

        Scanner scanner = new Scanner(new FileReader(filename));
        scanner.useDelimiter("\n");
        while (scanner.hasNextLine()) {

            sentenceWithoutSpecialSigns = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", " ");
            sentenceWithoutSpecialSigns = sentenceWithoutSpecialSigns
                    .strip()
                    .replaceAll("\\s+", " ");

            String[] words = sentenceWithoutSpecialSigns.split(" ");

            for (String word : words) {
                wordsList.add(word);
            }
        }

        return wordsList;
    }

}