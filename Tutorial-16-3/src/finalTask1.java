import java.util.Scanner;

public class finalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            generatePyramid(rows);
        }

        scanner.close();
    }

    public static void generatePyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces before numbers
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Print decreasing numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
