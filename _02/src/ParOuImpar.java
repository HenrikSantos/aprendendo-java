import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número");
        int number = sc.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        sc.close();
    }
}
