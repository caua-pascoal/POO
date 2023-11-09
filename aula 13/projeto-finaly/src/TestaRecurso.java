public class TestaRecurso {
    public static void main( String[] args ) {
        Recurso recurso = new Recurso();
        try {
            recurso.utilizar();
        } catch (RecursoComProblemaException e) {
            System.out.println(e.getMessage());
        } finally {
            recurso.liberar();
        }
    }
}
