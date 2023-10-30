package testes;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.ContabilizadorDeImpostos;
import modelo.SeguroDeVida;

public class TestaContabilizadorDeImpostos {
    public static void main(String[] args) {
        ContabilizadorDeImpostos contabilizador = new ContabilizadorDeImpostos();

        ContaCorrente cc  = new ContaCorrente(1);
        cc.getTitular().setNome("maria");
        cc.deposita(1000);
        ContaCorrente cc2 = new ContaCorrente(2);
        cc2.getTitular().setNome("pedro");
        cc2.deposita(2000);

        SeguroDeVida seguro = new SeguroDeVida(5, 1000, new Cliente("Fulando", "1234567890123"));
    }
}
