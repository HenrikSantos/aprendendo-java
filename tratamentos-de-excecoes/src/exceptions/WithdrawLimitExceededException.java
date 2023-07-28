package exceptions;

public class WithdrawLimitExceededException extends Exception {
    public WithdrawLimitExceededException() {
        super("Withdraw limit exceeded exception.");
    }
}
