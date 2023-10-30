package modelo;

public class Gerente extends FuncionarioAutenticavel{
	@Override
	public double getBonificacao() {
		return super.salario * 0.30;
	}
}
