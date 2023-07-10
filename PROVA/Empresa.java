package PROVA;

public class Empresa implements ICMS{
    private String cnpj;
    private String nome;
    private String endereco;
    private float totalVendas;
    private float totalImpostos;


    //Construtor com todos os argumentos
    public Empresa(String cnpj, String nome, String enderco, float totalVendas, float totalImpostos) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = enderco;
        this.totalVendas = totalVendas;
        this.totalImpostos = totalImpostos;
    }  

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public float getTotalImpostos() {
        return totalImpostos;
    }

    public void efetuarVenda(int quantidade, float valorUnitario) {
        totalVendas += valorUnitario * quantidade;
    }

    public String toString() {
        String infos = "CNPJ da empresa: " + cnpj + "\n";
        infos += "Nome da empresa: " + nome + "\n";
        infos += "Endereco da empresa: " + endereco + "\n";
        infos += String.format("Total de Vendas da empresa: %.2f\n", totalVendas);

        return infos;
    }

    @Override
    public float calcularICMS(float base) {
        return totalImpostos = base * PERCENTUAL_ICMS/100; 
    }
}
