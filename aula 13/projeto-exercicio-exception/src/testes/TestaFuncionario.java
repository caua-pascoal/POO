package testes;
import modelo.Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("John Arias");
		func.setSalario(400000);
		//func.setTipo(0);
		
		System.out.println("Dados do Funcionário:");
		System.out.println("Nome: "+func.getNome());
		System.out.println("Salário: "+func.getSalario());
		System.out.println("Bonificação: "+func.getBonificacaoNatalina());
	}
}
