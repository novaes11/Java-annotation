package SistemaPagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento pix = new Pix(100);
        Pagamento cartao = new Cartao(100);

        pix.pagar(50);
        cartao.pagar(50);
    }
}
