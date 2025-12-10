//Program that creates a savings account object
//It deposits an amount of money entered by user
//Applies interest and displays the final balance
//REG NO:S08-8427-2024
import java.util.Scanner;

// Main class to run the program
public class BankTest {

    static class BankAccount {
        double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.printf("Deposited: $%.2f%n", amount);
            }
        }

        public void displayBalance() {
            System.out.printf("Current Balance: $%.2f%n", balance);
        }
    }

    // Child class that inherits from BankAccount
    static class SavingsAccount extends BankAccount {

        public SavingsAccount(double initialBalance) {
            super(initialBalance);
        }

        public void addInterest() {
            double interestRate = 0.05;
            double interestAmount = balance * interestRate;
            balance += interestAmount;
            System.out.printf("Interest applied (5%%): $%.2f%n", interestAmount);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creates a SavingsAccount object
        SavingsAccount myAccount = new SavingsAccount(0.0);

        // Deposits an amount entered by the user
        System.out.print("Enter amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);
        
        System.out.println("\n--- Interest Calculation ---");

        // Applies interest
        myAccount.addInterest();

        // Displays the final balance
        System.out.print("\nFinal Balance: ");
        myAccount.displayBalance();

        scanner.close();
    }
}