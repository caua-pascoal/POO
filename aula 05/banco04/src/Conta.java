public class Conta {
    private Cliente titular = new Cliente();
    private double saldo = 500;
    private int numero;

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

    public double getSaldo () {
        return this.saldo;
    }

    public int getNumero () {
        return this.numero;
    }

    public Cliente getTitular () {
        return this.titular;
    }

    public void setNumero (int numero) {
        if (numero <= 0)
            return;
        this.numero = numero;
    }
}
