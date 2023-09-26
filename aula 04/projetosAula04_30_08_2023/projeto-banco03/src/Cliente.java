
public class Cliente {
	String nome;
	String cpf;
	String email;
	
	public void mostraDados() {
		System.out.println("Nome do titular: "+this.nome);
		System.out.println("E-mail do titular: "+this.email);
		System.out.println("Cpf do titular: "+this.cpf);
	}
}
