import java.util.Scanner;

public class MultiplosOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os números");
        int numero01 = sc.nextInt();
        int numero02 = sc.nextInt();

        if ((numero01 % numero02) == 0 || (numero02 % numero01) == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
