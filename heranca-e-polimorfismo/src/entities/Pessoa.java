package entities;

public abstract class Pessoa {
    private final String nome;
    private Double rendaAnual;

    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    abstract public Double calculoDeImposto();
}
