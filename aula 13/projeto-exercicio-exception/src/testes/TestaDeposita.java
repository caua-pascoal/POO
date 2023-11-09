package testes;

import modelo.Conta;
import modelo.ContaPoupanca;

public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca(1);
        try {
            cp.deposita(-100);
        } catch ( IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
    }
}
