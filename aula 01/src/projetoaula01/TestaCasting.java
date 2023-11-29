package projetoaula01;

public class TestaCasting {
	public static void main(String[] args) {
		int x=5;
		System.out.println("x: "+x);
		//casting implicito (casting de promoção) 
		double num1 = x;
		System.out.println("num1: "+num1);
		num1 = num1/2;
		//Casting explícito
		x= (int) num1;
		System.out.println("x: "+x);
		
		String num2="10";
		//x=(int) num2; Não rola!!!
		//num2 = (String) x; //Não rola
		
		char letra = 'a';
		System.out.println("Letra: "+letra);
		//implicito
		int letraAsc= letra;
		System.out.println("Letra: "+letraAsc);
		System.out.println("Letra: "+(char) letraAsc);
		
		float num3= (float) num1;
		System.out.println(num3);
		num3=5.4f;
		long numeroGrandao = 700000000000000000l;
	}
}
