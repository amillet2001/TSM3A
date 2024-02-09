import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");
        System.out.println("Enter your expression (e.g., 2 + 2) or 'quit' to exit:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            String[] parts = input.split("\\s+");
            if (parts.length != 3) {
                System.out.println("Invalid input. Please enter expression in the format: number operator number");
                continue;
            }

            try {
                double num1 = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double num2 = Double.parseDouble(parts[2]);

                double result = 0;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operator. Please use one of: +, -, *, /");
                        continue;
                }

                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers for calculation.");
            }
        }
        scanner.close();
    }
}
