public class Teste {
    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println("erro: " + e);
        }
        System.out.println("Fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do método 1");
        // try{
            metodo2();
        // } catch ( ArrayIndexOutOfBoundsException e ) {
        //     System.out.println("erro: " + e);
        // }
        System.out.println("Fim do metodo 1");
    }

    static void metodo2() {
        System.out.println("Inicio do método 2");

        int[] array = new int[10];

        // try {
            for ( int i = 0; i <= 15; i++ ) {
                array[i] = i;
                System.out.println(i);
            }
        // } catch ( ArrayIndexOutOfBoundsException e ) {
        //     System.out.println("erro: " + e);
        // }
        
        System.out.println("Fim do método 2");
    }

    
}
