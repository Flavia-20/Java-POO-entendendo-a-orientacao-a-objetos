public class ContaEncapsulada {

    /*Quando um atributo é privado ele não pode ser modificado por ninguem a não ser a própria classe
    Aqui todos os atributos foram deixados privados*/
   private double saldo;
    private int agencia;
    private int numero;
   private Cliente titular;
   private static int total;
   /* esse staic é para que mostre que o atributo é da classe em si todo objeto conta tem acesso a apenas um total*/

   // esse é um construtor padrão
   public ContaEncapsulada(int agencia, int numero){
       total++;
       System.out.println("O total de contas é "+ total);
       this.agencia = agencia;
       this.numero = numero;
       System.out.println("Estou criando uma conta " + this.numero);
   }

   public void deposita(double valor){
/* void é o que o metodo retorna(no caso, nada) o vlaor é o que ele recebe*/
        this.saldo = this.saldo + valor;
   }

   public boolean saca(double valor){
        /*boolean retorna true ou false*/
       if(this.saldo >= valor){
           this.saldo -= valor;
           return true;
       }else{
           return false;

       }
   }
   public boolean transfere(double valor, ContaEncapsulada destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita((valor));
            return true;
        }else{
            return false;
        }
   }
   public double getSaldo(){
       return this.saldo;
   }
   public int getNumero(){
       return this.numero;
   }
   public void setNumero(int novoNumero){
       if(numero <= 0){
           System.out.println("nao é permintido valor menor que 0");
           return;
       }
       this.numero = novoNumero;
   }
    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("nao é permintido valor menor que 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular(){
       return titular;
    }
    public  static int getTotal(){
       return ContaEncapsulada.total;
    }
}
