package modelo;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean saca (double valor) {
        if (valor <= 0) return false;
        return super.saca(valor+0.50);
    }
}
