package modelo;

public class Conta {
    private Cliente titular;
    private double saldo;
    private int numero;

    // public Conta() {
    //     System.out.println("Instanciando um objeto do tipo Conta...");
    //     this.saldo = 500;
    //     this.titular = new Cliente();
    // }

    public Conta(int numero) {
        System.out.println("Instanciando um objeto do tipo Conta...");
        this.saldo = 500;
        this.titular = new Cliente();
        if (numero <= 0) {
            System.out.println("Número inválido para uma conta. A aplicação será encerrada");
            System.exit(0);
        }
        this.numero = numero;
    }

    public Conta(int numero, String nomeDoTitular) {
        System.out.println("Instanciando um objeto do tipo Conta...");
        this.saldo = 500;
        this.titular = new Cliente(nomeDoTitular);
        if (numero <= 0) {
            System.out.println("Número inválido para uma conta. A aplicação será encerrada");
            System.exit(0);
        }
        this.numero = numero;
    }

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

    public void exibeDados() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Dados do titular:");
        this.titular.exibeDados();
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

    // tornando imutável
    // public void setNumero (int numero) {
    //     if (numero <= 0) return;
    //     this.numero = numero;
    // }
}
