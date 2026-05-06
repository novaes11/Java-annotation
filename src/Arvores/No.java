package src.Arvores;

/**
 * Representa um nó em uma árvore binária, contendo um valor inteiro e
 * referências para os nós filhos à esquerda and à direita.
 */
public class No {

    Integer conteudo;
    No esquerda;
    No direita;

    /**
     * Construtor que inicializa um nó com um determinado conteúdo.
     * Os filhos da esquerda e da direita são inicializados como nulos.
     *
     * @param conteudo O valor inteiro a ser armazenado no nó.
     */
    public No(Integer conteudo) {
        this.conteudo = conteudo;
        this.esquerda = null;
        this.direita = null;
    }

    /**
     * Obtém o conteúdo (valor) do nó.
     *
     * @return O valor inteiro do nó.
     */
    public Integer getConteudo() {
        return conteudo;
    }

    /**
     * Define o conteúdo (valor) do nó.
     *
     * @param conteudo O novo valor inteiro para o nó.
     */
    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * Obtém o nó filho da direita.
     *
     * @return A referência para o nó da direita.
     */
    public No getDireita() {
        return direita;
    }

    /**
     * Define o nó filho da direita.
     *
     * @param direita A referência para o novo nó da direita.
     */
    public void setDireita(No direita) {
        this.direita = direita;
    }

    /**
     * Obtém o nó filho da esquerda.
     *
     * @return A referência para o nó da esquerda.
     */
    public No getEsquerda() {
        return esquerda;
    }

    /**
     * Define o nó filho da esquerda.
     *
     * @param esquerda A referência para o novo nó da esquerda.
     */
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
}
