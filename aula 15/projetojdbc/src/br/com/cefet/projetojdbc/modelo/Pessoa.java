package br.com.cefet.projetojdbc.modelo;

import java.util.Calendar;

public class Pessoa {
	private int id;
	private String nome;
	private Calendar dataDeNascimento;
	

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Pessoa(String nome) {
		this.setNome(nome);
	}

	public Pessoa(String nome, String dataDeNascimento) {
		this(nome);
		// a implementar
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
