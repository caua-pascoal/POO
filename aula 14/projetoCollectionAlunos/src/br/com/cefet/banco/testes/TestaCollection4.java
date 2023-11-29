package br.com.cefet.banco.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cefet.banco.modelo.ContaCorrente;
import br.com.cefet.banco.modelo.ContaPoupanca;
import br.com.cefet.banco.modelo.Conta;

public class TestaCollection4 {
	
	public static void main (String[] args) {
		List<Conta> lista = new ArrayList();
		
		ContaCorrente cc = new ContaCorrente(2);
		cc.deposita(5000);
		ContaPoupanca cp = new ContaPoupanca(1);
		cp.deposita(2500);
		ContaCorrente cc2 = new ContaCorrente(4);
		cc.deposita(3000);
		lista.add(cc);
		lista.add(cp);
		lista.add(cc2);
		
		for ( int i = 0; i < lista.size(); i++ ) {
			Conta conta = lista.get(i);
			System.out.println("Conta n " + conta.getNumero() + " com saldo de R$" + conta.getSaldo());
		}
		
		// Como ordenar contas.
		Collections.sort(lista);
		
		for (Conta conta : lista ) {
			System.out.println("Conta n " + conta.getNumero() + " com saldo de R$" + conta.getSaldo());
		}
	}
}
