import java.io.FileNotFoundException;

public class TestaFileNotFoundException {
    public static void main(String[] args) {
        try {
            // new java.io.FileInputStream("arquivo.txt");
            metodo1();
        } catch ( FileNotFoundException e ) {
            System.out.println("Não foi possível abrir o arquivo para leitura");
        }
    }

    public static void metodo1() throws FileNotFoundException {
        new java.io.FileInputStream("arquivo.txt");
    }
}
