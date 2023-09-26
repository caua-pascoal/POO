
public class TestaContas {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular="Fulano";
		conta1.numero=123;
		conta1.saldo=3000;
		
		Conta conta2 = new Conta();
		conta2.titular="Beltrano";
		conta2.numero=456;
		conta2.saldo=4000;
		
		conta2.saca(1000);
		
		conta1.transferePara(conta2,2000);
		
		System.out.println("Conta 1:");
		conta1.mostraDados();
		System.out.println("Conta 2:");
		conta1.mostraDados();
	}

}
