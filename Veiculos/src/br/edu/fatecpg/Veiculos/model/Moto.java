package br.edu.fatecpg.Veiculos.model;

public class Moto extends Veiculo {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;

    // Construtor
    public Moto(String modelo, String marca, String cor, int ano) {
        super(modelo, marca, ano, cor); // Chama o construtor da superclasse
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("Moto ligada.");
    }

    public void desligar() {
        System.out.println("Moto desligada.");
    }

    // Getters e Setters (opcional)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
