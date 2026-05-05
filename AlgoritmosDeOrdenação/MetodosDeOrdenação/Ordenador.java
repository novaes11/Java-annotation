package AlgoritmosDeOrdenação.MetodosDeOrdenação;

/**
 * Define o contrato para todos os algoritmos de ordenação implementados no projeto.
 * <p>
 * Esta interface garante que cada algoritmo de ordenação forneça um método para
 * ordenar um vetor de inteiros e um método para obter o nome do algoritmo.
 * Isso facilita a troca e o teste de diferentes algoritmos de forma padronizada.
 * </p>
 */
public interface Ordenador {

    /**
     * Ordena um vetor de inteiros em ordem crescente.
     * A implementação deste método varia para cada algoritmo de ordenação.
     *
     * @param vetor O vetor de inteiros a ser ordenado. O método modifica o vetor original.
     */
    void ordenar(int[] vetor);

    /**
     * Retorna o nome do algoritmo de ordenação.
     * <p>
     * Exemplo: "Bubble Sort", "Quick Sort".
     * </p>
     *
     * @return Uma String contendo o nome legível do algoritmo.
     */
    String getNome();
}
