package metodosDeOrdenação;

/**
 * Implementação do algoritmo de ordenação Quick Sort.
 * <p>
 * Esta implementação usa a estratégia de "mediana de três" para a escolha do pivô,
 * a fim de evitar o pior caso (O(n²)) que leva a um {@link StackOverflowError}
 * em vetores ordenados ou inversamente ordenados.
 * </p>
 * Complexidade:
 * <ul>
 *     <li>Melhor Caso: O(n log n)</li>
 *     <li>Caso Médio: O(n log n)</li>
 *     <li>Pior Caso (com pivô ruim): O(n²)</li>
 * </ul>
 */
public class QuickSort implements Ordenador {

    @Override
    public void ordenar(int[] vetor) {
        if (vetor == null || vetor.length == 0) {
            return;
        }
        quickSort(vetor, 0, vetor.length - 1);
    }

    private void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            // A escolha de um bom pivô é crucial. A "mediana de três" evita o pior caso.
            int pivo = escolherPivo(vetor, inicio, fim);
            int indicePivo = particionar(vetor, inicio, fim, pivo);

            quickSort(vetor, inicio, indicePivo - 1);
            quickSort(vetor, indicePivo + 1, fim);
        }
    }

    /**
     * Escolhe o pivô usando a técnica "mediana de três" e o posiciona no final do array.
     * Isso evita o pior caso do QuickSort para arrays já ordenados ou inversamente ordenados.
     *
     * @param vetor O vetor.
     * @param inicio O índice inicial.
     * @param fim O índice final.
     * @return O valor do pivô escolhido.
     */
    private int escolherPivo(int[] vetor, int inicio, int fim) {
        int meio = inicio + (fim - inicio) / 2;

        // Ordena os elementos nos índices inicio, meio e fim.
        if (vetor[inicio] > vetor[meio]) {
            trocar(vetor, inicio, meio);
        }
        if (vetor[inicio] > vetor[fim]) {
            trocar(vetor, inicio, fim);
        }
        if (vetor[meio] > vetor[fim]) {
            trocar(vetor, meio, fim);
        }

        // O elemento do meio (mediana) é um bom pivô.
        // O colocamos na posição 'fim' para que o método de particionar funcione como antes.
        trocar(vetor, meio, fim);
        return vetor[fim];
    }

    /**
     * Reorganiza o vetor de modo que todos os elementos menores que o pivô
     * fiquem à sua esquerda e todos os maiores, à sua direita.
     *
     * @param vetor O vetor a ser particionado.
     * @param inicio O índice inicial.
     * @param fim O índice final.
     * @param pivo O valor do pivô.
     * @return O índice final do pivô.
     */
    private int particionar(int[] vetor, int inicio, int fim, int pivo) {
        int i = (inicio - 1);
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                trocar(vetor, i, j);
            }
        }
        // Move o pivô (que estava em vetor[fim]) para sua posição final.
        trocar(vetor, i + 1, fim);
        return i + 1;
    }

    /**
     * Método auxiliar para trocar dois elementos de posição em um vetor.
     *
     * @param vetor O vetor.
     * @param i O índice do primeiro elemento.
     * @param j O índice do segundo elemento.
     */
    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    @Override
    public String getNome() {
        return "Quick Sort";
    }
}
