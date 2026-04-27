package metodosDeOrdenação;

/**
 * Implementação do algoritmo de ordenação Insertion Sort.
 * <p>
 * Este algoritmo constrói a lista ordenada final um item de cada vez. Ele itera sobre
 * a entrada, e para cada elemento, o insere na posição correta na parte já ordenada da lista.
 * É eficiente para listas pequenas ou listas que já estão parcialmente ordenadas.
 * <p>
 * Complexidade:
 * <ul>
 *     <li>Melhor Caso: O(n) - quando o vetor já está ordenado.</li>
 *     <li>Caso Médio: O(n²)</li>
 *     <li>Pior Caso: O(n²) - quando o vetor está em ordem inversa.</li>
 * </ul>
 */
public class InsertionSort implements Ordenador {

    /**
     * Ordena um vetor de inteiros utilizando o algoritmo Insertion Sort.
     * <p>
     * O método percorre o vetor a partir do segundo elemento, e para cada elemento ("chave"),
     * ele o compara com os elementos anteriores e o insere na posição correta.
     * </p>
     *
     * @param vetor O vetor de inteiros a ser ordenado.
     */
    @Override
    public void ordenar(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int chave = vetor[i];
            int j = i - 1;

            // Move os elementos do vetor[0..i-1] que são maiores que a chave
            // para uma posição à frente de sua posição atual
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    /**
     * Retorna o nome do algoritmo.
     *
     * @return A String "Insertion Sort".
     */
    @Override
    public String getNome() {
        return "Insertion Sort";
    }
}
