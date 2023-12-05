package task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedContent {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\data.txt";
        reverseFileContent(filePath);
    }

    public static void reverseFileContent(String filePath) {
        File file = new File(filePath);

        if (!file.exists() || !file.canRead()) {
            System.out.println(!file.exists() ? "Plik nie istnieje." : "Plik istnieje, ale nie można go odczytać.");
            return;
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            System.out.println("Odwrócona treść pliku:");

            for (String line : lines) {
                String[] words = line.split("\\s+");

                List<String> reversedWords = new ArrayList<>();
                for (String word : words) {
                    String reversedWord = reverseString(word);
                    reversedWords.add(reversedWord);
                }

                System.out.println(String.join(" ", reversedWords));
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}