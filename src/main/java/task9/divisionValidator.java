package task9;

public class divisionValidator {
    public static void main(String[] args) {
        int value = 5;

        try {
            validate(value);
            System.out.println("Liczba jest podzielna przez 3.");
        } catch (IllegalArgumentException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }

    public static void validate(int value) throws IllegalArgumentException {
        if (value % 3 != 0) {
            throw new IllegalArgumentException("Liczba " + value + " nie jest podzielna przez 3.");
        }
    }
}