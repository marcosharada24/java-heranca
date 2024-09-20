package br.edu.fatecpg.Loja.model;

public class Faxineiro implements Funcionario {

	@Override
	public void baterponto() {
		System.out.println("Ponto registrado");
		
	}
	public void solicitarMatrial() {
		System.out.println("solocitou...");
	}

}
