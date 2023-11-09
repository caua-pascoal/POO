import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestaPilha {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Início do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() throws FileNotFoundException {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}

	private static void metodo2()  {
		System.out.println("Início do método 2");
		//Funcionario f = null;
		//f.setNome("Fulano");
		
		//FileInputStream fi= new FileInputStream("arquivo.txt");

		/*int x = 9;
		int y = 0;
	
		int z = x / y;*/

		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}

		System.out.println("Fim do método 2");
	}
}
