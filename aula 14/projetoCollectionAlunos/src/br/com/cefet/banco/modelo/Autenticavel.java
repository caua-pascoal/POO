package br.com.cefet.banco.modelo;

public interface Autenticavel {
	boolean autentica(int senha);
	void setSenha(int senha);
}
