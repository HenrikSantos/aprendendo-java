package entities;

import java.util.Scanner;

public class MediaDePessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int numeroDePessoas = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[numeroDePessoas];

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.println("Digite o nome, idade e altura!");
            String nome = sc.next();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoas(nome, idade, altura);
        }

        double somaDasAlturas = 0;
        int pessoasComMenosDe16Anos = 0;

        for (Pessoas pessoa : pessoas) {
            somaDasAlturas += pessoa.altura;
            if (pessoa.idade < 16) pessoasComMenosDe16Anos++;
        }

        System.out.printf("Altura média: %.2f%n", somaDasAlturas / pessoas.length);
        System.out.printf("Pessoas com menos de 16: %.2f%%", ((pessoasComMenosDe16Anos * 100.0) / pessoas.length));

        sc.close();
    }
}
