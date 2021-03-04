package pl.pbasiaga.view;

import java.util.Scanner;

public class View {

    public String getFilePath() {
        System.out.println("Enter file's path: ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        return filename;
    }
}
