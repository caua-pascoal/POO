package testes;
import modelo.Funcionario;
import modelo.Gerente;

public class TestaReferencias {
    public static void main ( String[] args ) {
        Gerente g1 = new Gerente();
        g1.setNome("Rafael");
        g1.setSalario(2000);
        g1.setSenha(123);

        int x = 10;
        double y = x;
        System.out.println(y);

        Funcionario g2 = new Gerente();
        g2.setNome("Cauã");
        g2.setSalario(3000);

        // g2 = g1;
    
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Salário: " + g1.getSalario());
        System.out.println("Bonificacao: " + g1.getBonificacao());

        System.out.println("Nome: " + g2.getNome());
        System.out.println("Salário: " + g2.getSalario());
        System.out.println("Bonificacao: " + g2.getBonificacao());
    }
}