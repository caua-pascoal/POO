package testes;

import modelo.Funcionario;
import modelo.Gerente;

public class TestaReferencias {

	public static void main(String[] args) {
		Funcionario g = new Gerente();
		g.setNome("Bianchini");
		g.setSalario(3000);
		
		int x = 20;
		double y = x;
		System.out.println(y);
		//Gerente é um Funcionario
		Funcionario g2 = new Gerente();
		g2.setNome("Saulin tricolor");
		//g2.autentica(123);
		g2.setSalario(3000);
		
		System.out.println(g.getNome());
		System.out.println(g.getSalario());
		System.out.println("###############################");
		System.out.println(g2.getNome());
		System.out.println(g2.getSalario());
	}

}
