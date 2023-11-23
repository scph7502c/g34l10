package task8;

public class peselValidator {
    public static void main(String[] args) {
        try {
            validatePesel("12345678901");
        } catch (wrongTypeOfDataException | illegalLengthException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void validatePesel(String pesel) throws wrongTypeOfDataException, illegalLengthException {
        if (!pesel.matches("\\d+")) {
            throw new wrongTypeOfDataException("Numer PESEL powinien składać się tylko z cyfr.");
        }

        if (pesel.length() != 11) {
            throw new illegalLengthException("Numer PESEL powinien mieć dokładnie 11 cyfr.");
        }

        System.out.println("Numer PESEL jest poprawny.");
    }
}

class wrongTypeOfDataException extends Exception {
    public wrongTypeOfDataException(String message) {
        super(message);
    }
}

class illegalLengthException extends Exception {
    public illegalLengthException(String message) {
        super(message);
    }
}