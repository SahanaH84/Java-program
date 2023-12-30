import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class code2 {

    public static void main(String[] args) {
        try {
            checkPositiveNumbers("numbers.txt");
        } catch (PositiveNumberException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    static void checkPositiveNumbers(String filename) throws PositiveNumberException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > 0) {
                    throw new PositiveNumberException("Positive number found: " + number);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    static class PositiveNumberException extends Exception {
        public PositiveNumberException(String message) {
            super(message);
        }
    }
}
