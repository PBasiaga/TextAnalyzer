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
        textInformation.setLongestWord(findLongestWord());

        return textInformation;
    }

    private String findLongestWord() {

        String longestWord = words.stream()
                .max((word1, word2) -> word1.length() - word2.length())
                .map(Object::toString)
                .orElse("");

        return longestWord;
    }


}
