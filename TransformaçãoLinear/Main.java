package TransformaçãoLinear;

public class Main {
    public static void main(String[] args) {
        Transformacoes transformacoes = new Transformacoes();

        double eixoX = 1, eixoY = 0;

        System.out.println(transformacoes.escala(eixoX,eixoY,2));
        System.out.println(transformacoes.reflexaoEixoX(eixoX,eixoY));
        System.out.println(transformacoes.reflexaoEixoY(eixoX,eixoY));
        System.out.println(transformacoes.reflexaoOrigem(eixoX, eixoY));
        System.out.println(transformacoes.rotacaoGraus(eixoX, eixoY, 90));
    }
}
