package modelo;

public class SistemaInterno {
	private int senhaSistema;
	public SistemaInterno(int senhaSistema) {
		this.senhaSistema = senhaSistema;
	}
	public void login(Autenticavel g) {
		if(g.autentica(this.senhaSistema)==true)
			System.out.println("Autenticado!");
		else
			System.out.println("Não autenticado.");
	}
}
