package projetoaula01;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		System.out.print("Olá Mundo!!");
		System.out.println("Fiz meu primeiro programa.");
		
		int idade = 35;
		idade = idade+1;
		System.out.println("Minha idade e "+idade);
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		
		int i=0;
		while(i<10) {
			if(i%2==0)
				System.out.println(i);
			i++;
		}
		
		double nota1,nota2;
		nota1=10;
		nota2=2.8;
		double media = (nota1+nota2)/2;
		
		String nomeDoAluno = "Botelho";
		char situacao;
		if(media>8)
			situacao='A';
		else if(media>=6)
			situacao='B';
		else if(media>=4)
			situacao='C';
		else if(media>=2)
			situacao='D';
		else
			situacao='E';
		
		int faltas=21;
		//Operador ternário
		boolean reprovadoPorFalta = (faltas>20)?true:false;
		
		/*if(faltas>20)
			reprovadoPorFalta=true;
		else
			reprovadoPorFalta=false;*/
		
		System.out.println("O aluno "+nomeDoAluno
				+" tem media "+media+" e grau "+situacao);
		if(reprovadoPorFalta/*==true*/)
			System.out.println("Aluno reprovado por falta");
		else
			System.out.println("Aluno com frequência normal");
			
		
		int x=20;
		//Cuidado com o pós incremento!!!
		int y=++x;

		System.out.println(y);
		System.out.println(x);
		
	}

}
