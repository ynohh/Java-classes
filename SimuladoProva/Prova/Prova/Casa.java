package Prova;

public class Casa extends Habitacao {
    private float areaPatio;
    private String cor;
    private boolean piscina;


    public Casa(float areaPatio, String cor, boolean piscina, float areaConstruida, int numQuartos, int numBanheiros, boolean garagem, EnumTiposPiso tipoPiso) {
      super(areaConstruida, numQuartos, numBanheiros, garagem, tipoPiso);
      this.areaPatio = areaPatio;
      this.cor = cor;
      this.piscina = piscina;
    }

    public Casa() {
      super();
      areaPatio = 0;
      cor = "";
      piscina = false;
    }

    public void setAreaPatio(float areaPatio) {
      this.areaPatio = areaPatio;
    }

    public float getAreaPatio() {
      return areaPatio;
    }

    public void setCor(String cor) {
      this.cor = cor;
    }

    public String getCor() {
      return cor;
    }

    public void setPiscina(boolean piscina) {
      this.piscina = piscina;
    }

    public boolean getPiscina() {
      return piscina;
    }

    @Override
    public float retornarBaseCalculo() {
      return (float) 30.0;
    }
    
     /**
     * Sobrecarga na subclasse, para retornar seus dados aproveitando o
     * toString() da classe mãe.
     *
     * @return String com todos os dados da casa
     */
    @Override
    public String toString() {
      String infos = super.toString() + "\n";//reaproveitando o método da classe mãe

      //adicionando as características próprias da casa
      infos += String.format("Área do Pátio: %.2f\n", areaPatio);
      infos += "Cor da Casa: " + cor + "\n";
      infos += "Com Piscina: " + (piscina ? "Sim\n" : "Não\n");

      return infos;
    }
}
