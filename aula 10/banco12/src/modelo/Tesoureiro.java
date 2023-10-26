package modelo;

public class Tesoureiro extends Funcionario implements Autenticavel{
	private int senha;
	
	public int getSenha() {
		return this.senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(senha==this.senha)
			return true;
		else 
			return false;
	}
	
	@Override
	public double getBonificacao() {
		return super.salario * 0.20;
	}
}
