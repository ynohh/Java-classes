package Prova;

public class Apartamento extends Habitacao {
    private float areaSacada;
    private boolean elevador;
    private boolean churrasqueira;

    public Apartamento(float areaSacada, boolean elevador, boolean churrasqueira, float areaConstruida, int numQuartos, int numBanheiros, boolean garagem, EnumTiposPiso tipoPiso) {
      super(areaConstruida, numQuartos, numBanheiros, garagem, tipoPiso);
      this.areaSacada = areaSacada;
      this.elevador = elevador;
      this.churrasqueira = churrasqueira;
    }

    public Apartamento() {
      super();
      areaSacada = 0;
      elevador = false;
      churrasqueira = false;
    }

    public void setAreaSacada(float areaSacada) {
      this.areaSacada = areaSacada;
    }

    public float getAreaSacada() {
      return areaSacada;
    }

    public void setElevador(boolean elevador) {
      this.elevador = elevador;
    }

    public boolean getElevador() {
      return elevador;
    }

    public void setChurrasqueira(boolean churrasqueira) {
      this.churrasqueira = churrasqueira;
    }

    
    @Override
    public float retornarBaseCalculo() {
      return (float) 20.0;
    }
    
    /**
     * Sobrecarga na subclasse, para retornar seus dados aproveitando o toString() da classe mãe.
     * @return String com todos os dados do apartamento
     */ 
    public String toString() {
      String infos = super.toString() + "\n";//reaproveitando o método da classe mãe

       //adicionando as características próprias do apartamento
      infos += String.format("Área da Sacada: %.2f\n", areaSacada);
      infos += "Com Elevador: " + (elevador ? "Sim\n" : "Não\n");
      infos += "Com Churrasqueira: " + (churrasqueira ? "Sim" : "Não");

      return infos;
    }
}
 