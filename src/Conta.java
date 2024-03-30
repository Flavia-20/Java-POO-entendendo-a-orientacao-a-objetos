public class Conta {

    /* essa classe Conta tem quatro atributos*/
   double saldo;
   int agencia;
   int numero;
   String titular;

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

}
