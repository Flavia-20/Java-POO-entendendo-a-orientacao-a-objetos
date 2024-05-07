public class ContaEncapsulada {

    /*Quando um atributo é privado ele não pode ser modificado por ninguem a não ser a própria classe
    Aqui todos os atributos foram deixados privados*/
   private double saldo;
    private int agencia;
    private int numero;
   Cliente titular;

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
       this.numero = novoNumero;
   }
    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
