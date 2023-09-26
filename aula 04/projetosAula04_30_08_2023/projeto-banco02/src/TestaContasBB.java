
public class TestaContasBB {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular="Fulano";
		conta1.numero=123;
		conta1.saldo=3000;
		
		Conta conta2 = new Conta();
		conta2.titular="Beltrano";
		conta2.numero=456;
		conta2.saldo=4000;
		
		if(conta2.saca(5000)==false)
			System.out.println("Saldo insuficiente.");
		
		Conta conta3 = new Conta();
		conta3.titular="Ciclano";
		conta3.numero=789;
		conta3.saldo=2500;
		
		if(conta3.saca(500)==false)
			System.out.println("Saldo insuficiente.");
		
		System.out.println("Conta 1:");
		System.out.println("Titular: "+conta1.titular);
		System.out.println("Numero: "+conta1.numero);
		System.out.println("Saldo: "+conta1.saldo);
		System.out.println("Conta 2:");
		System.out.println("Titular: "+conta2.titular);
		System.out.println("Numero: "+conta2.numero);
		System.out.println("Saldo: "+conta2.saldo);
		System.out.println("Conta 3:");
		System.out.println("Titular: "+conta3.titular);
		System.out.println("Numero: "+conta3.numero);
		System.out.println("Saldo: "+conta3.saldo);
	}

}
