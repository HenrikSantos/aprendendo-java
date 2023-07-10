import entities.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Rectangle class");
        Rectangle x = new Rectangle();

        x.width = 3;
        x.height = 4;

        System.out.println(x.area());
        System.out.println(x.perimeter());
        System.out.println(x.diagonal());

        System.out.println();
        System.out.println("Employee class");
        Employee jose = new Employee();

        jose.grossSalary = 1200;
        jose.name = "Jose Valdo Pires de Souza";
        jose.tax = 1000;

        System.out.println(jose);

        jose.increaseSalary(999);

        System.out.println(jose);

        System.out.println();
        System.out.println("Student class");
        Student ricardinho = new Student();

        ricardinho.grade01 = 60;
        ricardinho.grade02 = 60;
        ricardinho.grade03 = 60;

        System.out.println(ricardinho);

        System.out.println();
        System.out.println("CurrencyConverter class");
        CurrencyConverter myConvert = new CurrencyConverter();

        System.out.println("Qual o atual valor do dólar?");
        double currentDollar = 3.1;
        myConvert.dollarPrice = currentDollar;
        System.out.println(currentDollar);

        System.out.println("Quanto você quer converter?");
        double amount = 200;
        System.out.println(amount);

        System.out.printf("Convertido R$%.2f", myConvert.convert(amount));

        System.out.println();
        System.out.println("ContaBancaria class");

        ContaBancaria josevaldo = new ContaBancaria("01", "Josevaldo");
        System.out.println(josevaldo);

        ContaBancaria marcelina = new ContaBancaria("02", "Marcelina", 20000);
        System.out.println(marcelina);

        marcelina.deposit(2000);
        System.out.println(marcelina);

        marcelina.withdraw(50000);
        System.out.println(marcelina);
    }
}