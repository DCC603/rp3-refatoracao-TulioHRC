public class TipoOperacao {
    private char tipo;
    
    public TipoOperacao (char tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        switch (this.tipo) {
            case 'd':
                return "Depósito";
            case 's':
                return "Saque";
            default:
                return null;
        }
    }
}
