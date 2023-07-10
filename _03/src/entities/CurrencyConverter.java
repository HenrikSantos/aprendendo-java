package entities;

public class CurrencyConverter {
    public double dollarPrice = 5;
    public static final double IOF = 1.06;

    public double convert(double amount) {
        return amount * dollarPrice * IOF;
    }

    @Override
    public String toString() {
        return "CurrencyConverter{" +
            "dollarPrice=" + dollarPrice +
        '}';
    }
}
