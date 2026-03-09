public class Multiplicar implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Multiplicar(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return esquerda.interpretar() * direita.interpretar();
    }
}
