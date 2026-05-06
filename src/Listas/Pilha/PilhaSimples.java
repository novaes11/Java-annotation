package src.Listas.Pilha;

/**
 * Implementação de uma pilha (LIFO - Last-In, First-Out) com tamanho fixo,
 * utilizando um array.
 */
public class PilhaSimples {
    String[] lista;
    private int topo;

    /**
     * Construtor que cria uma pilha com um tamanho máximo especificado.
     *
     * @param tamanho O número máximo de elementos que a pilha pode conter.
     * @throws IllegalArgumentException Se o tamanho for menor ou igual a zero.
     */
    public PilhaSimples(int tamanho) {
        if (tamanho <= 0) throw new IllegalArgumentException();
        lista = new String[tamanho];
        this.topo = -1; // A pilha começa vazia
    }

    /**
     * Adiciona um elemento ao topo da pilha.
     *
     * @param x O elemento (String) a ser empilhado.
     */
    public void empilhar(String x) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia!");
            return;
        }

        this.topo++;
        this.lista[this.topo] = x;
    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return O elemento removido, ou null se a pilha estiver vazia.
     */
    public String desempilhar() {
        if (this.topo == -1) {
            System.out.println("A pilha está vazia!");
            return null;
        }

        String itemRemovido = this.lista[this.topo];
        this.lista[this.topo] = null; // Limpa a referência
        this.topo--;

        return itemRemovido;
    }

    /**
     * Verifica se a pilha atingiu sua capacidade máxima.
     *
     * @return true se a pilha estiver cheia, false caso contrário.
     */
    public boolean estaCheia() {
        return this.topo == this.lista.length - 1;
    }

    /**
     * Exibe todos os elementos da pilha, do topo para a base.
     */
    public void exibir() {
        if (this.topo == -1) {
            System.out.println("A pilha está vazia!");
            return;
        }

        System.out.println("--- Topo da Pilha ---");
        for (int i = this.topo; i >= 0; i--) {
            System.out.println(this.lista[i]);
        }
        System.out.println("--- Base da Pilha ---");
    }
}
