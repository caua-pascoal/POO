
public class TestaContas {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero=123;
		conta1.saldo=3000;
		
		/*Cliente umCliente = new Cliente();
		umCliente.nome="Paulo";
		umCliente.mostraDados();*/
		
		System.out.println();
		conta1.titular.nome="Rafael";
		conta1.titular.email="rafael@cefet-rj.br";
		conta1.titular.cpf="12345678910";
		//umCliente.nome="Rafael";
		
		
		System.out.println("Conta 1:");
		conta1.mostraDados();

	}

}
