import java.util.Scanner;

public class ValuenInAndOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.println("Digite quantos valores serão lidos!");
        int numeroDeValores = sc.nextInt();

        for (int i = 0; i != numeroDeValores; i++ ) {
            System.out.printf("Digite o valor n° %d%n", i + 1);
            int currentValue = sc.nextInt();

            if (currentValue >= 10 && currentValue <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.printf("in: %d %nout:%d", in, out);

        sc.close();
    }
}
