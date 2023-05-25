package Prova;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Habitacao> listaHabitacao = new ArrayList<>();

        //testando os construtores SEM parâmetros
        Casa c1 = new Casa();
        Apartamento a1 = new Apartamento();
        Kitinete k1 = new Kitinete();

        //testando os construtores COM parâmetros
        Casa c2 = new Casa(400f, "Vermelho", true, 600f, 4, 5, true, EnumTiposPiso.LAMINADO);
        Apartamento a2 = new Apartamento(25f, true, false, 200f, 2, 1, true, EnumTiposPiso.MARMORE);
        Kitinete k2 = new Kitinete(70f, 1, 1, false,EnumTiposPiso.GRANITO);

        //adicionando todos os objetos na lista
        listaHabitacao.add(c1);
        listaHabitacao.add(c2);
        listaHabitacao.add(a1);
        listaHabitacao.add(a2);
        listaHabitacao.add(k1);
        listaHabitacao.add(k2);
        
        //iterando sobre a lista para testar os métodos
        for(int i = 0; i < listaHabitacao.size(); i++) {
            Habitacao h = listaHabitacao.get(i);//obtendo o elemento atual da lista

            System.out.println("\n------------------\n");
            System.out.printf("%dª Habitação\n", i + 1 );

            float iptu = h.calculaIPTU();
            System.out.printf("IPTU: R$%.2f\n", iptu);

            System.out.println(h.toString());

        }
    }
}
