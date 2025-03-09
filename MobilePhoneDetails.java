import java.util.Scanner;

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter mobile phone brand: ");
            String brand = scanner.nextLine();
            System.out.print("Enter mobile phone model: ");
            String model = scanner.nextLine();
            System.out.print("Enter mobile phone price: ");
            double price = scanner.nextDouble();

            // Create MobilePhone object
            MobilePhone mobilePhone = new MobilePhone(brand, model, price);

            // Display mobile phone details
            mobilePhone.displayDetails();
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input! Please enter the correct details.");
        } finally {
            scanner.close();
        }
    }
}

class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

/*
Sample Input:
Enter mobile phone brand: Apple
Enter mobile phone model: iPhone 14
Enter mobile phone price: 75000

Sample Output:
Brand: Apple
Model: iPhone 14
Price: 75000
*/
