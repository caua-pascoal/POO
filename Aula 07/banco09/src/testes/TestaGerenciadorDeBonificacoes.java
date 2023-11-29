package testes;
import modelo.ContabilizadorDeBonificacoes;
import modelo.Gerente;
import modelo.Tesoureiro;
import modelo.Caixa;

public class TestaGerenciadorDeBonificacoes {
    public static void main ( String[] args ) {
        Gerente g1 = new Gerente();
        g1.setNome("Rafael");
        g1.setSalario(2000);

        Gerente g2 = new Gerente();
        g1.setNome("Cauã");
        g1.setSalario(3000);

        Tesoureiro t1 = new Tesoureiro();
        t1.setNome("Cauã");
        t1.setSalario(3000);

        Caixa c1 = new Caixa();
        c1.setNome("Cauã");
        c1.setSalario(3000);

        ContabilizadorDeBonificacoes contabilizador = new ContabilizadorDeBonificacoes();
        contabilizador.contabilizaBonificacao(g1);
        contabilizador.contabilizaBonificacao(g2);
        contabilizador.contabilizaBonificacao(c1);
        contabilizador.contabilizaBonificacao(t1);

        System.out.println("Total em bonificacoes: R$" + contabilizador.getTotalEmBonificacoes());
    }
}
