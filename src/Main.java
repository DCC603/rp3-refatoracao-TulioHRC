public class Main {


    public static void main(String[] args) {

        Cliente meuCliente = new Cliente("João", "111.111.111-11", "31 1111-1111");
        Agencia minhaAgencia = new Agencia(111, "Gil");

        Conta minhaConta = new Conta(meuCliente, minhaAgencia, 222222, 0.00);

        minhaConta.realizarOperacao('d', 450);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);
        minhaConta.realizarOperacao('s', 50);

        System.out.println(minhaConta);
    }
}
