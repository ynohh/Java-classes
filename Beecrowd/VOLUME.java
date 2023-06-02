import java.util.Scanner;
import java.lang.Math;

public class VOLUME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextFloat();
        double volume = (4/3.0) * 3.14159 * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
