package Composicao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeUsuario = scanner.nextLine();

        String opcao;

        do {
            System.out.println("\n" + nomeUsuario + ", vamos ver se tá limpo!");
            Ambiente ambiente = new Ambiente();
            Agente agente = new Agente();

            System.out.println("Estado inicial:");
            ambiente.mostrarEstado();

            System.out.println("\nExecutando o Agente:");
            for (int i = 0; i < 5; i++) {
                agente.agir(ambiente);
            }

            System.out.println("\nEstado final:");
            ambiente.mostrarEstado();

            System.out.println("\nDeseja executar novamente?");
            System.out.println("1 - Sim!");
            System.out.println("2 - Não, encerra aí!");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextLine();

        } while (opcao.equals("1"));

        System.out.println("\nPrograma encerrado. Falow, " + nomeUsuario + "!");
        scanner.close();
    }
}

