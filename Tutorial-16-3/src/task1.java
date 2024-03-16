import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Output message indicating the purpose of the program
        System.out.println("Welcome to the Student Percentage Calculator!");

        // Prompt the user to enter the name of the student
        System.out.print("Enter the name of the student: ");
        String studentName = scanner.nextLine();

        // Prompt the user to enter marks for each subject
        System.out.println("Enter marks obtained in each subject:");
        System.out.print("Subject 1: ");
        int subject1Marks = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2Marks = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3Marks = scanner.nextInt();
        System.out.print("Subject 4: ");
        int subject4Marks = scanner.nextInt();
        System.out.print("Subject 5: ");
        int subject5Marks = scanner.nextInt();

        // Calculate total marks obtained
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;

        // Calculate percentage
        double percentage = ((double) totalMarks / 500) * 100;

        // Output the result
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Close the Scanner
        scanner.close();
    }
}
