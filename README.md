# Bankkonto-Simulator

Projektbeschreibung
Der Bankkonto‑Simulator ist eine einfache Java‑Konsolenanwendung, die grundlegende Bankfunktionen simuliert. Das Projekt dient als Übung für objektorientierte Modellierung, saubere Klassenstrukturen, GitHub‑Workflows und iterative Feature‑Entwicklung.
Die Anwendung unterstützt mehrere Kunden, mehrere Konten pro Kunde und grundlegende Kontoaktionen wie Einzahlen, Abheben und Kontostand abfragen. Weitere Features wie Transaktionshistorie und Kontotypen sind in Entwicklung.


Features
- Konto-Klassen erstellen ✔
- Einzahlen implementieren ✔
- Abheben implementieren ✔
- Konsolenmenü bauen ✔
- Kundenverwaltung ✔
- Mehrere Konten pro Kunde (Issue #8) ⏳
- Transaktionshistorie (Issue #9) ⏳
- Kontotypen (Vererbung) ⏳
- JUnit‑Tests ⏳


Architekturüberblick
- Customer — repräsentiert einen Kunden, verwaltet mehrere Konten
- BankAccount — repräsentiert ein Konto, enthält Saldo und Transaktionen
- Bank — verwaltet alle Kunden und deren Konten
- Transaction — beschreibt eine einzelne Transaktion (Einzahlung/Abhebung)
- Main — steuert den Konsolenablauf (Kunde → Konto → Aktion)


src/
 ├── Main.java
 ├── Bank.java
 ├── Customer.java
 ├── BankAccount.java
 └── Transaction.java   (ab Issue #9)
