package Pilha;

public class No{
    private String conteudo;
    private No proximo;

    public No(String conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public No getProximo() {
        return proximo;
    }

    public No setProximo(No proximo) {
        this.proximo = proximo;
        return this;
    }

    public String getConteudo() {
        return conteudo;
    }

    public No setConteudo(String conteudo) {
        this.conteudo = conteudo;
        return this;
    }
}
