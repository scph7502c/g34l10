package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class secondLineReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\data.txt";

        Path path = Paths.get(filePath);

        try {
            List<String> content = Files.readAllLines(path);
            System.out.println("Co druga linia pliku " + path.getFileName() + ":");

            for (int i = 1; i < content.size(); i += 2) {
                System.out.println(content.get(i));
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }
}