public class TestaAgregacao2 {
    public static void main (String[] args) {
        Conta umaConta = new Conta();
        umaConta.deposita(500);
        umaConta.titular.nome = "Rafael";
        umaConta.titular.cpf = "14998126717";
        umaConta.titular.email = "caua.junger@cefet-rj.br";

        umaConta.mostraDados();
    }
}
