import java.util.Scanner;

public class PostoDeGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;

        System.out.printf("Digite o código:%n1 para Alcool;%n2 para Gasolina;%n3 para Diesel;%n4 para finalizar%n");
        int codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) Alcool += 1;
            if (codigo == 2) Gasolina += 1;
            if (codigo == 3) Diesel += 1;

            System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n%n", Alcool, Gasolina, Diesel);

            System.out.printf("Digite o código:%n1 para Alcool;%n2 para Gasolina;%n3 para Diesel;%n4 para finalizar%n");
            codigo = sc.nextInt();
        }

        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n%n", Alcool, Gasolina, Diesel);

        System.out.println("Muito obrigado!");

        sc.close();
    }
}
