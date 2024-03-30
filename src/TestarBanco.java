public class TestarBanco {
/* toda conta tem um titular e todo titular tem nome cpf profição */
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        //associa o cliente paulo a contaDoPaulo
        contaDoPaulo.titular = paulo;/*paulo é a referencia a variavel paulo da linha 4*/
        System.out.println(contaDoPaulo.titular.nome);
    }
}
