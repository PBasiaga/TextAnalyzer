package pl.pbasiaga.model.logic;

import java.util.HashMap;
import java.util.List;
import pl.pbasiaga.model.data.TextInformation;

public class Counter {

    List<String> words;

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }



    public TextInformation calculateTextInformation() {
        TextInformation textInformation = new TextInformation();
        textInformation.setWordCount(getWordCount());
        textInformation.setLongestWord(findLongestWord());
        textInformation.setLetterOccurrences(countLetterOccurrences());


        return textInformation;
    }

    private String findLongestWord() {

        String longestWord = words.stream()
                .max((word1, word2) -> word1.length() - word2.length())
                .map(Object::toString)
                .orElse("");

        return longestWord;
    }

    private int getWordCount() {

        return words.size();
    }

    private HashMap<Character, Integer> countLetterOccurrences() {
        HashMap<Character, Integer> occurrences = initOccurrences();

        for (String word : words) {
            for (char letter: word.toCharArray()) {
                if (Character.isLetter(letter)) {
                    char upperCaseLetter = Character.toUpperCase(letter);
                    Integer count = occurrences.get(upperCaseLetter);
                    count++ ;
                    occurrences.put(upperCaseLetter, count);
                }
            }
        }
        return occurrences;
    }

    private HashMap<Character, Integer> initOccurrences() {
        HashMap<Character, Integer> occurrences = new HashMap<>();
        occurrences.put('A', 0);
        occurrences.put('B', 0);
        occurrences.put('C', 0);
        occurrences.put('D', 0);
        occurrences.put('E', 0);
        occurrences.put('F', 0);
        occurrences.put('G', 0);
        occurrences.put('H', 0);
        occurrences.put('I', 0);
        occurrences.put('J', 0);
        occurrences.put('K', 0);
        occurrences.put('L', 0);
        occurrences.put('M', 0);
        occurrences.put('N', 0);
        occurrences.put('O', 0);
        occurrences.put('P', 0);
        occurrences.put('Q', 0);
        occurrences.put('R', 0);
        occurrences.put('S', 0);
        occurrences.put('T', 0);
        occurrences.put('U', 0);
        occurrences.put('V', 0);
        occurrences.put('W', 0);
        occurrences.put('X', 0);
        occurrences.put('Y', 0);
        occurrences.put('Z', 0);

        return occurrences;
    }


}
