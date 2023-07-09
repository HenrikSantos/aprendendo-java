import java.util.Scanner;

public class CalcularDivisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número!");
        int numero = sc.nextInt();

        for (int i = 1; i <= Math.abs(numero); i++) {
            if ((numero % i) == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
