package br.com.cefet.banco.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestaCollection {
    public static void main(String[] args) {
        List lista1 = new ArrayList();
        lista1.add("Rafael");
        lista1.add("Maria");
        lista1.add("Fulano");
        lista1.add("Rafael");

        //Percorre a lista
        for(int i = 0; i < lista1.size(); i++ )
            System.out.println(lista1.get(i));

        //Verifica e remove primeira ocorrência
        if( lista1.contains("Rafael") )
            lista1.remove("Rafael");

        Collections.sort(lista1);
        for(int i = 0; i < lista1.size(); i++ )
            System.out.println(lista1.get(i));
        
        lista1.remove("Maria");
        
        lista1.add(false);
        
        // Vai dar erro porque boolean não é ordenável (ClassCastException)
        // Collections.sort(lista1);
        
        for( Object elemento : lista1 )
        		System.out.println(elemento);

    }
}
