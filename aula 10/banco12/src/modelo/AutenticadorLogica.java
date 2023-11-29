package modelo;

public class AutenticadorLogica {
    private int senha;
	
	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
   
	public boolean autentica(int senha) {
		return senha == this.senha;
	}
}
