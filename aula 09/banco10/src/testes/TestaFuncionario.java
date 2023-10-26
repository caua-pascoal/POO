package testes;

import modelo.Caixa;
import modelo.ContabilizadorDeBonificacoes;
import modelo.Funcionario;
import modelo.Gerente;
import modelo.Tesoureiro;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Paulo");
		g.setSalario(4000);//
		Gerente g2 = new Gerente();
		g2.setNome("Henrique");
		g2.setSalario(5000);
		Caixa c = new Caixa();
		c.setNome("Cauã");
		c.setSalario(2000);
		Tesoureiro t = new Tesoureiro();
		t.setNome("Murilo");
		t.setSalario(3000);
		
		//Funcionario f = new Funcionario();
		
		ContabilizadorDeBonificacoes contabilizador = new ContabilizadorDeBonificacoes();
		contabilizador.contabilizaBonificacao(g);//1200
		contabilizador.contabilizaBonificacao(g2);//1500
		contabilizador.contabilizaBonificacao(t);//600
		contabilizador.contabilizaBonificacao(c);//200
		
		System.out.println(contabilizador.getTotalDeBonificacoes());
		
		
		
		
	}

}
