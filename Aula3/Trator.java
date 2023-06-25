package Aula3;

public class Trator {
    String cor;
    private String marca;
    private int marcha;
    protected boolean revisado;
    protected boolean ligado;

    public Trator(String cor, String marca, int marcha, boolean revisado, boolean ligado) {
        this.cor = cor;
        this.marca = marca;
        this.marcha = marcha;
        this.revisado = revisado;
        this.ligado = ligado;
    }

    public void mostrarCarac() {
        System.out.println("Cor do trator: " + cor);
        System.out.println("Marca do trator: " + marca);
        System.out.println("Marcha do trator: " + marcha);
        System.out.println("Revisado: " + revisado);
        System.out.println("Ligado: " + ligado);
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O trator já está ligado");
        } else {
            ligado = true;
            System.out.println("O trator foi ligado");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O trator já está desligado");
        } else {
            ligado = false;
            System.out.println("O trator foi desligado");
        }
    }

    public void andar() {
        if (ligado == false) {
            System.out.println("O trator está desligado");
        } else {
            System.out.println("O trator está andando");
            ;
        }
    }

    public void reduzirMarcha() {
        if (!ligado) {
            System.out.println("O trator está desligado");
        } else if (marcha > 0) {
            marcha--;
            System.out.println("A marcha foi reduzida para " + marcha);
        } else {
            System.out.println("O trator está na marcha mínima");
        }
    }

    public void subirMarcha() {
        if (!ligado) {
            System.out.println("O trator está desligado");
        } else if (marcha < 3) {
            marcha++;
            System.out.println("A marcha foi aumentada para " + marcha);
        } else {
            System.out.println("O trator está na marcha máxima");
        }
    }
}
