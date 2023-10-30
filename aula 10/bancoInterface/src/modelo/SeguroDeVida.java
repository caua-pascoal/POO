package modelo;

public class SeguroDeVida implements Tributavel {
    private int numero;
    private Cliente titular;
    private double valor;

    public SeguroDeVida( int numero, double valor, Cliente titular ) {
        this.numero = numero;
        this.setValor(valor);
        this.titular = titular;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor( double valor ) {
        this.valor = valor;

    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    @Override
	public double getValorDoImposto() {
		return this.getValor() * 0.07;
	}
    
}
