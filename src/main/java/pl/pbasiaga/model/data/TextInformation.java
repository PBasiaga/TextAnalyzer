package pl.pbasiaga.model.data;

import java.util.HashMap;

public class TextInformation {

    private int wordCount;

    private double averageNumberOfLettersInWord;

    private String longestWord;

    private HashMap<Character, Integer> letterOccurrences;


    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public double getAverageNumberOfLettersInWord() {
        return averageNumberOfLettersInWord;
    }

    public void setAverageNumberOfLettersInWord(double averageNumberOfLettersInWord) {
        this.averageNumberOfLettersInWord = averageNumberOfLettersInWord;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    public HashMap<Character, Integer> getLetterOccurrences() {
        return letterOccurrences;
    }

    public void setLetterOccurrences(HashMap<Character, Integer> letterOccurrences) {
        this.letterOccurrences = letterOccurrences;
    }


}
