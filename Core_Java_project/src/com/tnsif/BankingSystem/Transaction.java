package com.tnsif.BankingSystem;

public final class Transaction {
    private final double transactionFee = 5.0; // fixed fee for all transactions

    public final void performTransaction(Account account, double amount, String type) {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
            account.withdraw(transactionFee); // deduct fee
            System.out.println("Transaction fee of " + transactionFee + " applied.");
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee); // include fee in withdrawal
            System.out.println("Transaction fee of " + transactionFee + " applied.");
        } else {
            System.out.println("Invalid transaction type!");
        }
    }
}
