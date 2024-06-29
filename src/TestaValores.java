public class TestaValores {

    public static void main(String[] args) {
        /*Como criei um construtor padrão esse new ContaEncapsulada(); agora precisa dos atributos que eu defini no construtor*/
       // ContaEncapsulada conta = new ContaEncapsulada();
        ContaEncapsulada conta = new ContaEncapsulada(1234, 154964);

        //conta esta incosistente por que ela ja nasce com valor 0
        conta.setAgencia(-50);
        conta.setNumero(-150);

        System.out.println(ContaEncapsulada.getTotal());


    }
}
