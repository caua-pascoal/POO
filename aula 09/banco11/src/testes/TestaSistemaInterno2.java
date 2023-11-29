package testes;

import modelo.Cliente;
import modelo.Diretor;
import modelo.Gerente;
import modelo.SistemaInterno;
import modelo.Tesoureiro;

public class TestaSistemaInterno2 {

	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno(123);
		
		Gerente g1 = new Gerente();
		g1.setNome("Gustavo");
		g1.setSenha(123);
		Gerente g2 = new Gerente();
		g2.setNome("Bernardo");
		g2.setSenha(124);
		Diretor d1 = new Diretor();
		d1.setNome("Ronald");
		d1.setSenha(123);
		Tesoureiro t1 = new Tesoureiro();
		t1.setNome("Ronald");
		t1.setSenha(123);
		Cliente cl1 = new Cliente();
		cl1.setNome("Ronald");
		cl1.setSenha(123);
	
		si.login(g1);
		si.login(g2);
		si.login(d1);
		si.login(t1);
	}

}
