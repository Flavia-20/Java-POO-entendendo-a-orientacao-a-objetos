public class TesteSacaNegativo {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200));//nao foi sacado porque o saldo é menor que o valor do saque e na classe Conta isso retorna false

        /* Despois que eu deixei o atributo saldo privado essas linhas pararam de compilar porque elas não conseguem mais acessar ele

        System.out.println(conta.saldo);

        conta.saldo = conta.saldo - 101;
        System.out.println(conta.saldo);//fica com valor negativo
        */

        conta.saca(101);
        System.out.println(conta.getSaldo());



    }
}
