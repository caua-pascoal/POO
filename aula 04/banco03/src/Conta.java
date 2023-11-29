public class Conta {
    Cliente titular = new Cliente();
    double saldo = 500;
    int numero;

    public boolean saca (double valor) {
        if (valor > this.saldo)
            return false;
        this.saldo -= valor;
        return true;
    }

    public boolean deposita (double valor) {
        if (valor <= 0)
            return false;
        this.saldo += valor;
        return true;
    }

    public boolean transferePara (Conta contaDestino, double valor) {
        if( !this.saca(valor) )
            return false;
        return contaDestino.deposita(valor);
    }

    public void mostraDados() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Dados do titular:");
        this.titular.mostraDados();
    }
}
