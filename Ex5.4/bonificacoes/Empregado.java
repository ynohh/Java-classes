package bonificacoes;

public class Empregado {
    private String cpf;
    private String nome;
    protected float salario;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public float calcularBonificacao() {
        return salario * 1.1f;
    }
}
