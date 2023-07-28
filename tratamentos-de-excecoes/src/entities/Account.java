package entities;

import exceptions.NotEnoughBalanceException;
import exceptions.WithdrawLimitExceededException;

public class Account {
    private final Integer number;
    String holder;
    Double balance;
    Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getWithDrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws NotEnoughBalanceException, WithdrawLimitExceededException {
        if (balance <= 0) throw new NotEnoughBalanceException();
        if (withdrawLimit < amount) throw new WithdrawLimitExceededException();

        balance -= amount;
    }


    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
