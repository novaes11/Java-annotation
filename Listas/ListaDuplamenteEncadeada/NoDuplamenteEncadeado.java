package Listas.ListaDuplamenteEncadeada;

public class NoDuplamenteEncadeado {
    private Integer conteudo;
    private NoDuplamenteEncadeado prox;
    private NoDuplamenteEncadeado ant;

    public NoDuplamenteEncadeado(Integer conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
        this.ant = null;
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public NoDuplamenteEncadeado setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
        return this;
    }

    public NoDuplamenteEncadeado getProx() {
        return prox;
    }

    public NoDuplamenteEncadeado setProx(NoDuplamenteEncadeado prox) {
        this.prox = prox;
        return this;
    }

    public NoDuplamenteEncadeado getAnt() {
        return ant;
    }

    public NoDuplamenteEncadeado setAnt(NoDuplamenteEncadeado ant) {
        this.ant = ant;
        return this;
    }
}
