package modelo;

public class ContabilizadorDeBonificacoes {
	private double totalDeBonificacoes;

	public void contabilizaBonificacao(Funcionario f) {
		this.totalDeBonificacoes += f.getBonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return totalDeBonificacoes;
	}
}
