package task6;

public class Account {
	// Data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = "123456";
        this.accountHolderName = "Pradeep Kumar";
        this.balance = 220.0; // 
    }

    // Constructor with parameters
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using no-argument constructor
        Account defaultAccount = new Account();
        System.out.println("Account Holder: " + defaultAccount.accountHolderName);
        System.out.println("Initial Balance: $" + defaultAccount.checkBalance());

        // Using constructor with parameters
        Account customAccount = new Account("123456", "Kumar", 300.0);
        System.out.println("Account Holder: " + customAccount.accountHolderName);
        System.out.println("Initial Balance: $" + customAccount.checkBalance());

        // Testing deposit and withdrawal
        customAccount.deposit(200);
        System.out.println("Balance after deposit: $" + customAccount.checkBalance());

        customAccount.withdraw(100);
        System.out.println("Balance after withdrawal: $" + customAccount.checkBalance());

        customAccount.withdraw(700); // Invalid withdrawal
    }
}

