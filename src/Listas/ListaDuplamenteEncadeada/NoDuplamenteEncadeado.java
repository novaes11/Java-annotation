package src.Listas.ListaDuplamenteEncadeada;

/**
 * Representa um nó em uma lista duplamente encadeada.
 * Contém um valor inteiro, uma referência para o próximo nó e uma referência
 * para o nó anterior.
 */
public class NoDuplamenteEncadeado {
    private Integer conteudo;
    private NoDuplamenteEncadeado prox;
    private NoDuplamenteEncadeado ant;

    /**
     * Construtor que inicializa um nó com um determinado conteúdo.
     * As referências para o próximo e o anterior são inicializadas como nulas.
     *
     * @param conteudo O valor inteiro a ser armazenado no nó.
     */
    public NoDuplamenteEncadeado(Integer conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
        this.ant = null;
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
     * @return A própria instância do nó, para encadeamento de chamadas.
     */
    public NoDuplamenteEncadeado setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
        return this;
    }

    /**
     * Obtém a referência para o próximo nó na lista.
     *
     * @return O próximo nó.
     */
    public NoDuplamenteEncadeado getProx() {
        return prox;
    }

    /**
     * Define a referência para o próximo nó na lista.
     *
     * @param prox O nó a ser definido como o próximo.
     * @return A própria instância do nó, para encadeamento de chamadas.
     */
    public NoDuplamenteEncadeado setProx(NoDuplamenteEncadeado prox) {
        this.prox = prox;
        return this;
    }

    /**
     * Obtém a referência para o nó anterior na lista.
     *
     * @return O nó anterior.
     */
    public NoDuplamenteEncadeado getAnt() {
        return ant;
    }

    /**
     * Define a referência para o nó anterior na lista.
     *
     * @param ant O nó a ser definido como o anterior.
     * @return A própria instância do nó, para encadeamento de chamadas.
     */
    public NoDuplamenteEncadeado setAnt(NoDuplamenteEncadeado ant) {
        this.ant = ant;
        return this;
    }
}
