package br.com.cefet.banco.testes;

import java.util.Comparator;

import br.com.cefet.banco.modelo.Conta;

public class ContaComparatorNome implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
	}

}
