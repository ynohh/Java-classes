package Arrays;

import javax.xml.soap.MimeHeader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Contas minhasContas[] = new Contas[10];
        Contas c = new Contas();

        for(int i = 0; i < minhasContas.length; i++) {
            c = new Contas();
            System.out.printf("\nInsira o valor do saldo: ");
            c.setSaldo(sc.nextInt());
            minhasContas[i] = c;
        }   

        for(int i = 0; i < minhasContas.length; i++) {
            System.out.printf(minhasContas[i].getSaldo() + " | ");
        }
    }
}