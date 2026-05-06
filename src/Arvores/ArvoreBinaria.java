package src.Arvores;

/**
 * Implementação de uma Árvore Binária de Busca.
 * Permite a inserção de elementos e a exibição em diferentes ordens de percurso.
 */
public class ArvoreBinaria {
    No raiz;

    /**
     * Construtor que inicializa uma árvore vazia.
     * A raiz é inicializada com um nó de conteúdo nulo para marcar o início.
     */
    public ArvoreBinaria() {
        this.raiz = new No(null);
    }

    /**
     * Insere um novo valor na árvore.
     * Utiliza o método de inserção iterativo por padrão.
     *
     * @param conteudo O valor inteiro a ser inserido.
     */
    public void inserir(Integer conteudo) {
        No novoNo = new No(conteudo);
        //inserirRecursivo(novoNo, this.raiz);
        inserirIterativo(novoNo);
    }

    /**
     * Insere um nó na árvore de forma recursiva.
     * (Este método não está sendo usado atualmente pela `inserir` pública).
     *
     * @param no    O novo nó a ser inserido.
     * @param atual O nó atual na recursão, usado para encontrar a posição correta.
     */
    private void inserirRecursivo(No no, No atual) {
        if(estaVazia()) {
            this.raiz = no;
            return;
        }
        if(no.getConteudo() > atual.getConteudo()) {
            if(atual.getDireita() == null) {
                atual.setDireita(no);
                return;
            } else {
                inserirRecursivo(no, atual.getDireita());
            }
        } else {
            if(atual.getEsquerda() == null) {
                atual.setEsquerda(no);
                return;
            } else {
                inserirRecursivo(no, atual.getEsquerda());
            }
        }
    }

    /**
     * Insere um nó na árvore de forma iterativa.
     * Percorre a árvore a partir da raiz para encontrar o local de inserção.
     *
     * @param no O novo nó a ser inserido.
     */
    private void inserirIterativo(No no) {
        if(estaVazia()) {
            this.raiz = no;
            return;
        } else {
            No aux = this.raiz;
            while(aux != null) {
                if(no.getConteudo() > aux.getConteudo()) {
                    if(aux.getDireita() == null) {
                        aux.setDireita(no);
                        return;
                    } else {
                        aux = aux.getDireita();
                    }
                } else {
                    if(aux.getEsquerda() == null) {
                        aux.setEsquerda(no);
                        return;
                    } else {
                        aux = aux.getEsquerda();
                    }
                }
            }
        }
    }

    /**
     * Verifica se a árvore está vazia.
     *
     * @return true se a raiz tiver conteúdo nulo, false caso contrário.
     */
    public boolean estaVazia() {
        if(this.raiz.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Exibe o conteúdo da árvore de acordo com o percurso especificado.
     *
     * @param percurso Uma string que indica a ordem do percurso: "Pre" (Pré-Ordem),
     *                 "Em" (Em-Ordem), ou "Pos" (Pós-Ordem).
     */
    public void exibir(String percurso) {
        switch(percurso){
            case("Pre"):
                preOrdem(this.raiz);
                break;
            case("Em"):
                emOrdem(this.raiz);
                break;
            case("Pos"):
                posOrdem(this.raiz);
                break;
        }
    }

    /**
     * Realiza o percurso em pré-ordem (Raiz, Esquerda, Direita) e imprime os valores.
     *
     * @param no O nó a partir do qual o percurso começa.
     */
    private void preOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.println(no.getConteudo());
        preOrdem(no.getEsquerda());
        preOrdem(no.getDireita());
    }

    /**
     * Realiza o percurso em-ordem (Esquerda, Raiz, Direita) e imprime os valores.
     *
     * @param no O nó a partir do qual o percurso começa.
     */
    private void emOrdem(No no) {
        if(no == null) {
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getConteudo());
        emOrdem(no.getDireita());
    }

    /**
     * Realiza o percurso em pós-ordem (Esquerda, Direita, Raiz) e imprime os valores.
     *
     * @param no O nó a partir do qual o percurso começa.
     */
    private void posOrdem(No no) {
        if(no == null) {
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getConteudo());
    }
}
