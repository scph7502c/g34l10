package task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class wordSearch {
    private String filePath;
    private String searchWord;

    public wordSearch(String filePath, String searchWord) {
        this.filePath = filePath;
        this.searchWord = searchWord;
    }

    public static void performSearch(String filePath, String searchWord) {
        Path path = Paths.get(filePath);

        try {
            List<String> content = Files.readAllLines(path);
            System.out.println("Wyszukiwanie słowa '" + searchWord + "' w pliku " + path.getFileName() + ":");

            for (String line : content) {
                if (line.contains(searchWord)) {
                    System.out.println("Znaleziono słowo: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\data.txt";
        String searchWord = "Java";

        performSearch(filePath, searchWord);
    }
}