package distancia;

import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        
        double distanciaKm = 328000.0;
        double distanciaMilhas = Distancia.kmParaMilhas(distanciaKm);
        double distanciaPes = Distancia.kmParaPes(distanciaKm);

        System.out.println("A distância média da Terra à Lua é de:");
        System.out.println(distanciaKm + "km");
        System.out.println(distanciaMilhas + " Milhas");
        System.out.println(distanciaPes + "Pés");
    }
}
