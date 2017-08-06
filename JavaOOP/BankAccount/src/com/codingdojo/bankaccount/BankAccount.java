package com.codingdojo.bankaccount;

import java.security.PublicKey;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance = 0;
    private double savingBalance;

    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;

    public BankAccount() {
        this.accountNumber = generateAccount();
        numberOfAccounts++;

    }

    private String generateAccount() {
        String acc = "";
        int min = 0;
        int max = 10;

        for(int i = 0; i < 10; i++) {
            int random = (int)(Math.random() * max + min);
            acc = acc.concat(String.valueOf(random));
        }
        return acc;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }


    public void deposit(String accountType, double amount) {
        String acc = accountType.toLowerCase();

        if(acc.equals("checking")) {
            this.checkingBalance += amount;
            totalMoney += amount;
        } else {
            System.out.println("Can't match the name with associate account");
        }

    }

    public void withdraw(String accountType, double amount) {
        String acc = accountType.toLowerCase();

        if(acc.equals("checking")) {
            if(this.checkingBalance - amount < 0) {
                System.out.println("Insufficient fund");
            } else {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            }
        } else if(acc.equals("saving")) {
            if(this.savingBalance - amount < 0) {
                System.out.println("Insufficient fund");
            } else {
                this.savingBalance -= amount;
                totalMoney -= amount;
            }
        } else {
            System.out.println("Can't match the name with associate account");
        }

    }

    public double accountBalance() {
        double total = this.checkingBalance + this.savingBalance;
        return total;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;

    }

}
