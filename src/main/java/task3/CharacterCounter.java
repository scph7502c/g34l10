package task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharacterCounter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\data.txt";
        Path path = Paths.get(filePath);

        try {
            int characterCount = countCharactersInFile(path);
            System.out.println("Liczba znaków w pliku " + path.getFileName() + ": " + characterCount);
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }

    private static int countCharactersInFile(Path path) throws IOException {
        String fileContent = Files.readString(path);
        return fileContent.length();
    }
}