package PROVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciando a Array List do tipo Empresa
        ArrayList<Empresa> listaEmpresa= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de empresas desejado: ");
        int op = sc.nextInt();

        float totalVendasInd = 0;
        float totalImpostosInd = 0;
        float totalVendasCom = 0;
        float totalImpostosCom = 0;

        
        for(int i = 0; i < op; i++) {
            if(i%2 != 0) {
                Comercio c1 = new Comercio(EnumComercio.VAREJO, "079837968", "TestandoImpares", "rua comercio", 0, 0);
                listaEmpresa.add(c1);
                for(int j = 0; j < 3; j++) {
                    c1.efetuarVenda(2, 9.99f);
                }
                totalVendasCom += c1.getTotalVendas();
                totalImpostosCom += c1.getTotalImpostos();
            } else {
                Industria i1 = new Industria(EnumIndustria.INTERMEDIARIA, "123458998", "TestandoPares", "Rua rua rua", 0, 0);
                listaEmpresa.add(i1);
                for(int j = 0; j < 3; j++) {
                    i1.efetuarVenda(2, 9.99f);
                }
                totalVendasInd += i1.getTotalVendas();
                totalImpostosInd += i1.getTotalImpostos();
            }
        }

        
        float totalGeralVendas = 0;
        float totalGeralImpostos = 0;

        //Percorrendo a lista
        for(int i = 0; i < listaEmpresa.size(); i++) {
            Empresa emp = listaEmpresa.get(i);//obtendo o elemento atual da lista

            System.out.println("\n------------------\n");
            System.out.printf("%dª Empresa\n", i + 1 );

            System.out.println(emp.toString());
            
            totalGeralVendas += emp.getTotalVendas();
            totalGeralImpostos += emp.getTotalImpostos();
        }
        System.out.println("\n-------------------------\n");
        System.out.println("DADOS GERAIS:");
        System.out.printf("Total de impostos das Indústrias: %.2f", totalImpostosInd);
        System.out.printf("\n");
        System.out.printf("Total de impostos dos Comércios: %.2f", totalImpostosCom);
        System.out.printf("\n");
        System.out.printf("Total de vendas das Indústrias: %.2f", totalVendasInd);
        System.out.printf("\n");
        System.out.printf("Total de vendas dos Comércios: %.2f", totalVendasCom);
        System.out.printf("\n");
        System.out.printf("Total Geral de Vendas:  %.2f", totalGeralVendas);
        System.out.printf("\n");
        System.out.printf("Total Geral de Impostos:  %.2f", totalGeralImpostos); 
    }
}