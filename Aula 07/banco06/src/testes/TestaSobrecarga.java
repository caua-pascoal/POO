package testes;
import modelo.Gerente;

public class TestaSobrecarga {
    public static void main ( String[] args ) {
        Gerente g1 = new Gerente();
        g1.setNome("Rafael");
        g1.setSalario(2000);
        g1.setSenha(123);

        Gerente g2 = new Gerente();
        g2.setNome("Cauã");
        g2.setSalario(3000);
        g2.setSenha(124);

        if( g1.autentica(123))
            System.out.println("Autenticado.");
        else
            System.out.println("Senha inválida.");

        if( g2.autentica("CEFET", 124))
            System.out.println("Autenticado.");
        else
            System.out.println("Login e/ou Senha inválido(s).");

    
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Salário: " + g1.getSalario());
        System.out.println("Bonificacao: " + g1.getBonificacao());

        System.out.println("Nome: " + g2.getNome());
        System.out.println("Salário: " + g2.getSalario());
        System.out.println("Bonificacao: " + g2.getBonificacao());
    }
}