package br.com.cefet.banco.modelo;

public class ContabilizadorDeBonificacoes {

	private double totalDeBonificacoes;
	
	public void contabilizaBonificacao(Funcionario f) {
		this.totalDeBonificacoes += f.getBonificacaoNatalina();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
