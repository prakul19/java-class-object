import java.util.Scanner;

public class AtmProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter account holder name: ");
            String accountHolder = scanner.nextLine();
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();

            // Create BankAccount object
            BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

            boolean exit = false;
            while (!exit) {
                System.out.println("\nMenu:");
                System.out.println("1. Display Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        account.displayBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option! Please choose again.");
                }
            }
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input! Please enter the correct details.");
        } finally {
            scanner.close();
        }
    }
}

// BankAccount class definition
class BankAccount {
    // Attributes
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid amount! Please enter a positive value.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Unable to withdraw.");
        } else {
            System.out.println("Invalid amount! Please enter a positive value.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

/*
Sample Input:
Enter account holder name: prakul
Enter account number: 12345
Enter initial balance: 1000
Choose an option: 1
Choose an option: 2
Enter amount to deposit: 500.0
Choose an option: 3
Enter amount to withdraw: 200.0
Choose an option: 4

Sample Output:
Current balance: 1000.0
Deposit successful! New balance: 1500.0
Withdrawal successful! New balance: 1300.0
*/
