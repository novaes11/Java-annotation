package Pilha;

public class PilhaSimples {
    String[] lista;
    private int topo;

    public PilhaSimples(int tamanho) {
        if (tamanho <= 0) throw new IllegalArgumentException();
        lista = new String[tamanho];
        this.topo = -1;
    }

    public void empilhar(String x) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia!");
            return;
        }

        this.topo++;
        this.lista[this.topo] = x;
    }

    public String desempilhar() {
        if (this.topo == -1) {
            System.out.println("A pilha está vazia!");
            return null;
        }

        String itemRemovido = this.lista[this.topo];
        this.lista[this.topo] = null;
        this.topo--;

        return itemRemovido;
    }

    public boolean estaCheia() {
        return this.topo == this.lista.length - 1;
    }

    public void exibir() {
        if (this.topo == -1) {
            System.out.println("A pilha está vazia!");
            return;
        }

        System.out.println("--- Topo da Pilha ---");
        for (int i = this.topo; i >= 0; i--) {
            System.out.println(this.lista[i]);
        }
        System.out.println("--- Base da Pilha ---");
    }
}
