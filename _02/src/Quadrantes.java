import java.util.Scanner;

public class Quadrantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores");
        double eixoX = sc.nextDouble();
        double eixoY = sc.nextDouble();

        if (eixoX == 0 && eixoY == 0) {
            System.out.println("Origem");
        } else {
            if (eixoX > 0) {
                if (eixoY > 0) {
                    System.out.println("Q1");
                } else {
                    System.out.println("Q4");
                }
            } else {
                if (eixoY > 0) {
                    System.out.println("Q2");
                } else {
                    System.out.println("Q3");
                }
            }
        }

        sc.close();
    }
}
