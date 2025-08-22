package com.tnsif.BankingSystem;

public abstract class Account {
    protected double balance;
    protected String accountNumber;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        new Bank(); // every new account increments count
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
