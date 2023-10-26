package modelo;

public class ContabilizadorDeBonificacoes {
    private double totalEmBonificacoes = 0;

    public double getTotalEmBonificacoes() {
        return totalEmBonificacoes;
    }

    public void contabilizaBonificacao( Funcionario f ) {
        this.totalEmBonificacoes += f.getBonificacao();
    }
}
