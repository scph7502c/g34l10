package task0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MessagesFileCreator {

    public static void main(String[] args) {
        String[] lines = {
                "Kurs",
                "Java",
                "Lekcja 6",
                "Pliki",
                "Wyjątki",
                "Pliki",
                "Koniec pliku"
        };

        String filePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\data.txt";

        createFileWithContent(filePath, lines);
    }

    private static void createFileWithContent(String filePath, String[] lines) {
        Path path = Paths.get(filePath);

        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Plik " + path.getFileName() + " został pomyślnie utworzony.");
            }

            addContentToFile(path, lines);
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas tworzenia pliku: " + e.getMessage());
        }
    }

    private static void addContentToFile(Path path, String[] lines) throws IOException {
        Files.write(path, List.of(lines));
        System.out.println("Zawartość została pomyślnie dodana do pliku " + path.getFileName());
    }
}