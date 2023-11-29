package modelo;

public class Tesoureiro extends Funcionario implements Autenticavel {
	private AutenticadorLogica autenticador = new AutenticadorLogica();

	@Override
	public double getBonificacao() {
		return super.salario * 0.20;
	}
	
	@Override
	public boolean autentica (int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}
