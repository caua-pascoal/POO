package modelo;

public class Conta {
	// Atributos
	protected Cliente titular; //Apenas getTitular (IMUTÁVEL)
	protected double saldo; //getSaldo, saca, deposita, transferePara
	protected int numero; //getNumero, setNumero
	//Construtor padrão
	/*public Conta() {
		this.saldo = 500.0;
		this.titular = new Cliente();
		System.out.println("Construindo/instanciando uma conta....");
	}*/
	//Construtor que exige um núemro
	public Conta(int numero) {
		this.saldo = 500.0;
		this.titular = new Cliente();
		this.setNumero(numero);
		System.out.println("Construindo/instanciando uma conta....");
	}
	//Construtor que exige o número da conta e o nome do titular
	/*public Conta(int numero, String nomeDoTitular) {
		this.saldo = 500.0;
		this.titular = new Cliente(nomeDoTitular);
		this.setNumero(numero);
		System.out.println("Construindo/instanciando uma conta....");
	}*/
	//Métodos "acessores"
	private void setNumero(int numero) {
		if(! (numero>0) ) {
			System.out.println("Número inválido para criação de uma conta.");
			System.out.println("A aplicação será encerrada.");
			System.exit(0);
		}
		//atributo numero = argumento numero;
		this.numero = numero;	
	}
	public int getNumero() {
		return this.numero;
	}
	public Cliente getTitular(){
		return this.titular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	// Comportamento
	public void deposita(double valor) {
		if ( valor < 0 ) throw new ValorInvalidoExeption(valor);
		this.saldo += valor;
	}

	public void saca(double valor) {	
		if ( valor > this.saldo ) throw new ValorInvalidoExeption(valor);
		this.saldo -=valor;
		return;
	}	
	
	public void mostraDados() {
		System.out.println("Número: "+this.numero);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Dados do titular:");
		this.titular.mostraDados();
	}
	
	public void transferePara(Conta contaDestino, double valor) {
		this.saca(valor);
		contaDestino.deposita(valor);
		return;
	}
}
