package pl.pbasiaga.controller;

import java.io.FileNotFoundException;
import java.util.List;

import pl.pbasiaga.model.data.TextInformation;
import pl.pbasiaga.model.logic.Counter;
import pl.pbasiaga.model.logic.Reader;
import pl.pbasiaga.view.View;

public class Controller {

    private Reader fileReader;

    private Counter counter;

    private View view;

    private TextInformation textInformation;

    public Controller() {
        this.fileReader = new Reader();
        this.counter = new Counter();
        this.view = new View();
    }

    private void prepareFiles() throws FileNotFoundException {
        String filename = view.getFilePath();
        List<String> words = fileReader.getWordsFromFile(filename);
        counter.setWords(words);
        textInformation = counter.calculateTextInformation();
    }
}
