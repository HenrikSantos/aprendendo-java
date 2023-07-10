package entities;

public class ContaBancaria {
    private final String numeroDaConta;
    public  String nomeDoTitular;
    private double saldo;

    public ContaBancaria(String numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }
    public ContaBancaria(String numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = depositoInicial;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double amount) {
        this.saldo += amount;
    }

    public void withdraw(double amount) {
        this.saldo -= amount + 5;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
            "numeroDaConta='" + numeroDaConta + '\'' +
            ", nomeDoTitular='" + nomeDoTitular + '\'' +
            ", saldo=R$" + String.format("%.2f" ,saldo) +
        '}';
    }
}
