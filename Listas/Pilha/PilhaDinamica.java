package Pilha;

public class PilhaDinamica {
    private No inicio;

    public PilhaDinamica() {
        this.inicio = null;
    }

    // Forma a qual Pilhas funcionam: First in - Last out
    public void empilhar(String conteudo){
        No aux = new No(conteudo);
        aux.setProximo(this.inicio);
        this.inicio = aux;
    }

    // Forma a qual Pilhas funcionam: First in - Last out
    public String desempilhar(){
        String itemRemovido;
        if(estaVazia()){
            System.out.println("Lista está vazia!");
            return null;
        }

        // Salvando o conteudo que sera removido;
        itemRemovido = inicio.getConteudo();

        // Determinando o proximo No como o primeiro No
        inicio = inicio.getProximo();
        return itemRemovido;
    }


    public boolean estaVazia(){
        return this.inicio == null;
    }

    public String consultarInicio(){
        if(estaVazia()){
            System.out.println("Pilha vazia!");
            return null;
        }
        return inicio.getConteudo();
    }

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
