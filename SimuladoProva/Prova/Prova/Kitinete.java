package Prova;

public class Kitinete extends Habitacao {

    public Kitinete(float areaConstruida, int numQuartos, int numBanheiros, boolean garagem, EnumTiposPiso tipoPiso) {
        super(areaConstruida, numQuartos, numBanheiros, garagem, tipoPiso);
    }

    public Kitinete() {
        super();
    }


    /**
     * Sobrecarga na subclasse, para retornar seus dados aproveitando o
     * toString() da classe mãe.
     *
     * @return String com todos os dados da Kitinete (nesse caso é tudo da
     * classe Habitação)
     */
    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    @Override
    public float retornarBaseCalculo() {
        return (float) 10.0;
    }
}
