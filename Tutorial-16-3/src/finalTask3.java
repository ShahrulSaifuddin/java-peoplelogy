import java.util.Scanner;

public class finalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Custom Calculator");
        System.out.println("Available Operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Custom Operation");

        System.out.print("Enter the operation number: ");
        int operation = scanner.nextInt();

        double result = 0.0;

        switch (operation) {
            case 1: // Addition
                result = performAddition(scanner);
                break;
            case 2: // Subtraction
                result = performSubtraction(scanner);
                break;
            case 3: // Multiplication
                result = performMultiplication(scanner);
                break;
            case 4: // Division
                result = performDivision(scanner);
                break;
            case 5: // Modulus
                result = performModulus(scanner);
                break;
            case 6: // Custom Operation
                result = performCustomOperation(scanner);
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }

    public static double performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    public static double performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    public static double performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    public static double performDivision(Scanner scanner) {
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }

        return dividend / divisor;
    }

    public static double performModulus(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Modulus by zero.");
            return Double.NaN;
        }

        return num1 % num2;
    }

    public static double performCustomOperation(Scanner scanner) {
        System.out.print("Enter the custom operation (e.g., a*b or a+b): ");
        String operation = scanner.next();
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        switch (operation) {
            case "*":
                return num1 * num2;
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
                return num1 / num2;
            case "%":
                if (num2 == 0) {
                    System.out.println("Error: Modulus by zero.");
                    return Double.NaN;
                }
                return num1 % num2;
            default:
                System.out.println("Invalid custom operation.");
                return Double.NaN;
        }
    }
}
