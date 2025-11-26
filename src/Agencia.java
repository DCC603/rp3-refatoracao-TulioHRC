public class Agencia {
    private int numAgencia;
    private String gerente;

    public Agencia (int numAgencia, String gerente) {
        this.numAgencia = numAgencia;
        this.gerente = gerente;
    }

    public int getNumAgencia() { return this.numAgencia; }
    public String getGerente() { return this.gerente; }
}
