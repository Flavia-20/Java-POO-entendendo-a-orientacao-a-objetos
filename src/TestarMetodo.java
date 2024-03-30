public class TestarMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();

        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        //contaDoPaulo.saca(20);
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        contaDaMarcela.transfere(300, contaDoPaulo);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
    }
}
