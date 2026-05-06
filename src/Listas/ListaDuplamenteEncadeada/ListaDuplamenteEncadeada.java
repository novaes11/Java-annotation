package src.Listas.ListaDuplamenteEncadeada;

import java.util.Objects;

/**
 * Implementação de uma lista duplamente encadeada de números inteiros.
 * Permite adicionar, remover e exibir elementos em ambas as direções.
 */
public class ListaDuplamenteEncadeada {
    private NoDuplamenteEncadeado inicio;
    private NoDuplamenteEncadeado fim;

    /**
     * Construtor que cria uma lista vazia.
     */
    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    /**
     * Adiciona um novo elemento ao final da lista.
     *
     * @param conteudo O valor inteiro a ser adicionado.
     */
    public void adicionar(Integer conteudo){
        NoDuplamenteEncadeado aux = this.inicio;
        NoDuplamenteEncadeado newNo = new NoDuplamenteEncadeado(conteudo);
        if(!existeInicio()){
            this.fim = this.inicio = newNo;
            System.out.println("Item " +conteudo+ " adicionado com sucesso!");
            return;
        }else if(existeInicio() && this.inicio.getProx() == null){
            this.inicio.setProx(newNo);
            newNo.setAnt(inicio);
            this.fim = newNo; // Atualiza o fim
            System.out.println("Item " +conteudo+ " adicionado com sucesso!");
            return;
        }

        while (aux.getProx() != null){
            aux = aux.getProx();
        }
        aux.setProx(newNo);
        newNo.setAnt(aux);
        this.fim = newNo;
        System.out.println("Item " +conteudo+ " adicionado com sucesso!");
    }

    /**
     * Remove a primeira ocorrência de um elemento da lista.
     *
     * @param conteudo O valor inteiro a ser removido.
     */
    public void remover(Integer conteudo){
        NoDuplamenteEncadeado aux = inicio;
        if (!existeInicio()) {
            System.out.println("Lista está vazia!");
            return;
        }

        // Caso 1: Remover o último elemento
        if (Objects.equals(this.fim.getConteudo(), conteudo)) {
            if (this.inicio == this.fim) { // Apenas um elemento na lista
                this.inicio = this.fim = null;
            } else {
                fim.getAnt().setProx(null);
                this.fim = fim.getAnt();
            }
            System.out.println("Item " + conteudo + " removido com sucesso!");
            return;
        }

        // Caso 2: Remover o primeiro elemento
        if (Objects.equals(this.inicio.getConteudo(), conteudo)) {
            inicio.getProx().setAnt(null);
            this.inicio = inicio.getProx();
            System.out.println("Item " + conteudo + " removido com sucesso!");
            return;
        }

        // Caso 3: Remover um elemento no meio
        while (aux != null) {
            if (aux.getConteudo().equals(conteudo)) {
                aux.getAnt().setProx(aux.getProx());
                aux.getProx().setAnt(aux.getAnt());
                System.out.println("Item " + conteudo + " removido com sucesso!");
                return; // Sai do método após remover
            }
            aux = aux.getProx();
        }
        System.out.println("Item " + conteudo + " não encontrado na lista.");
    }

    /**
     * Verifica se a lista tem um nó inicial.
     *
     * @return true se a lista não estiver vazia, false caso contrário.
     */
    public boolean existeInicio(){
        return this.inicio != null;
    }

    /**
     * Verifica se a lista tem um nó final.
     *
     * @return true se a lista não estiver vazia, false caso contrário.
     */
    public boolean existeFim(){
        return this.fim != null;
    }

    /**
     * Exibe todos os elementos da lista, do início para o fim.
     */
    public void exibirDiretamente(){
        NoDuplamenteEncadeado aux = this.inicio;
        if (!existeInicio()){
            System.out.println("Lista está vazia");
            return;
        }
        System.out.println("--Inicio--");
        while (aux != null){
            System.out.println(aux.getConteudo());
            aux = aux.getProx();
        }
        System.out.println("--Fim--");
    }

    /**
     * Exibe todos os elementos da lista, do fim para o início.
     */
    public void exibirInversamente(){
        NoDuplamenteEncadeado aux = this.fim;
        if (!existeFim()){
            System.out.println("Lista está vazia");
            return;
        }
        System.out.println("--Fim--");
        while (aux != null){
            System.out.println(aux.getConteudo());
            aux = aux.getAnt();
        }
        System.out.println("--Inicio--");
    }
}
