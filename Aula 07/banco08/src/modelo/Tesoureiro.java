package modelo;

public class Tesoureiro extends Funcionario {
    @Override
    public double getBonificacao() {
        return super.salario * 0.20;
    }
}
