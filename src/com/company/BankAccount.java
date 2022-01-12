package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    public double deposit(int sum){
        return amount += sum;
    }
    public void withDraw(int sum) throws LimitException{
        if (amount < sum){
            throw new LimitException("У вас недостаточно денег на счету.\nСчитано с карты:" + amount, amount);
        }
        amount -= sum;
    }
}
