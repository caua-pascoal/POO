package br.com.cefet.banco.testes;

import java.util.Comparator;

import br.com.cefet.banco.modelo.Conta;

public class ContaComparatorSaldo implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		return (int) (c1.getSaldo() - c2.getSaldo());
	}
}
