import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float gradeA = sc.nextFloat();
        float gradeB = sc.nextFloat();
        float gradeC = sc.nextFloat();

        float average = ((gradeA*0.2f) + (gradeB*0.3f) + (gradeC*0.5f));

        System.out.printf("MEDIA = %.1f\n", average);
    }
}
