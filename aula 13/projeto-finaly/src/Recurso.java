public class Recurso {
    public Recurso() {
        System.out.println("Obtendo um determinado recurso...");
    }

    public void utilizar() throws RecursoComProblemaException {
        System.out.println("Utilizando um determinado recurso...");
        if(2+2==4)
            throw new RecursoComProblemaException("Não foi possível utilizar o recurso.");
    }

    public void liberar() {
        System.out.println("Liberando/fechando um determinado recurso...");
    }
}
