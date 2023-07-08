import java.util.Locale;
import java.util.Scanner;

public class RaioDoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o raio do circulo?");
        double raio = sc.nextFloat();

        Locale.setDefault(Locale.US);
        System.out.printf("A = %.4f", 3.14159 * (raio * raio));

        sc.close();
    }
}
