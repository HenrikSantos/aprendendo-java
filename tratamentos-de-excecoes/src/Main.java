import entities.Account;
import exceptions.NotEnoughBalanceException;
import exceptions.WithdrawLimitExceededException;

public class Main {
    public static void main(String[] args) {
        Account Conta01 = new Account(1, "Henrik", 1.0, 9999.9);
        try {
            Conta01.withdraw(99999999.0);
            System.out.println(Conta01);
        } catch (WithdrawLimitExceededException | NotEnoughBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Conta01);
        }
    }
}