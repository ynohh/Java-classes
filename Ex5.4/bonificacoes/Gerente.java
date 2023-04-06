package bonificacoes;

public class Gerente extends Empregado {
    @Override
    public float calcularBonificacao() {
        return salario * 1.15f;
    }
    
}
