package br.edu.fatecpg.Login.view;

import br.edu.fatecpg.Login.model.SistemaDeSeguranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Digite o usuário: ");
            String usuario = scanner.nextLine().trim(); // Remover espaços em branco
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine().trim(); // Remover espaços em branco

            if (sistema.login(usuario, senha)) {
                loggedIn = true;
                System.out.println("Bem-vindo, " + usuario + "!");
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
            }
        }

        // Logout
        System.out.print("Deseja fazer logout? (s/n): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            sistema.logout();
            System.out.println("Você fez logout.");
        }

    }
}

