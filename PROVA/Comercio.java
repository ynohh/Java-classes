package PROVA;

public class Comercio extends Empresa{
    private EnumComercio tipoComercio;

    public Comercio(EnumComercio tipoComercio, String cnpj, String nome, String enderco, float totalVendas, float totalImpostos) {
        super(cnpj, nome, enderco, totalVendas, totalImpostos);
        this.tipoComercio = tipoComercio;
    }

    @Override
    public float calcularICMS(float base) {
        return super.calcularICMS(base); 
    }
    @Override
    public String toString() {
        String infos = super.toString();

        infos += "Tipo de Comércio: " + tipoComercio.toString();
        infos += String.format("Total de Impostos: %.2f", calcularICMS(getTotalVendas()));

        return infos;
    }

}
