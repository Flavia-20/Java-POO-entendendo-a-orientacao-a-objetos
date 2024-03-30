public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira conta: "+ primeiraConta.saldo);
        Conta segundaConta = primeiraConta;/*segundaConta e primeiraConta são referencia para a classe conta, nesse caso estão apontando para o mesmo lugar.*/
        System.out.println("Saldo da segunda conta: "+ segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: "+ segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("As contas são a mesma");
        }else{
            System.out.println("As contas são diferentes");
        }
        /*quando faço o new Conta() eu estou criando uma no instancia do objeto ocnta, quando faço:
        primeiraConta.saldo = 300; o valor 300 esta sendo colocado dentro do atributo saldo que esta na classe conta,
        quando faço segundaConta.saldo=50; o valor se saldo esta zerado e o novo valor e colocado lá
         */
    }
}
