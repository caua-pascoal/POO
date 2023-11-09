package testes;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(1);
		cc.deposita(3000);
		
		Conta cp = new ContaPoupanca(2);
		cp.deposita(3000);
		cp.saca(500);
		
		cc.saca(500);
		
		//transferePara
		cc.transferePara(cp, 250);
		
		System.out.println("Saldo de cc: "+cc.getSaldo());
		System.out.println("Saldo de cp: "+cp.getSaldo());

	}

}
