package br.com.cefet.banco.modelo;

public class ContaCorrente extends Conta{
	public ContaCorrente(int numero) {
		super(numero);
	}
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor+0.50);
	}
}
