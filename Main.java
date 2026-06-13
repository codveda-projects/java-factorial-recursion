import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Factorial Calculator ===");
            boolean running = true;

            while (running) {
                System.out.print("Enter a number (or type 'exit' to quit): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    running = false;
                    System.out.println("Calculator closed. Goodbye!");
                } else {
                    try {
                        int number = Integer.parseInt(input);
                        long result = Factorial.factorial(number);
                        System.out.println("Factorial of " + number + " is: " + result);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter an integer or 'exit'.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }
        }
    }
}
