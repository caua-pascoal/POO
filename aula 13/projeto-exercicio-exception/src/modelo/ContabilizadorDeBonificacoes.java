package modelo;

public class ContabilizadorDeBonificacoes {

	private double totalDeBonificacoes;
	
	public void contabilizaBonificacao(Funcionario f) {
		this.totalDeBonificacoes += f.getBonificacaoNatalina();
	}
	
	/*
	 * public void contabilizaBonificacao(Caixa c) { this.totalDeBonificacoes +=
	 * c.getBonificacaoNatalina(); }
	 * 
	 * public void contabilizaBonificacao(Tesoureiro t) { this.totalDeBonificacoes
	 * += t.getBonificacaoNatalina(); }
	 */
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
