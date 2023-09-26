
public class Conta {
	//características (atributos)
	Cliente titular = new Cliente();
	int numero;
	double saldo = 500;
	//comportamento (métodos/funcções)
	public boolean saca(double valor) {
		if(valor<=0 || valor>saldo) 
			return false;
		else {
			this.saldo = this.saldo-valor;
			//this.saldo-=valor;
			return true;
		}	
	}
	
	public boolean deposita(double valor) {
		if(valor>0) {
			this.saldo+=valor;
			return true;
		}else
			return false;
	}
	
	public boolean transferePara(Conta contaDestino,double valor) {
		//this = contaOrigem
		/*if(valor<=this.saldo) {
			this.saldo-=valor;
			contaDestino.saldo+=valor;
			return true;
		}else
			return false;*/
		if(this.saca(valor)==true)
			return contaDestino.deposita(valor);
		else
			return false;
	}
	
	public void mostraDados() {
		System.out.println("Numero: "+this.numero);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Titular da conta: ");
		this.titular.mostraDados();
	}
}
