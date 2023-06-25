package Aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trator novoTrator = new Trator("Amarelo", "wv", 0, false, false);
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Mostrar características do trator");
            System.out.println("2 - Ligar o trator");
            System.out.println("3 - Andar com o trator");
            System.out.println("4 - Reduzir a marcha");
            System.out.println("5 - Subir a marcha");
            System.out.println("6 - Desligar o trator");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    novoTrator.mostrarCarac();
                    break;
                case 2:
                    novoTrator.ligar();
                    break;
                case 3:
                    novoTrator.andar();
                    break;
                case 4:
                    novoTrator.reduzirMarcha();
                    break;
                case 5:
                    novoTrator.subirMarcha();
                    break;
                case 6:
                    novoTrator.desligar();
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        } while (opcao != 0);
    }
}