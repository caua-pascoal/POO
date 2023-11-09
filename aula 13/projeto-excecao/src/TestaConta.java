public class TestaConta {
    public static void main(String[] args) {
        Conta cc = new Conta();
        cc.deposita(100);

        try {
            cc.saca(300);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
