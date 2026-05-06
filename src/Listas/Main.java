package src.Listas;

import src.Listas.ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;

/**
 * Classe principal para demonstrar o uso da ListaDuplamenteEncadeada.
 */
class main{
    /**
     * Método principal que cria uma instância de ListaDuplamenteEncadeada,
     * adiciona e remove elementos, e exibe o conteúdo da lista.
     */
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
