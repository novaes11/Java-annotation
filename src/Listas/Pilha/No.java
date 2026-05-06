package src.Listas.Pilha;

/**
 * Representa um nó em uma estrutura de dados encadeada, como uma pilha ou lista.
 * Contém um valor (conteúdo) e uma referência para o próximo nó na sequência.
 */
public class No{
    private String conteudo;
    private No proximo;

    /**
     * Construtor que inicializa um nó com um determinado conteúdo.
     * A referência para o próximo nó é inicializada como nula.
     *
     * @param conteudo O valor (String) a ser armazenado no nó.
     */
    public No(String conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }

    /**
     * Obtém a referência para o próximo nó na sequência.
     *
     * @return O próximo nó.
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * Define a referência para o próximo nó na sequência.
     *
     * @param proximo O nó a ser definido como o próximo.
     * @return A própria instância do nó, para encadeamento de chamadas (fluent interface).
     */
    public No setProximo(No proximo) {
        this.proximo = proximo;
        return this;
    }

    /**
     * Obtém o conteúdo (valor) armazenado no nó.
     *
     * @return O conteúdo do nó.
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Define o conteúdo (valor) do nó.
     *
     * @param conteudo O novo conteúdo para o nó.
     * @return A própria instância do nó, para encadeamento de chamadas (fluent interface).
     */
    public No setConteudo(String conteudo) {
        this.conteudo = conteudo;
        return this;
    }
}
