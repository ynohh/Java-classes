package exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        float result;

        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();

        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();

        result = calc.sum(num1, num2);

        System.out.println("The result is: " + result);

    }
}


