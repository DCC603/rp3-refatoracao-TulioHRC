public class Operacao {

    private TipoOperacao tipo;
    private double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = new TipoOperacao(tipo);
        this.valor = valor;
    }

    public String toString() {
        return this.tipo + ":\t" + this.valor;
    }
}
