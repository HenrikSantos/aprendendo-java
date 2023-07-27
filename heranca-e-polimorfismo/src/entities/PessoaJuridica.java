package entities;

public class PessoaJuridica extends Pessoa{
    public Integer numeroDeFuncionarios;
    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double calculoDeImposto() {
        double totalAPagar = 0.0;
        if (numeroDeFuncionarios < 10) {
            totalAPagar = getRendaAnual() * 0.16;
        } else {
            totalAPagar = getRendaAnual() * 0.14;
        }
        return totalAPagar;
    }

    public String toString() {
        return String.format("%s $ %.2f", getNome(), calculoDeImposto());
    }
}
