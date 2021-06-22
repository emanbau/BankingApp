public class Account {
    // Class Variables
    String customerName;
    String customerID;
    int balance;
    String previousTransaction;

    // Constructor
    public Account(String name, String id) {
        customerName = name;
        customerID = id;
    }

    // Depositing Method
    public void deposit(int money) {
        if (money != 0) {
            balance += money;
            previousTransaction = "+ " + money;
        }
    }

    // Withdrawal Method
    public void withdraw(int money) {
        if (money != 0) {
            balance -= money;
            previousTransaction = "- " + money;
        }
    }

    // Previous Transaction Method
    public void previousTransaction() {

    }
}
