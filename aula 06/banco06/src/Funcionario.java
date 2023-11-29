public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario() {}

    public double getBonificacao() {
        return this.salario * 0.10;
    }

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
