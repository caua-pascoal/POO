package modelo;

public class ContabilizadorDeImpostos {
    private double totalDeImpostos;

    public void contabiliza(Tributavel t) {
        this.totalDeImpostos += t.getValorDoImposto();
    }

    public double getTotalDeImpostos() {
        return totalDeImpostos;
    }
}
