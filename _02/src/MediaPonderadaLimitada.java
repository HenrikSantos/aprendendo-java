import java.util.Scanner;

public class MediaPonderadaLimitada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de médias!");
        int numeroDeMedias = sc.nextInt();

        for (int i = 0; i < numeroDeMedias; i++) {
            System.out.printf("Digite os 3 valores da média n° %d%n", i + 1);
            double valor01 = sc.nextDouble();
            double valor02 = sc.nextDouble();
            double valor03 = sc.nextDouble();
            System.out.printf("Média n° %d %.1f%n", i + 1, (valor01 * 2 + valor02 * 3 + valor03 * 5) / 10);
        }

        sc.close();
    }
}