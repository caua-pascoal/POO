package br.com.cefet.banco.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cefet.banco.modelo.ContaCorrente;
import br.com.cefet.banco.modelo.ContaPoupanca;
import br.com.cefet.banco.modelo.Conta;

public class TestaCollection3 {
	
	public static void main (String[] args) {
		List lista = new ArrayList();
		
		lista.add("Rafael");
		lista.add("Maria");
		lista.add("Fulano");
		
		ContaCorrente cc = new ContaCorrente(2);
		cc.deposita(5000);
		lista.add(cc);
		
		ContaPoupanca cp = new ContaPoupanca(1);
		cp.deposita(2500);
		lista.add(cp);
		
		// Sort não sabe como ordenar objetos.
		//Collections.sort(lista);
		for ( int i = 0; i < lista.size(); i++ ) {
			if (lista.get(i) instanceof Conta) {
				Conta conta = (Conta) lista.get(i);
				System.out.println("Conta n " + conta.getNumero() + " com saldo de R$" + conta.getSaldo());
			} else {
				System.out.println(lista.get(i));
			}
		}
	}

}
