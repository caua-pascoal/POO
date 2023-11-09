package modelo;

public class Tesoureiro extends Funcionario implements Autenticavel{
	private AutenticadorLogica autenticador;
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
	
	public Tesoureiro() {
		this.autenticador = new AutenticadorLogica();
	}
	
	@Override
	public double getBonificacaoNatalina() {
		System.out.println("retornando a bonificacao de um tesoureiro");

		return super.salario * 0.18;
	}
}
