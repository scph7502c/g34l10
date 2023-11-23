package task6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class contentUpperCase {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\data.txt";
        String outputFilePath = "C:\\Users\\damia\\OneDrive\\Pulpit\\FutureCollars\\Java\\Projekty\\g34l10\\src\\main\\resources\\output.txt";
        convertContentToUpperCase(inputFilePath, outputFilePath);
    }

    public static void convertContentToUpperCase(String inputFilePath, String outputFilePath) {
        Path inputPath = Paths.get(inputFilePath);
        Path outputPath = Paths.get(outputFilePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath.toFile())); BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath.toFile()))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String upperCaseLine = line.toUpperCase();
                writer.write(upperCaseLine);
                writer.newLine();
            }

            System.out.println("Zawartość pliku została przekształcona na wielkie litery i zapisana do output.txt.");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas operacji na plikach: " + e.getMessage());
        }
    }
}