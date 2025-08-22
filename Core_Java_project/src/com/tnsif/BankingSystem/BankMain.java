package com.tnsif.BankingSystem;

public class BankMain {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount sa = new SavingsAccount("SAV123", 1000);
        CheckingAccount ca = new CheckingAccount("CHK456", 2000);

        // Perform transactions
        Transaction tx = new Transaction();
        tx.performTransaction(sa, 500, "deposit");
        tx.performTransaction(ca, 300, "withdraw");

        // Display account info
        sa.displayAccountInfo();
        ca.displayAccountInfo();

        // Show total accounts created
        System.out.println("Total accounts created: " + Bank.getTotalAccounts());
    }
}
