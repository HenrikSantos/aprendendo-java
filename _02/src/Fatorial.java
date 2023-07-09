import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber seu fatorial");
        int numeroFatorial = sc.nextInt();
        int total = 1;

        for (int i = numeroFatorial; i != 0; i--) {
            total = total * i;
        }

        System.out.println(total);

        sc.close();
    }
}
