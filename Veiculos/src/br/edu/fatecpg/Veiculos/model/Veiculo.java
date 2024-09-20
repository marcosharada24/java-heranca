package br.edu.fatecpg.Veiculos.model;

public class Veiculo {
public String modelo;
public String marca;
public int ano;
public String cor;

public Veiculo(String mod, String mrc, int ano2, String cor2) {
	this.modelo = modelo;
	this.marca = marca;
	this.ano = ano;
	this.cor = cor;
}
public void ligar() {
	System.out.println("ligou");
}
public void desligar() {
	System.out.println("desligou");
}
}
