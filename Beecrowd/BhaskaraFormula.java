import java.util.Scanner;

public class BhaskaraFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextFloat();
        double b = sc.nextFloat();
        double c = sc.nextFloat();

        double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        
        if(delta < 0 || a == 0 || delta != delta) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-b + delta) / (2 * a); 
            double R2 = (-b - delta) / (2 * a);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}