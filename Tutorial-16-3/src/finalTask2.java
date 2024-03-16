import java.util.Scanner;

public class finalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        // Check for exactly one @ symbol
        int atSymbolCount = 0;
        for (char ch : email.toCharArray()) {
            if (ch == '@') {
                atSymbolCount++;
            }
        }
        if (atSymbolCount != 1) {
            System.out.println("Reason: Email must contain exactly one @ symbol.");
            return false;
        }

        // Split email into local part and domain part
        String[] parts = email.split("@");
        String localPart = parts[0];
        String domainPart = parts[1];

        // Check for at least one "." after @ symbol, but not immediately after
        if (!domainPart.contains(".") || domainPart.indexOf(".") == 0 || domainPart.indexOf(".") == domainPart.length() - 1) {
            System.out.println("Reason: Email domain must have at least one '.' and not be immediately after @ symbol.");
            return false;
        }

        // Check domain part length
        if (domainPart.length() < 3) {
            System.out.println("Reason: Email domain must be at least 3 characters long.");
            return false;
        }

        return true;
    }
}
