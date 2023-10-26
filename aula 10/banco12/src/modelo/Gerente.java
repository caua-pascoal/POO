package modelo;

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	
	public int getSenha() {
		return this.senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	

	@Override
	public double getBonificacao() {
		return super.salario * 0.30;
	}
	
	@Override
	public boolean autentica(int senha) {
		if(senha==this.senha)
			return true;
		else 
			return false;
	}
}
