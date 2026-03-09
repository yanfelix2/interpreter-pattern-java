

public class Main {
    public static void main(String[] args) {

        Expressao expressao = new Somar(new Numero(5), new Numero(2));
        System.out.println("O resultado da expressão é: " + expressao.interpretar());


        System.out.println("============================================");

        Expressao expressao1 = new Multiplicar(new Numero(5),new Numero(2));
        System.out.println("O resultado da expressão é: " + expressao1.interpretar());

    }


}