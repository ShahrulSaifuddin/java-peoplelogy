
public class Task1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; // Sample array
        int target = 30; // Integer to search for

        boolean isPresent = isIntegerPresent(array, target);

        if (isPresent) {
            System.out.println("Integer " + target + " is present in the array.");
        } else {
            System.out.println("Integer " + target + " is not present in the array.");
        }

        int[] marks = {85, 90, 75, 95, 80}; // Sample marks array

        double average = calculateAverage(marks);
        System.out.println("Average marks in Physics: " + average);
    }

    public static boolean isIntegerPresent(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
