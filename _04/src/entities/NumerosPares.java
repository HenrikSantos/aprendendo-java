package entities;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar?");
        int qtdNumeros = sc.nextInt();
        int qtdDePares = 0;

        int[] numeros = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            numeros[i] = numero;

            if ((numero % 2) == 0) qtdDePares++;
        }

        System.out.println("Números pares: ");

        for (int numero : numeros) {
            if ((numero % 2) == 0) System.out.print(numero + " ");
        }

        System.out.println("\nQUANTIDADE DE PARES = " +  qtdDePares);

        sc.close();
    }
}
