package com.tnsif.BankingSystem;

public class SavingsAccount extends Account {
    private double interestRate = 0.03; // example 3%

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
