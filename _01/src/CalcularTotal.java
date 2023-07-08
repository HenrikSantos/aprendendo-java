import java.util.Locale;
import java.util.Scanner;

public class CalcularTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero de produtos desse tipo e o valor");
        int nProdutos1 = sc.nextInt();
        double valorProduto1 = sc.nextDouble();
        System.out.println("digite o numero de produtos desse tipo e o valor");
        int nProdutos2 = sc.nextInt();
        double valorProduto2 = sc.nextDouble();

        Locale.setDefault(Locale.US);
        System.out.printf("Valor a Pagar: %.2f", nProdutos1 * valorProduto1 + nProdutos2 * valorProduto2);
        sc.close();
    }
}
