package modelo;

public final class Diretor extends Gerente{
	@Override
	public double getBonificacaoNatalina() {
		System.out.println("retornando a bonificacao de um diretor");
		return super.salario *0.3;
	}
}
