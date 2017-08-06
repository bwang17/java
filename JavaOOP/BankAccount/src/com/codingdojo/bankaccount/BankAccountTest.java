package com.codingdojo.bankaccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getAccountNumber());
        bankAccount.deposit("checking", 1000);
        bankAccount.deposit("checking", 500);
        System.out.println(bankAccount.getCheckingBalance());

        bankAccount.deposit("saving", 10);
        bankAccount.deposit("saving", 5);
        System.out.println(bankAccount.getSavingBalance());
        System.out.println(bankAccount.accountBalance());
        System.out.println(bankAccount.getTotalMoney());

    }
}
