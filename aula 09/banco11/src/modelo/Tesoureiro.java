package modelo;

public class Tesoureiro extends Funcionario implements Autenticavel {
	@Override
	public double getBonificacao() {
		return super.salario * 0.20;
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
