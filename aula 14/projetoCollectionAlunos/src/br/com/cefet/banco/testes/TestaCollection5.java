package br.com.cefet.banco.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cefet.banco.modelo.ContaCorrente;
import br.com.cefet.banco.modelo.ContaPoupanca;
import br.com.cefet.banco.modelo.Conta;

public class TestaCollection5 {
	
	public static void main (String[] args) {
		List<Conta> lista = new ArrayList();
		
		ContaCorrente cc = new ContaCorrente(2);
		cc.deposita(5000); cc.getTitular().setNome("Rafael");
		ContaPoupanca cp = new ContaPoupanca(1);
		cp.deposita(2500); cp.getTitular().setNome("Maria");
		ContaCorrente cc2 = new ContaCorrente(4);
		cc2.deposita(3000); cc2.getTitular().setNome("Fulano");
		lista.add(cc);
		lista.add(cp);
		lista.add(cc2);
		
		// Como ordenar contas.
		//Collections.sort(lista, new ContaComparatorSaldo());
		Collections.sort(lista, new ContaComparatorNome());
		
		for (Conta conta : lista ) {
			System.out.println("Conta n " + conta.getNumero() + " com saldo de R$" + conta.getSaldo() + " - Titular: " + conta.getTitular().getNome());
		}
	}
}
