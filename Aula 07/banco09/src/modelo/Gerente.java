package modelo;
public class Gerente extends Funcionario{
    private int senha;

    public int getSenha() {
        return this.senha;
    }

    public void setSenha( int senha ) {
        this.senha = senha;
    }

    public boolean autentica( int senha ) {
        return this.senha == senha;
    }

    public boolean autentica( String login, int senha ) {
        return login == "CEFET" && this.senha == senha;
    }

    @Override
    public double getBonificacao() {
        return super.salario * 0.30;
    }

    
}
