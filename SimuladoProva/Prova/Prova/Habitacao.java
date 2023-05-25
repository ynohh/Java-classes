package Prova;

public abstract class Habitacao implements IPTU {
    private float areaConstruida;
    private int numQuartos;
    private int numBanheiros;
    private boolean garagem;
    private EnumTiposPiso tipoPiso;

    //Construtor COM argumentos
    public Habitacao(float areaConstruida, int numQuartos, int numBanheiros, boolean garagem, EnumTiposPiso tipoPiso) {
        this.areaConstruida = areaConstruida;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.garagem = garagem;
        this.tipoPiso = tipoPiso;
    }

    //Construtor SEM argumentos
    public Habitacao() {
        this.areaConstruida = 0;
        this.numQuartos = 0;
        this.numBanheiros = 0;
        this.garagem = false;
        this.tipoPiso = EnumTiposPiso.CERAMICO; 
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
    
    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    
    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }
    
    public int getNumBanheiros() {
        return numBanheiros;
    }

    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }

    public boolean getGaragem() {
        return garagem;
    }

    public String toString() {
        String infos = String.format("Área construída: %.2f m2\n", areaConstruida);
        infos += String.format("Número de Quartos: %d\n", numQuartos);
        infos += String.format("Número de Banheiros: %d\n", numBanheiros);
        infos += "Com Garagem: " + (garagem ? "Sim\n" : "Não\n");
        infos += "Tipo do Piso: " + (tipoPiso.toString());

        return infos;
    }  

    public float calculaIPTU() {
        return areaConstruida * retornarBaseCalculo();
    }

}
