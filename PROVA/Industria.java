package PROVA;

public class Industria extends Empresa implements IPI {
    private EnumIndustria tipoIndusria;

    public Industria(EnumIndustria tipoIndustria, String cnpj, String nome, String enderco, float totalVendas, float totalImpostos) {
        super(cnpj, nome, enderco, totalVendas, totalImpostos);
        this.tipoIndusria = tipoIndustria;
    }

    @Override
    public float calcularICMS(float base) {
        return super.calcularICMS(base); 
    }

    @Override
    public float calcularIPI(float base) {
        return base * PERCENTUAL_IPI/100;
    }
    
    @Override
    public String toString() {
        String infos = super.toString();

        infos += "Tipo de Indústria: " + tipoIndusria.toString() + "\n";
        infos += String.format("Total de Impostos: %.2f", (calcularICMS(getTotalVendas()) + calcularIPI(getTotalVendas())));
        

        return infos;
    }
}
