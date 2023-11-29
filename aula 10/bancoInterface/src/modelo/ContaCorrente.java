package modelo;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int numero) {
		// Invocando o construtor da superclasse. Construtores NÃO são herdados
		super(numero);
	}
	
	@Override
	public boolean saca(double valor) {
		if(valor<=0)
			return false;
		return super.saca(valor+0.50);
	}

	@Override
	public double getvalorDoImposto() {
		return super.saldo * 0.05;
	}
}
