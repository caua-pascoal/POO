public class TestaConstrutor {
    public static void main (String[] args) {
        Conta umaConta = new Conta(1);
        // umaConta.setNumero(1); // não existe mais
        umaConta.getTitular().setNome("Rafael");
        
        umaConta.deposita(500);
        umaConta.saca(1001); // vai impedir
        umaConta.deposita(-100); // vai impedir

        umaConta.exibeDados();

        System.out.println("#############");

        Conta outraConta = new Conta(26, "Renata");
        outraConta.saca(300);
        outraConta.exibeDados();

        Cliente umCliente = new Cliente("Cauã Pascoal");
        umCliente.exibeDados();

        Cliente outroCliente = new Cliente("Pedro", "12345678901");
        outroCliente.exibeDados();
    }
}
