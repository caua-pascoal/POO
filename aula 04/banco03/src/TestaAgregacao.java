public class TestaAgregacao {
    public static void main (String[] args) {
        Conta umaConta = new Conta();
        Cliente umCliente = new Cliente();
        umCliente.nome = "Rafael";
        umaConta.deposita(500);
        umaConta.titular = umCliente;

        System.out.println(umCliente);
        System.out.println(umaConta.titular);
        System.out.println(umaConta.titular.nome);

        System.out.println("Nome do titular: " + umaConta.titular.nome);
        System.out.println("Saldo da conta: " + umaConta.saldo);
    }
}
