public class TestaContas3 {
    public static void main (String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "fulano";
        conta1.numero = 123;
        conta1.saldo = 3000;

        Conta conta2 = new Conta();
        conta2.titular = "berltrano";
        conta2.numero = 12345;
        conta2.saldo = 4000;

        Conta conta3 = new Conta();

        System.out.println("conta1: ");
        System.out.println("Numero: " + conta1.numero);
        System.out.println("Titular: " + conta1.titular);
        System.out.println("Saldo: " + conta1.saldo);
        System.out.println("############################");

        System.out.println("conta2: ");
        System.out.println("Numero: " + conta2.numero);
        System.out.println("Titular: " + conta2.titular);
        System.out.println("Saldo: " + conta2.saldo);
        System.out.println("############################");

        System.out.println("conta3: ");
        System.out.println("Numero: " + conta3.numero);
        System.out.println("Titular: " + conta3.titular);
        System.out.println("Saldo: " + conta3.saldo);
        System.out.println("############################");

        
    }
}