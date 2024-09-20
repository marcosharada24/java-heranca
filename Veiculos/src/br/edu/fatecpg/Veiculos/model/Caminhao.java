package br.edu.fatecpg.Veiculos.model;

public class Caminhao extends Veiculo {
    private double capacidadeCarga; // Capacidade de carga em toneladas
    private String tipoCarregamento; // Tipo de carregamento (ex: granel, contêiner)

    public Caminhao(String mod, String mrc, String cor, int ano, double capacidadeCarga, String tipoCarregamento) {
        super(mod, mrc, ano, cor); // Chama o construtor da superclasse
        this.capacidadeCarga = capacidadeCarga;
        this.tipoCarregamento = tipoCarregamento;
    }

    // Métodos para ligar e desligar
    public void ligar() {
        System.out.println("Caminhão ligado.");
    }

    public void desligar() {
        System.out.println("Caminhão desligado.");
    }

    public void carga() {
        System.out.println("Carga realizada. Capacidade: " + capacidadeCarga + " toneladas.");
    }

    public void entregou() {
        System.out.println("Entrega realizada.");
    }

    // Getters e Setters (opcional)
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoCarregamento() {
        return tipoCarregamento;
    }

    public void setTipoCarregamento(String tipoCarregamento) {
        this.tipoCarregamento = tipoCarregamento;
    }
}
