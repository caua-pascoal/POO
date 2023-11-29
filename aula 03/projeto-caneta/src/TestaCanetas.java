public class TestaCanetas {
    public static void main (String[] args) {
        Caneta umaCaneta = new Caneta();
        umaCaneta.cor = "Azul";
        umaCaneta.tamanho = 3;
        umaCaneta.marca = "Bic";

        Caneta outraCaneta = new Caneta();
        outraCaneta.cor = "Preta";
        outraCaneta.tamanho = 3;
        outraCaneta.marca = "Bic";
        outraCaneta.tampa = true;

        System.out.println("Uma caneta tem cor " + umaCaneta.cor + " e marca " + umaCaneta.marca);
        System.out.println("Outra caneta tem cor " + outraCaneta.cor + " e marca " + outraCaneta.marca);
    }
}
