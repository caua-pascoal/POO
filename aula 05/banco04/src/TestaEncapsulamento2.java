public class TestaEncapsulamento2 {
    public static void main (String[] args) {
        Conta umaConta = new Conta();
        umaConta.setNumero(1);
        umaConta.deposita(500);
        umaConta.getTitular().setNome("Rafael");
        umaConta.getTitular().setCpf("14998126717");
        umaConta.getTitular().setEmail("caua.junger@cefet-rj.br");

        umaConta.saca(1001); // vai impedir
        umaConta.deposita(-100); // vai impedir

        System.out.println("Numero: " + umaConta.getNumero());
        System.out.println("Saldo: " + umaConta.getSaldo());
        System.out.println("Titular: " + umaConta.getTitular().getNome());
        System.out.println("Cpf: " + umaConta.getTitular().getCpf());
        System.out.println("Email: " + umaConta.getTitular().getEmail());
    }
}
