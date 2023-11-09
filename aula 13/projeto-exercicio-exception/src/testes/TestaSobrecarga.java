package testes;

import modelo.Gerente;

public class TestaSobrecarga {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Bianchini");
		g.setSenha(123);
		
		if(g.autentica(123)==true)
			System.out.println("Senha ok. Acesso liberado");
		else
			System.out.println("Acesso negado. Senha invalida.");
		
		if(g.autentica("uerj",123)==true)
			System.out.println("Senha e login ok. Acesso liberado");
		else
			System.out.println("Acesso negado. Senha e/ou login invalido(s).");

	}

}
