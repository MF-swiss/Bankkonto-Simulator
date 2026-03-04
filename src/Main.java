import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        bank.addAccount(new BankAccount("Max", 1000));
        bank.addAccount(new BankAccount("Anna", 500));
        bank.addAccount(new BankAccount("Marco", 2000));

        while (true) {
            System.out.print("Name des Kontoinhabers: ");
            String owner = sc.next();
            BankAccount konto = bank.findAccount(owner);

            if (konto == null) {
                System.out.println("Konto nicht gefunden.");
                continue;
            }

            System.out.println("\n1. Kontostand anzeigen");
            System.out.println("2. Einzahlen");
            System.out.println("3. Abheben");
            System.out.println("4. Beenden");
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
                    default:
                        System.out.println("Ungültige Auswahl.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ungültige Eingabe. Bitte eine gültige Zahl eingeben.");
                sc.nextLine();
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Fehler: " + e.getMessage());
            }
        }
    }
}