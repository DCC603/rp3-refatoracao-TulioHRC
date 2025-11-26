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

    public void realizarOperacao(char tipo, int valor) {
        Operacao op = new Operacao(tipo, valor);
        this.operacoes.add(op);

        alterarSaldo(tipo, valor);
    }

    public void alterarSaldo(char tipo, int valor) {
        if (tipo == 'd')
            this.saldo += valor;
        else if (tipo == 's')
            this.saldo -= valor;
    }

    private String getDadosCliente () {
        return this.cliente + "";
    }

    private String getDadosConta () {
        return String.format("Ag.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f",
                this.agencia.getNumAgencia(), this.numConta, this.agencia.getGerente(), this.saldo);
    }

    private String getDadosExtrato () {
        String dadosExtrato = "";
        for(Operacao op : this.operacoes) {
            dadosExtrato += op.toString() + "\n";
        }

        return dadosExtrato;
    }

    public String toString() {
        return "-----CLIENTE-----\n" +
                this.getDadosCliente() +
                "\n\n" +
                "-----CONTA-----\n" +
                this.getDadosConta() +
                "\n\n" +
                "-----EXTRATO-----\n" +
                this.getDadosExtrato() +
                "\n";
    }
}
