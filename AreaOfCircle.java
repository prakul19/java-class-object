import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter radius of the circle: ");
            double radius = scanner.nextDouble();

            // Create Object
            Circle circle = new Circle(radius);

            // Display area and circumference
            circle.displayArea();
            circle.displayCircumference();
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input,enter valid number.");
        } finally {

        }
    }
}

class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area
    public void displayArea() {
        System.out.println("Area of the circle: " + calculateArea());
    }

    // Method to display circumference
    public void displayCircumference() {
        System.out.println("Circumference of the circle: " + calculateCircumference());
    }
}

/*
Sample Input:
Enter radius of the circle: 5

Sample Output:
Area of the circle: 78.53981633974483
Circumference of the circle: 31.41592653589793
*/
