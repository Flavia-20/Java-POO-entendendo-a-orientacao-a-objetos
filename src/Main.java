public class Main {
    public static void main(String[] args) {
    /*objeto ou instancia do tipo conta*/
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;/*coloca 200 nno atributo que se chama saldo*/
        System.out.println(primeiraConta.saldo);
        primeiraConta.saldo +=100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo=50;

        System.out.println("primeira conta tem: "+ primeiraConta.saldo);
        System.out.println("Segunda conta tem: " + segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("As conmtas são a mesma");
        }else{
            System.out.println("As contas são diferentes");
        }
    }
}