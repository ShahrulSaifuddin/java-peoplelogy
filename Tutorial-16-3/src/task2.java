import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the current temperature in degrees Celsius:");
        double temperature = scanner.nextDouble();

        if (temperature >= 30) {
            System.out.println("It's hot outside! You can go swimming or have a picnic.");
        } else if (temperature >= 20 && temperature < 30) {
            System.out.println("The weather is pleasant. You can go for a walk or have a outdoor sports.");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's a bit cool. You might want to wear a jacket and go for a hike.");
        } else {
            System.out.println("It's cold outside. You can stay indoors and enjoy some hot cocoa.");
        }

        scanner.close();
    }
}
