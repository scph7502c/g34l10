package task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class reverseContent {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\data.txt";
        makeContentReversed(filePath);
    }

    public static void makeContentReversed(String filePath) {
        Path path = Paths.get(filePath);
        File file = new File(filePath);

        boolean exists = file.exists();
        boolean isReadable = file.canRead();

        if (!exists) {
            System.out.println("Plik nie istnieje.");
            return;
        }

        if (!isReadable) {
            System.out.println("Plik istnieje, ale nie można go odczytać.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            List<String> lines = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            System.out.println("Treść pliku w odwrotnej kolejności:");

            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }
}