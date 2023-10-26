package modelo;
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario() {}

    public abstract double getBonificacao();

    public String getNome() {
        return this.nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario( double salario ) {
        this.salario = salario;
    }

}
