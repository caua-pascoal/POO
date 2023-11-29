package br.com.cefet.banco.testes;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestaCollection2 {
	public static void main(String[] args) {
		Set conjunto = new LinkedHashSet();
		
		conjunto.add("Rafael");
		conjunto.add("Maria");
		conjunto.add("Fulano");
		conjunto.add("Rafael"); // Vai retornar false e não vai adicionar
		
		System.out.println(conjunto);
		
		for (Object elemento : conjunto)
			System.out.println(elemento);
		
		if (conjunto.contains("Maria"))
			System.out.println("Maria esta no conjunto");
		else 
			System.out.println("Maria não esta no conjunto");
	}
}
