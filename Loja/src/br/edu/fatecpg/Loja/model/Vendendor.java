package br.edu.fatecpg.Loja.model;

public abstract class Vendendor implements Funcionario{

	public void realizarVenda() {
		System.out.println("vendeu");
	}

	@Override
	public void baterponto() {
		System.out.println("Ponto Registado");
		
	}
}
