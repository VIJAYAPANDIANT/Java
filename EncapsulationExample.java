/* 

Encapsulation in Java

Definition:
- Encapsulation is the process of wrapping data (variables) and code acting on data (methods) together as a single unit.
- To achieve encapsulation:
  1. Declare the variables of a class as private.
  2. Provide public getter and setter methods to modify and view the variable values.

Benefits:
- Data hiding (users only have access through defined methods).
- Flexibility & Control (you can validate incoming values in setter methods).
- Read-only or Write-only classes can be created by omitting setters or getters.

Syntax:
class Encapsulated {
    private dataType value; // write-only or hidden
    
    public dataType getValue() { return this.value; }
    public void setValue(dataType val) { this.value = val; }
}

*/

/*

Access Modifiers in Java:

1. private: Accessible only within the same class.
2. default (no modifier): Accessible only within classes in the same package.
3. protected: Accessible in the same package and by subclasses in other packages.
4. public: Accessible from any class.

Example Program:
*/

class BankAccount {
    // Private variables (hidden data)
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter for accountHolder (Read-only access)
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (Controlled write access with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Vijay", 500.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modifying balance via setter methods
        account.deposit(200.0);
        System.out.println("Current Balance: $" + account.getBalance());

        account.withdraw(100.0);
        System.out.println("Final Balance: $" + account.getBalance());

        // Try invalid operation
        account.withdraw(1000.0); // Will show insufficient funds
    }
}

/*
Output:
Account Holder: Vijay
Initial Balance: $500.0
Deposited: $200.0
Current Balance: $700.0
Withdrew: $100.0
Final Balance: $600.0
Invalid withdrawal amount or insufficient funds.
*/
