import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;

class main{
    static void main() {
        ListaDuplamenteEncadeada lista1 = new ListaDuplamenteEncadeada();

        lista1.exibirDiretamente();
        lista1.adicionar(1);
        lista1.exibirDiretamente();
        lista1.adicionar(2);
        lista1.adicionar(3);
        lista1.exibirDiretamente();
        System.out.println("-------");
        lista1.exibirInversamente();
        lista1.remover(1);
        System.out.println("-------");
        lista1.exibirDiretamente();
    }
}