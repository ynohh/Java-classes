package exercicio;

public class Calc {
    float num1, num2;

    public float sum(float num1, float num2) {
        float result;
        this.num1 = num1;
        this.num2 = num2;

        result = num1 + num2;

        return result;
    }

    public float sub(float num1, float num2) {
        float result;
        this.num1 = num1;
        this.num2 = num2;

        result = num1 - num2;

        return result;
    }

    public float mult(float num1, float num2) {
        float result;
        this.num1 = num1;
        this.num2 = num2;

        result = num1 * num2;

        return result;
    }

    public float div(float num1, float num2) {
        float result;
        this.num1 = num1;
        this.num2 = num2;

        result = num1 / num2;

        return result;
    }

    public float poten(float num1, float num2) {
        float result = 1;
        float base, expoent;

        base = num1;
        expoent = num2;

        for(; expoent != 0; expoent--) {
            result *= base;
        }

        return result;
    }

}
