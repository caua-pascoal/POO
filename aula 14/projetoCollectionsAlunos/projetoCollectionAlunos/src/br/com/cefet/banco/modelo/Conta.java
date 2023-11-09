package br.com.cefet.banco.modelo;

public class Conta{
	// Atributos
	protected Cliente titular; // Apenas getTitular (IMUTÁVEL)
	protected double saldo; // getSaldo, saca, deposita, transferePara
	protected int numero; // getNumero, setNumero

	// Construtor que exige um número
	public Conta(int numero) {
		this.saldo = 500.0;
		this.titular = new Cliente();
		this.setNumero(numero);
	}

	// Métodos "acessores"
	private void setNumero(int numero) {
		if (!(numero > 0)) {
			System.out.println("Número inválido para criação de uma conta.");
			System.out.println("A aplicação será encerrada.");
			System.exit(0);
		}
		// atributo numero = argumento numero;
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	// Comportamento
	public boolean deposita(double valor) {
		if (!(valor > 0))
			return false;
		else {
			// this.saldo += valor; // Faz a mesma coisa que a linha abaixo
			this.saldo = this.saldo + valor;
			return true;
		}
	}

	public boolean saca(double valor) {
		if (valor > this.saldo) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public void mostraDados() {
		System.out.println("Número: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Dados do titular:");
		this.titular.mostraDados();
	}

	public boolean transferePara(Conta contaDestino, double valor) {
		if (this.saca(valor) == true) {
			boolean conseguiuDepositar = contaDestino.deposita(valor);
			return conseguiuDepositar; // O retorno será true, o mesmo do método deposita
		}
		return false;
	}
}
