import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount findAccount(String owner) {
        for (BankAccount acc : accounts) {
            if (acc.getOwner().equalsIgnoreCase(owner)) {
                return acc;
            }
        }
        return null;
    }

    public ArrayList<BankAccount> getAllAccounts() {
        return accounts;
    }
}
