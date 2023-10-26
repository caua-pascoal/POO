package modelo;

public class Cliente implements Autenticavel{
	private String nome;
	private String cpf;
	private String email;
	private int senha;
	
	public int getSenha() {
		return this.senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(int senha) {
		if(senha==this.senha)
			return true;
		else 
			return false;
	}
	
	public Cliente() {

	}
	
	public Cliente(String nome) {
		this.setNome(nome);
	}
	
	public Cliente(String nome, String cpf) {
		this(nome);
		this.setCpf(cpf);
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	/*public String getNome(String texto) {
		return texto+this.nome;
	}*/

	public void setNome(String nome) {
		if(nome.length()<4)
			return;
		this.nome = nome;
	}


	public String getCpf() {
		return this.cpf;
	}


	public void setCpf(String cpf) {
		if(this.cpfEhValido(cpf)==true)
			this.cpf = cpf;
	}
	
	private boolean cpfEhValido(String cpf) {
		if(cpf.length()!=11)
			return false;
		else
			return true;
	}


	public String getEmail() {
		return this.email;
	}


	public void setEmail(String email) {
		if(email.contains("@")==false)
			return;
		this.email = email;
	}


	public void mostraDados() {
		System.out.println("Nome do titular: "+this.nome);
		//System.out.println("Nome do titular: "+this.getNome("O nome e: "));
		System.out.println("E-mail do titular: "+this.email);
		System.out.println("Cpf do titular: "+this.getCpf());
	}

}
