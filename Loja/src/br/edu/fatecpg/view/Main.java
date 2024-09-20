package br.edu.fatecpg.view;

import br.edu.fatecpg.Loja.model.Faxineiro;
import br.edu.fatecpg.Loja.model.Gerente;
public class Main {

	public static void main(String[] args) {
    
		Faxineiro faxi = new Faxineiro();
		faxi.solicitarMatrial();
		
		Gerente ger = new Gerente();
		ger.baterponto();
		ger.realizarVenda();
		ger.fecharCaixa();
	}

}
