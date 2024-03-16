import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // user input data
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Enter another number: ");
        int anotherNumber = input.nextInt();
        System.out.println(number + " + " + anotherNumber + " = " + (number + anotherNumber));
    }
}
