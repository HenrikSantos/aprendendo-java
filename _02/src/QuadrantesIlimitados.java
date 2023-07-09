import java.util.Scanner;

public class QuadrantesIlimitados {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os valores");
    double eixoX = sc.nextDouble();
    double eixoY = sc.nextDouble();

    while(eixoX != 0 || eixoY != 0) {
        if (eixoX > 0) {
            if (eixoY > 0) {
                System.out.println("Quadrante 1");
            } else {
                System.out.println("Quadrante 4");
            }
        } else {
            if (eixoY > 0) {
                System.out.println("Quadrante 2");
            } else {
                System.out.println("Quadrante 3");
            }
        }
        System.out.println("Digite os valores");
        eixoX = sc.nextDouble();
        eixoY = sc.nextDouble();
    }

        System.out.println("Fim!");

        sc.close();
    }
}
