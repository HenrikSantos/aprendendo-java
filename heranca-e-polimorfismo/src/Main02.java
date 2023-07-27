import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of tax players? ");
        int nContribuidores = sc.nextInt();

        List<Pessoa> pessoas = new LinkedList<>();

        for (int i = 0; i < nContribuidores; i++) {
            System.out.println("Individual or company? (i/c)");
            char typeOfPeople = sc.next().charAt(0);

            if (typeOfPeople == 'i') {
                System.out.println("Name? ");
                String name = sc.next();
                System.out.println("Anual income? ");
                Double anualIncome = sc.nextDouble();
                System.out.println("Health expenditures? ");
                Double healthExpenditures = sc.nextDouble();

                pessoas.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            }

            if (typeOfPeople == 'c') {
                System.out.println("Name? ");
                String name = sc.next();
                System.out.println("annual income? ");
                Double annualIncome = sc.nextDouble();
                System.out.println("Number of employees ");
                Integer numberOfEmployees = sc.nextInt();

                pessoas.add(new PessoaJuridica(name, annualIncome, numberOfEmployees));
            }
        }

        Double totalTaxes = 0.0;
        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
            totalTaxes += pessoa.calculoDeImposto();
        }

        System.out.printf("TAXES PAID: $ %.2f\n", totalTaxes);

        sc.close();
    }
}
