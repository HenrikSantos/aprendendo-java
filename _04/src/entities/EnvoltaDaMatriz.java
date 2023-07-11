package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnvoltaDaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz!");
        int l = sc.nextInt();
        int c = sc.nextInt();

        Integer[][] matriz = new Integer[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Digite o número da posição %d:%d\n", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número que você deseja saber sobre:");
        int numeroEscolhido = sc.nextInt();

        List<List<String>> numerosEnvolta = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != numeroEscolhido) continue;

                List<String> numeros = new ArrayList<>();

                if (matriz[i][j] != null) numeros.add(String.format("Position: %d:%d", i, j));
                if (j != 0 && matriz[i][j - 1] != null) numeros.add(String.format("Left: %d", matriz[i][j - 1]));
                if (j < (matriz[i].length - 1) && matriz[i][j + 1] != null) numeros.add(String.format("Right: %d", matriz[i][j + 1]));
                if (i != 0 && matriz[i - 1][j] != null) numeros.add(String.format("Up: %d", matriz[i - 1][j]));
                if (i < (matriz.length - 1) && matriz[i + 1][j] != null) numeros.add(String.format("Down: %d", matriz[i + 1][j]));

                numerosEnvolta.add(numeros);

            }
        }

        for (List<String> numero : numerosEnvolta) {
            System.out.println(numero);
        }

        sc.close();
    }
}
