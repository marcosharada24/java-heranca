package br.edu.fatecpg.Calculadora.view;

import br.edu.fatecpg.Calcularora.model.Calculadora;
import br.edu.fatecpg.Calcularora.model.OperacaoMatematica; 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        OperacaoMatematica calc = new Calculadora();


        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();


        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("Soma: " + calc.soma(a, b));
        System.out.println("Subtração: " + calc.subtracao(a, b));
        System.out.println("Multiplicação: " + calc.multiplicacao(a, b));

        try {
            System.out.println("Divisão: " + calc.divisao(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

     
    }
}

