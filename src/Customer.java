import java.util.ArrayList;

public class Customer {
    private String name;
    private String customerId;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}