package JavaCoding;

class SavingsAccount {

    private double savingsBalance;
    private static double annualInterestRate;

    // Constructor
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Getter method
    public double getBalance() {
        return savingsBalance;
    }
}

// Test Class
public class SavingsAccountTest {

    public static void main(String[] args) {

        // Create two savers
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("After 4% Interest:");

        // Calculate interest for 12 months
        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.println("Saver1 Balance: " + saver1.getBalance());
        System.out.println("Saver2 Balance: " + saver2.getBalance());

        // Change interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate one more month interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nAfter 5% Interest for 1 month:");
        System.out.println("Saver1 Balance: " + saver1.getBalance());
        System.out.println("Saver2 Balance: " + saver2.getBalance());
    }
}