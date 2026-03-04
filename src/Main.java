import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        Customer marco = new Customer("Marco", "C001");
        Customer anna = new Customer("Anna", "C002");

        bank.addCustomer(marco);
        bank.addCustomer(anna);

        marco.addAccount(new BankAccount(marco, 2000));
        marco.addAccount(new BankAccount(marco, 500));

        anna.addAccount(new BankAccount(anna, 1000));

        while (true) {
            System.out.print("Kundenname: ");
            String name = sc.next();
            Customer customer = bank.findCustomer(name);

            if (customer == null) {
                System.out.println("Kunde nicht gefunden.");
                continue;
            }

            System.out.println("Konten von " + customer.getName() + ":");
            for (int i = 0; i < customer.getAccounts().size(); i++) {
                System.out.println((i + 1) + ". Konto mit " + customer.getAccounts().get(i).getBalance() + " CHF");
            }

            System.out.print("Konto wählen: ");
            int index = sc.nextInt() - 1;

            if (index < 0 || index >= customer.getAccounts().size()) {
                System.out.println("Ungültige Auswahl.");
                continue;
            }

            BankAccount konto = customer.getAccounts().get(index);

            System.out.println("\n1. Kontostand anzeigen");
            System.out.println("2. Einzahlen");
            System.out.println("3. Abheben");
            System.out.println("4. Beenden");
            System.out.println("5. Neues Konto erstellen");
            System.out.println("6. Konto löschen");
            System.out.print("Auswahl: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Kontostand: " + konto.getBalance());
                        break;
                    case 2:
                        System.out.print("Betrag: ");
                        konto.deposit(sc.nextDouble());
                        break;
                    case 3:
                        System.out.print("Betrag: ");
                        konto.withdraw(sc.nextDouble());
                        break;
                    case 4:
                        System.out.println("Programm beendet.");
                        sc.close();
                        return;
                    case 5:
                        System.out.print("Startguthaben: ");
                        double start = sc.nextDouble();
                        BankAccount neuesKonto = new BankAccount(customer, start);
                        customer.addAccount(neuesKonto);
                        System.out.println("Neues Konto wurde erstellt.");
                        break;
                    case 6:
                        System.out.print("Welches Konto soll gelöscht werden? ");
                        int delIndex = sc.nextInt() - 1;

                        if (delIndex < 0 || delIndex >= customer.getAccounts().size()) {
                            System.out.println("Ungültige Auswahl.");
                            break;
                        }

                        customer.getAccounts().remove(delIndex);
                        System.out.println("Konto wurde gelöscht.");
                        break;
                    default:
                        System.out.println("Ungültige Auswahl.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ungültige Eingabe.");
                sc.nextLine();
            }
        }
    }
}