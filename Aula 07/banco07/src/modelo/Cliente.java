package modelo;
public class Cliente {
    String nome;
    String cpf;
    String email;

    public Cliente () {}

    public Cliente (String nome) {
        this.setNome(nome);
    }

    public Cliente (String nome, String cpf) {
        this(nome); // Invocando o outro construtor que já tem as regras
        this.setCpf(cpf);
    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("E-mail: " + this.email);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(!this.cpfEhValido(cpf)) return;
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) return;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 4) return;
        this.nome = nome;
    }

    private boolean cpfEhValido(String cpf) {
        if(cpf.length() != 11)
            return false;
        return true;
    }
    /* 
    11) Qual é a razão para se ter métodos encapsulados?
        tornar validações e processo atômicos e reutilizáveis. Mantendo o princípio da responsabilidade única.

    12) Um método encapsulado faz parte da interface da minha classe?
        Não, um método encapsulado, idealmente, é privado apenas para a própria classe

    13) Preciso ter um método encapsulado para cada regra? 
        Não exatamente, a partir do momento que essa regra se repetir pelo menos uma vez já é candidata a virar um método encapsulado.

    14) Precisei alterar o código da minha classe de testes após a alteração?  
        Não, foi apenas uma modificação interna na classe. Muito bom pois permite manutenção rápida e precisa.
    */
}
