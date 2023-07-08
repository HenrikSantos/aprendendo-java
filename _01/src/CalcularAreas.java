import java.util.Scanner;

public class CalcularAreas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os 3 valores!");
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();

    System.out.printf(
            "TRIANGULO: %.3f\n CIRCULO: %.3f\n TRAPEZIO: %.3f\n QUADRADO: %.3f\n RETANGULO: %.3f",
            A * C / 2,
            3.14159 * (C * C),
            ((A + B) * C) / 2,
            B * B,
            A * B
    );

    sc.close();
    }
}
