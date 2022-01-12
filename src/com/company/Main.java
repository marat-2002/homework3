package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("Вашем счете:" + bankAccount.getAmount() + "\nСколько хотите снять счета?");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        while (true) {
            try {
                System.out.println(bankAccount.getAmount());
                bankAccount.withDraw(sum);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;

            }
        }
    }
}
