public class TestaEncapsulamento {
    public static void main (String[] args) {
        Conta umaConta = new Conta();
        umaConta.deposita(500);
        umaConta.getTitular().nome = "Rafael";
        umaConta.getTitular().cpf = "14998126717";
        umaConta.getTitular().email = "caua.junger@cefet-rj.br";

        umaConta.saca(1001); // vai impedir
        umaConta.deposita(-100); // vai impedir

        System.out.println("Numero: " + umaConta.getNumero());
        System.out.println("Saldo: " + umaConta.getSaldo());

        // não pode deixar passar isso aqui também
        // umaConta.saldo = -2000;

        System.out.println("Numero: " + umaConta.getNumero());
        System.out.println("Saldo: " + umaConta.getSaldo());
    }
}
