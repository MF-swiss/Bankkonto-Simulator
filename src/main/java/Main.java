import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount konto = new BankAccount("Max", 1000);

        while (true) {
            System.out.println("\n1. Kontostand anzeigen");
            System.out.println("2. Einzahlen");
            System.out.println("3. Abheben");
            System.out.println("4. Beenden");
            System.out.print("Auswahl: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Kontostand: " + konto.getBalance());
                    break;
                case 2:
                    System.out.println("Betrag: ");
                    konto.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Betrag: ");
                    konto.withdraw(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Programm beendet.");
                    sc.close();
                    return;
                default:
                    System.out.println("Ungültige Auswahl.");
            }
        }
    }
}