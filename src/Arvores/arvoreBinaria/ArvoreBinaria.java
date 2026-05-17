package src.Arvores.arvoreBinaria;

import src.Arvores.no.No;

import java.util.Objects;

/**
 * Implementação de uma Árvore Binária de Busca.
 * Permite a inserção de elementos e a exibição em diferentes ordens de percurso.
 */
public class ArvoreBinaria {
    /**
     * A raiz da árvore binária.
     */
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
                no.setPai(atual);
                return;
            } else {
                inserirRecursivo(no, atual.getDireita());
            }
        } else {
            if(atual.getEsquerda() == null) {
                atual.setEsquerda(no);
                no.setPai(atual);
                return;
            } else {
                inserirRecursivo(no, atual.getEsquerda());
            }
        }
    }

    /**
     * Insere um nó na árvore de forma iterativa ja registrando o no Pai do elemento inserido.
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
                        no.setPai(aux);
                        return;
                    } else {
                        aux = aux.getDireita();
                    }
                } else {
                    if(aux.getEsquerda() == null) {
                        aux.setEsquerda(no);
                        no.setPai(aux);
                        return;
                    } else {
                        aux = aux.getEsquerda();
                    }
                }
            }
        }
    }

    /**
     * Remove um nó da árvore com o conteúdo especificado.
     *
     * @param conteudo O conteúdo do nó a ser removido.
     */
    public void removerNo(Integer conteudo){
        No aux = this.raiz;
        // Antes de remover, verifica se a arvore esta vazia
        if (estaVazia()){
            System.out.println("Arvore esta vazia!");
            return;
        }

        System.out.println("Removendo o nó " + conteudo + " ...");
        removerNoRecursivamente(this.raiz, conteudo);
    }

    /**
     * Método auxiliar recursivo para remover um nó.
     *
     * @param no O nó atual na busca recursiva.
     * @param busca O valor a ser removido.
     */
    private void removerNoRecursivamente(No no, Integer busca) {
        // Condicao de parada
        if (no == null) {
            return;
        }

        // Busca recursiva -- Vai descer a arvore até encontrar o no com o conteudo de busca
        if (busca < no.getConteudo()) {
            removerNoRecursivamente(no.getEsquerda(), busca);
            return;
        } else if (busca > no.getConteudo()) {
            removerNoRecursivamente(no.getDireita(), busca);
            return;
        }


        // Remoção de nó com 2 filhos
        if (no.getEsquerda() != null && no.getDireita() != null) {
            // Encontra o sucessor (menor dos maiores)
            No sucessor = no.getDireita();
            while (sucessor.getEsquerda() != null) {
                sucessor = sucessor.getEsquerda();
            }

            // Apos encontrar o Nó sucessor, sera substituido o no que sera removido pelo no sucessor
            no.setConteudo(sucessor.getConteudo());

            // Agora sera removido o no sucessor para que não tenha duplicidade/copia dentro da arvore
            removerNoRecursivamente(no.getDireita(), sucessor.getConteudo());
            return;
        }

        // Remoção de no folha ou de um no com apenas um filho.
        // OBS: essa parte sera util para a remoção do no sucessor caso o no removido possua 2 filhos
        No substituto = null;
        if (no.getEsquerda() != null) {
            substituto = no.getEsquerda();
        } else if (no.getDireita() != null) {
            substituto = no.getDireita();
        }

        /* Caso o substituto seja != null, o no removido havia 1 filho. Aqui sera determinado que o pai do filho do nó removido, sera o pai do nó removido.
         *              ANTES:                      DEPOIS:
         *              PAI                         PAI
         *  NO REMOVIDO                     FILHO
         *      |
         *    FILHO
         */
        if (substituto != null) {
            substituto.setPai(no.getPai());
        }

        // Caso o pai seja nulo, a unica ocasião é de ser a raiz, pois raiz não possui pai.
        if (no.getPai() == null) {
            this.raiz = substituto;
        }
        // Caso o nó atual era o filho da ESQUERDA, set o substituto na esquerda.
        else if (no == no.getPai().getEsquerda()) {
            no.getPai().setEsquerda(substituto);
        }
        // Caso o nó atual era o filho da DIREITA, determinara o substituto na direita
        else {
            no.getPai().setDireita(substituto);
        }

        // Limpar as referências do nó removido para evitar erros na recursão
        no.setEsquerda(null);
        no.setDireita(null);
        no.setPai(null);
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
     * Exibe a estrutura da árvore no console.
     */
    public void exibirArvore() {
        System.out.println("--- Estrutura da Árvore ---");
        exibir(this.raiz, 0);
        System.out.println("---------------------------");
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
     * Método auxiliar recursivo para exibir a estrutura da árvore.
     *
     * @param no O nó atual.
     * @param nivel O nível do nó na árvore (usado para indentação).
     */
    private void exibir(No no, int nivel) {
        // Condição de parada
        if (no == null) {
            return;
        }

        // Caminhará até os maiores valores, visto que vão para o topo do console
        exibir(no.getDireita(), nivel + 1);

        // Impressão e espaçamento do nó atual
        for (int i = 0; i < nivel; i++) {
            System.out.print("    "); // 4 espaços de indentação por nível
        }
        System.out.println(no.getConteudo());

        // Caminhara até os menores valores, visto que vão para o fundo do console
        exibir(no.getEsquerda(), nivel + 1);
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
        System.out.print(no.getConteudo() + " ");
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
