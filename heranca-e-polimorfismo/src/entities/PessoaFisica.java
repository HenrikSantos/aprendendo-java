package entities;

public class PessoaFisica extends Pessoa{
    public Double gastosComSaude;
    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double calculoDeImposto() {
        double totalAPagar = 0.0;

        if (getRendaAnual() < 20000) {
            totalAPagar = getRendaAnual() * 0.15;
        } else {
            totalAPagar = getRendaAnual() * 0.25;
        }

        if (gastosComSaude > 0) {
            totalAPagar -= gastosComSaude * 0.5;
        }

        return totalAPagar;
    }

    @Override
    public String toString() {
        return String.format("%s $ %.2f", getNome(), calculoDeImposto());
    }
}
