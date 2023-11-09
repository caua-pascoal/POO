public class Conta {
    double saldo = 0;
    public double getSaldo() { return this.saldo; }
    
    public void deposita ( double quantidade ) {
        this.saldo += quantidade;
    }

    public void saca ( double quantidade ) {
        if ( (this.saldo) >= quantidade )
            this.saldo -= quantidade;
        else
            throw new SaldoInsuficienteException("saldo insuficiente");
    }
}
