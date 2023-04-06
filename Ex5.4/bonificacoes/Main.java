package bonificacoes;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String nome;
        String cpf;
        float salario;

        Scanner sc = new Scanner(System.in);
        Gerente g1 = new Gerente();

        System.out.printf("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.printf("\nDigite o seu CPF: ");
        cpf = sc.nextLine();
        System.out.printf("\nDigite o seu salário: ");
        salario = sc.nextFloat();

        g1.setNome(nome);
        g1.setCpf(cpf);
        g1.setSalario(salario);

        System.out.printf("A bonificação do %s é R$ %.2f", g1.getNome(), g1.calcularBonificacao());
    }

}
