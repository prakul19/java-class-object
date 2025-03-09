import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student roll number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Enter student marks: ");
            double marks = scanner.nextDouble();

            // Create Student object
            Student student = new Student(name, rollNumber, marks);

            // Display student details and grade
            student.displayDetails();
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input! Please enter the correct details.");
        } finally {
            scanner.close();
        }
    }
}

class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

/*
Sample Input:
Enter student name: prakul
Enter student roll number: 1
Enter student marks: 85

Sample Output:
Name: prakul
Roll Number: 1
Marks: 85.0
Grade: B
*/
