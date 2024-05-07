public class TestaGetESet {
    /*pegando o que esta na classe ContaEncapsulada*/

    public static void main(String[] args) {
        ContaEncapsulada conta = new ContaEncapsulada();
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

    }

}
