import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee id: ");
            int id = scanner.nextInt();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();

            // Create an Employee object
            Employee emp = new Employee(name, id, salary);

            // Display employee details
            emp.displayDetails();
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input, enter correct details.");
        } finally {

        }
    }
}

class Employee {
    // Attributes
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

/*
Sample Input:
Enter employee name: prakul
Enter employee id: 123
Enter employee salary: 55000.0

Sample Output:
Name: prakul
ID: 123
Salary: 55000.0
*/
