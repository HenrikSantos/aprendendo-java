import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o salário?");
        double salario = sc.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
            return;
        }

        if (salario <= 3000) {
            salario -= 2000;
            System.out.printf("R$ %.2f", (salario * 0.8));
            return;
        }

        if (salario <= 4500) {
            salario -= 2999.99;
            double imposto = 80;
            imposto += salario * 0.18;
            System.out.printf("R$ %.2f", imposto);
            return;
        }

        if (salario > 4500) {
            salario -= 4500;
            double imposto = 350;
            imposto += salario * 0.28;
            System.out.printf("R$ %.2f", imposto);
            return;
        }

        sc.close();
    }
}
