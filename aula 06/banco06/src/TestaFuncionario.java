public class TestaFuncionario {
    public static void main ( String[] args ) {
        // Funcionario func = new Funcionario();
        // Caixa func = new Caixa();
        Gerente func = new Gerente();
        func.setNome("Rafael");
        func.setSalario(2000);

        System.out.println("Nome: " + func.getNome());
        System.out.println("Salário: " + func.getSalario());
        System.out.println("Bonificacao: " + func.getBonificacao());
    }
}