import java.util.Scanner;

public class TempoDoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horário de entrada e saída");
        int entrada = sc.nextInt();
        int saida = sc.nextInt();

        if (entrada < saida) {
            System.out.printf("O jogo durou %d hora(s)", saida - entrada);
        } else {
            System.out.printf("O jogo durou %d hora(s)", (24 - entrada) + saida);
        }

        sc.close();
    }
}
