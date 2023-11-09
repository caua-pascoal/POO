package br.com.cefet.banco.modelo;

public final class Diretor extends Gerente{
	@Override
	public double getBonificacaoNatalina() {
		return super.salario *0.3;
	}
}
