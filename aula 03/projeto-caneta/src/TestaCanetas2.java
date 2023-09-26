public class TestaCanetas2 {
    public static void main (String[] args) {
        Caneta umaCaneta = new Caneta();
        umaCaneta.cor = "Azul";
        umaCaneta.tamanho = 3;
        umaCaneta.marca = "Bic";

        Caneta outraCaneta = new Caneta();
        outraCaneta.cor = "Azul";
        outraCaneta.tamanho = 3;
        outraCaneta.marca = "Bic";

        System.out.println("Uma caneta tem cor " + umaCaneta.cor + " e marca " + umaCaneta.marca);
        System.out.println("Outra caneta tem cor " + outraCaneta.cor + " e marca " + outraCaneta.marca);

        if(umaCaneta == outraCaneta)
            System.out.println("Iguais");
        else
            System.out.println("Diferentes");
        System.out.println(umaCaneta);
        System.out.println(outraCaneta);
    }
}
