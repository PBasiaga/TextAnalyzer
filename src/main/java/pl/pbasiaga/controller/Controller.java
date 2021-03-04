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

    private void handleFileMenu() {
        int menuValue = 1;
        while (menuValue != 0) {
            menuValue = view.showFileDetailsMenuAndGetSelectedPosition();
            switch (menuValue) {
                case 1:
                    view.showNumberOfWordsInFile(textInformation.getWordCount());
                    break;
                case 2:
                    view.showLongestWordInFile(textInformation.getLongestWord());
                    break;
                case 3:
                    view.showAverageNumberOfLettersInWord(textInformation.getAverageNumberOfLettersInWord());
                    break;
                case 4:
                    view.showLetterOccurrences(textInformation.getLetterOccurrences());
                    break;
                case 0:
                    return;
                default:
                    view.showIncorrectNumberInformation();
                    break;

            }

        }

    }
}
