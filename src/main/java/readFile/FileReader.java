package readFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\data.txt";

        Path path = Paths.get(filePath);

        try {
            List<String> content = Files.readAllLines(path);
            System.out.println("Zawartość pliku " + path.getFileName() + ":");

            for (String line : content) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }
}