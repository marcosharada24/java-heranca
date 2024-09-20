package br.edu.fatecpg.Veiculos.model;

public class Carro extends Veiculo {
    private int num_passageiros;
    private String tipo;

    public Carro(String mod, String mrc, String cor, int ano, int num_pass, String tipo) {
        super(mod, mrc, ano, cor); // Chama o construtor da superclasse
        this.num_passageiros = num_pass;
        this.tipo = tipo;
    }

    public void acelerar() {
        System.out.println("Acelerou");
    }

    // Getters e Setters (opcional, mas recomendado)
    public int getNumPassageiros() {
        return num_passageiros;
    }

    public void setNumPassageiros(int num_passageiros) {
        this.num_passageiros = num_passageiros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
