public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        
    }

    public void deposit(double amount) {
        if (amount <= ) {
            System.out.println("Betrag muss positiv sein.");
            return;
        }
        balance += amount;
    }

    public void wirhdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Betrag muss positiv sein.");
            return;
        }
        if (amount > balance) {
            System.out.println("Nicht genügend Guthaben.";
            return;
        }
        balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}