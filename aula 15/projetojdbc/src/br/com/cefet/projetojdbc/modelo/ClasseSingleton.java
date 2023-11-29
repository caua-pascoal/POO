package br.com.cefet.projetojdbc.modelo;

public class ClasseSingleton{
	private static ClasseSingleton instancia = null;

	private ClasseSingleton() {

	}

	public static synchronized ClasseSingleton getInstancia() {
		if(instancia==null)
			instancia=new ClasseSingleton();
		return instancia;
	}

}
