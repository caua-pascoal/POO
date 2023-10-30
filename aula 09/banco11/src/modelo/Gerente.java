package modelo;

public class Gerente extends Funcionario implements Autenticavel {
	@Override
	public double getBonificacao() {
		return super.salario * 0.30;
	}

	protected int senha;
	
	public int getSenha() {
		return this.senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
    public boolean autentica(int senha) {
		return senha == this.senha;
	}
}
