package br.edu.fatecpg.Veiculos.view;

import br.edu.fatecpg.Veiculos.model.Carro; // Classe Carro
import br.edu.fatecpg.Veiculos.model.Moto; // Classe Moto
import br.edu.fatecpg.Veiculos.model.Caminhao; // Classe Caminhao

public class Main {

    public static void main(String[] args) {
        // Criando uma instância de Carro
        Carro carro = new Carro("logan", "renault", "prata", 2025, 3, "sedan");

        // Criando uma instância de Moto
        Moto moto = new Moto("modelomoto", "marcamoto", "preto", 2023); // Ajuste os parâmetros conforme necessário

        // Criando uma instância de Caminhao
        Caminhao caminhao = new Caminhao("modelocaminhao", "marcacaminhao", "branco", 2022, 15.0, "granel"); // Ajuste os parâmetros conforme necessário

        // Testando métodos do Carro
        carro.ligar();
        carro.desligar();

        // Testando métodos da Moto
        moto.ligar();
        moto.desligar();

        // Testando métodos do Caminhao
        caminhao.ligar();
        caminhao.carga(); 
        caminhao.entregou(); 
    }
}
