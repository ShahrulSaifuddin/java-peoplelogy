public class Task3 {
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee emp = new Employee(50000, "John Doe");

        // Getting and printing salary
        System.out.println("Current salary: " + emp.getSalary());

        // Getting and printing name
        System.out.println("Current name: " + emp.getName());

        // Changing name using setter
        emp.setName("Jane Doe");

        // Printing updated name
        System.out.println("Updated name: " + emp.getName());
    }
}

class Employee {
    private int salary;
    private String name;

    // Constructor
    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String newName) {
        this.name = newName;
    }
}
