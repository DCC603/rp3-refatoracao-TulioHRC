import java.util.ArrayList;
import java.util.List;

public class Conta {

    private int numConta;
    
    private Cliente cliente;
    private Agencia agencia;

    private double saldo;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia, int numConta, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0, 0);
    }

    // TODO(#3) REFATORAR: Muita responsabilidade para o mesmo método
    public void realizarOperacao(char tipo, int saldo) {
        Operacao op = new Operacao(tipo, saldo);
        this.operacoes.add(op);

        if (tipo == 'd')
            this.saldo += saldo;
        else if(tipo == 's')
            this.saldo -= saldo;
    }

    public String toString() {
        String dadosConta = String.format("Ag.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f",
                this.agencia.getNumAgencia(), this.numConta, this.agencia.getGerente(), this.saldo);

        // TODO(#5) REFATORAR: Essa operação não deveria estar sendo realizada neste método
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return "-----CLIENTE-----\n" +
                this.cliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +
                "\n\n" +
                "-----EXTRATO-----\n" +
                dadosExtrato +
                "\n";
    }
}
