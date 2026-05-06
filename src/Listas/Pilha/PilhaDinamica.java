package src.Listas.Pilha;

/**
 * Implementação de uma pilha (LIFO - Last-In, First-Out) com tamanho dinâmico,
 * utilizando uma estrutura de nós encadeados.
 */
public class PilhaDinamica {
    private No inicio; // O topo da pilha

    /**
     * Construtor que cria uma pilha vazia.
     */
    public PilhaDinamica() {
        this.inicio = null;
    }

    /**
     * Adiciona um elemento ao topo da pilha.
     *
     * @param conteudo O elemento (String) a ser empilhado.
     */
    public void empilhar(String conteudo){
        No novoNo = new No(conteudo);
        novoNo.setProximo(this.inicio); // O novo nó aponta para o antigo topo
        this.inicio = novoNo;           // O novo nó se torna o topo
    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return O elemento removido, ou null se a pilha estiver vazia.
     */
    public String desempilhar(){
        String itemRemovido;
        if(estaVazia()){
            System.out.println("Pilha está vazia!");
            return null;
        }

        // Salva o conteúdo que será removido
        itemRemovido = inicio.getConteudo();

        // O segundo nó da lista se torna o novo topo
        inicio = inicio.getProximo();
        return itemRemovido;
    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha não contiver elementos, false caso contrário.
     */
    public boolean estaVazia(){
        return this.inicio == null;
    }

    /**
     * Retorna o elemento no topo da pilha sem removê-lo.
     *
     * @return O conteúdo do elemento do topo, ou null se a pilha estiver vazia.
     */
    public String consultarInicio(){
        if(estaVazia()){
            System.out.println("Pilha vazia!");
            return null;
        }
        return inicio.getConteudo();
    }

    /**
     * Exibe todos os elementos da pilha, do topo para a base.
     */
    public void exibir(){
        if(estaVazia()){
            System.out.println("Pilha está vazia!");
            return;
        }
        No atual = inicio;
        System.out.println("--- Topo da Pilha ---");
        while(atual != null){
            System.out.println(atual.getConteudo());
            atual = atual.getProximo();
        }
        System.out.println("--- Base da Pilha ---");
    }
}
