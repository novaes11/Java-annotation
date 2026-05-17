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
        arvoreBinaria.inserir(25);
        arvoreBinaria.inserir(20);
        arvoreBinaria.inserir(21);
        arvoreBinaria.inserir(3);
        arvoreBinaria.inserir(28);
        arvoreBinaria.inserir(8);
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(30);
        arvoreBinaria.inserir(15);
        arvoreBinaria.inserir(22);
        arvoreBinaria.inserir(19);
        arvoreBinaria.inserir(9);
        arvoreBinaria.inserir(35);
        arvoreBinaria.inserir(1);
        arvoreBinaria.inserir(4);
        arvoreBinaria.inserir(6);
        arvoreBinaria.inserir(2);
        arvoreBinaria.inserir(13);
        arvoreBinaria.inserir(24);
        arvoreBinaria.inserir(27);
        arvoreBinaria.inserir(40);
        arvoreBinaria.exibirArvore();
        arvoreBinaria.removerNo(1);
        arvoreBinaria.exibirArvore();
        arvoreBinaria.removerNo(5);
        arvoreBinaria.exibirArvore();
        arvoreBinaria.removerNo(17);
        arvoreBinaria.exibirArvore();
    }
}
