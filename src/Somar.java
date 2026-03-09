public class Somar implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Somar(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar(){
        return esquerda.interpretar() + direita.interpretar();
    }
}
