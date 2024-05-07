public class Conta {

    /* essa classe Conta tem quatro atributos*/
    /*Quando um atributo é privado ele não pode ser modificado por ninguem a não ser a própria classe*/
   private double saldo;
   int agencia;
   int numero;
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
   public boolean transfere(double valor, Conta destino){
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


}
