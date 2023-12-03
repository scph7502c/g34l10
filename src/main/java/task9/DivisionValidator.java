package task9;

public class DivisionValidator {
    public static void main(String[] args) {
        int value = 10;
        int divisor = 5;

        try {
            checkDivisibility(value, divisor);
            System.out.println("Liczba jest podzielna przez " + divisor + ".");
        } catch (IllegalArgumentException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }

    public static void checkDivisibility(int value, int divisor) throws IllegalArgumentException {
        if (value % divisor != 0) {
            throw new IllegalArgumentException("Liczba " + value + " nie jest podzielna przez " + divisor + ".");
        }
    }
}