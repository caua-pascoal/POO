package modelo;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	//Construtor
	public Funcionario() {
	}
	//
	public abstract double getBonificacao();/* {	
		return this.salario * 0.10;
	}*/
	//get e set
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
