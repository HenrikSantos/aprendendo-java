import java.util.Scanner;

public class IntervaloDeValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o Valor?");
        double valor = sc.nextDouble();


        if (valor < 0 || valor > 100) {
            System.out.println("Fora de intervalo");
        } else if (valor < 25) {
            System.out.println("Intervalo [0, 25]");
        } else if (valor < 50) {
            System.out.println("Intervalo [25, 50]");
        } else if (valor < 75) {
            System.out.println("Intervalo [50, 75]");
        } else if (valor <= 100) {
            System.out.println("Intervalo [75, 100]");
        }

        sc.close();
    }
}
