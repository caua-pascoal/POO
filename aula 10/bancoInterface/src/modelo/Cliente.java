package modelo;

public class Cliente {
	String nome;
	String cpf;
	String email;
	//Construtor
	
	public Cliente(String nome) {
		this.setNome(nome);//Aproveitando as regras do setNome
	}	
	public Cliente(String nome, String cpf) {
		this(nome);//Invocando o outro construtor que já tem as regras
		this.setCpf(cpf);//Reaproveitando a regra do cpf
	}	
	public Cliente() {

	}

	//Métodos acessores
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if(nome.length()<5)
			return;
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length()!=11)
			return;
		this.cpf = cpf;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		if(email.contains("@")==false)
			return;
		this.email = email;
	}

	public void exibeDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+this.cpf);
		System.out.println("Email: "+this.email);
	}
}
