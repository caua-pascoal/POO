package modelo;

public class Caixa extends Funcionario{
	private int numGuiche;

	public int getNumGuiche() {
		return numGuiche;
	}

	public void setNumGuiche(int numGuiche) {
		this.numGuiche = numGuiche;
	}
	
	@Override
	public double getBonificacaoNatalina() {
		System.out.println("retornando a bonificacao de um caixa");
		return super.salario * 0.15;
	}
}
