public class Cliente {
    String nome;
    String cpf;
    String email;

    public void mostraDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("E-mail: " + this.email);
    }
}
