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

        return textInformation;
    }


}
