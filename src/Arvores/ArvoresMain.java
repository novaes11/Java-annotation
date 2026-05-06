package src.Arvores;

/**
 * Classe principal para demonstrar a funcionalidade da Árvore Binária.
 */
public class ArvoresMain {
    /**
     * Ponto de entrada da aplicação. Cria uma instância de Árvore Binária,
     * insere vários elementos e, em seguida, exibe a árvore em pós-ordem.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(17);
        arvoreBinaria.inserir(5);
        arvoreBinaria.inserir(13);
        arvoreBinaria.inserir(6);
        arvoreBinaria.inserir(7);
        arvoreBinaria.inserir(78);
        arvoreBinaria.inserir(48);
        arvoreBinaria.inserir(42);
        arvoreBinaria.inserir(67);
        arvoreBinaria.inserir(122);
        arvoreBinaria.exibir("Pos");
    }
}
