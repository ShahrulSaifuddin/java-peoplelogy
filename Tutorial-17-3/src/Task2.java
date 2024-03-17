public class Task2 {
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static int sumOfFirstNNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfFirstNNaturalNumbers(n - 1);
        }
    }
    public static void main(String[] args) {
        int number = 5;
        printMultiplicationTable(number);
        int sum = sumOfFirstNNaturalNumbers(number);
        System.out.println("Sum of first " + number + " natural numbers is: " + sum);
    }
}
