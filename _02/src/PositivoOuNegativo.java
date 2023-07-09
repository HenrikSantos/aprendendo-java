import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número?");
        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
