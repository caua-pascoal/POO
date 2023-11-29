public class TestaMetodos {
    public static void main (String[] agrs) {
        Conta conta1 = new Conta();
        conta1.titular = "fulano";
        conta1.numero = 123;
        conta1.saldo = 3000;

        Conta conta2 = new Conta();
        conta2.titular = "berltrano";
        conta2.numero = 12345;
        conta2.saldo = 4000;

        conta2.saca(300);
        conta2.deposita(-8000);
        conta1.transferePara(conta2, 2000);

        System.out.println("conta1: ");
        conta1.mostraDados();
        System.out.println("############################");

        System.out.println("conta2: ");
        conta2.mostraDados();
        System.out.println("############################");
    }
}
