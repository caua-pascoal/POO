package modelo;

public class ValorInvalidoExeption extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ValorInvalidoExeption(double valor) {
        super("Valor inválido: " + valor);
    }
}
