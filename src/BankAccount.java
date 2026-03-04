import java.util.ArrayList;

public class BankAccount {
    private Customer owner;
    private double balance;

    public BankAccount(Customer owner, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Startguthaben darf nicht negativ sein.");
        }
        this.owner = owner;
        this.balance = initialBalance;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    private ArrayList<Transaction> history = new ArrayList<>();

    public ArrayList<Transaction> getHistory() {
        return history;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Betrag muss positiv sein.");
        }
        balance += amount;
        history.add(new Transaction("Einzahlung", amount));
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Betrag muss positiv sein.");
        }
        if (amount > balance) {
            throw new IllegalStateException("Nicht genügend Guthaben.");
        }
        balance -= amount;
        history.add(new Transaction("Abhebung", amount));
    }
}