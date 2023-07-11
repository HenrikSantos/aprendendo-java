package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos funcionários? ");
        int numeroDeFuncionarios = scanner.nextInt();
        System.out.println();

        Map<Integer, Employee> funcionarios = new HashMap<>();

        for (int i = 0; i < numeroDeFuncionarios; i++) {
            System.out.printf("Funcionário #%d:\n", i + 1);
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.println();

            if (funcionarios.containsKey(id)) {
                System.out.println("ID já existe!");
                return;
            }

            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.println();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            System.out.println();

            funcionarios.put(id, new Employee(nome, id, salario));
        }

        System.out.print("Digite o ID do funcionário para aumentar o salário: ");
        int idAumentoSalario = scanner.nextInt();
        System.out.println();

        Employee employeeToUpdate = funcionarios.get(idAumentoSalario);
        if (employeeToUpdate == null) {
            System.out.println("ID não encontrado");
        } else {
            System.out.print("Digite a porcentagem de aumento: ");
            double aumentoSalarioPorcentagem = scanner.nextDouble();
            System.out.println();

            employeeToUpdate.aumentarSalario(aumentoSalarioPorcentagem);
        }

        for (Employee employee : funcionarios.values()) {
            System.out.println(employee);
        }

        scanner.close();
    }

    public String nome;
    private final int id;
    private double salario;

    public Employee(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double aumentoSalarioPorcentagem) {
        this.salario *= (1 + aumentoSalarioPorcentagem / 100);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", ID: " + id + ", Salário: R$ " + String.format("%.2f", salario);
    }
}
