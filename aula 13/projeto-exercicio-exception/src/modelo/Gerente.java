package modelo;

public class Gerente extends Funcionario implements Autenticavel{
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
	
	public Gerente() {
		this.autenticador = new AutenticadorLogica();
	}
	
	
	/*public boolean autentica(String login,int senhaFornecida) {
		if (senhaFornecida == this.senha && login=="cefet")
			return true;
		return false;
	}*/
	
	//@Override
		



	@Override
	public double getBonificacaoNatalina() {
		System.out.println("retornando a bonificacao de um gerente");
		return super.salario * 0.2;
	}





	
}
