import java.util.Scanner;

public class AcerteASenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Senha:");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida tente novamente!");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
