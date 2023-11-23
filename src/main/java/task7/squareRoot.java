package task7;

public class squareRoot {
    public static void main(String[] args) {
        try {
            double result = calculateSquareRoot(25);
            System.out.println("Pierwiastek kwadratowy z 25: " + result);

            double negativeResult = calculateSquareRoot(-10);
            System.out.println("Pierwiastek kwadratowy z -10: " + negativeResult);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej.");
        }
        return Math.sqrt(number);
    }
}