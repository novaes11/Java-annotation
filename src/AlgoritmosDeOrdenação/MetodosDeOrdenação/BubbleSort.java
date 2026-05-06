package src.AlgoritmosDeOrdenação.MetodosDeOrdenação;

/**
 * Implementação do algoritmo de ordenação Bubble Sort.
 * <p>
 * Este algoritmo percorre repetidamente a lista, compara elementos adjacentes e os troca
 * se estiverem na ordem errada. A passagem pela lista é repetida até que a lista esteja ordenada.
 * <p>
 * Complexidade:
 * <ul>
 *     <li>Melhor Caso: O(n) - quando o vetor já está ordenado.</li>
 *     <li>Caso Médio: O(n²)</li>
 *     <li>Pior Caso: O(n²) - quando o vetor está em ordem inversa.</li>
 * </ul>
 */
public class BubbleSort implements Ordenador {

    /**
     * Ordena um vetor de inteiros utilizando o algoritmo Bubble Sort.
     * <p>
     * O método inclui uma otimização que interrompe a execução se, durante uma
     * passagem completa, nenhuma troca for realizada, indicando que o vetor já está ordenado.
     * </p>
     *
     * @param vetor O vetor de inteiros a ser ordenado.
     */
    @Override
    public void ordenar(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos adjacentes
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                }
            }
            // Se nenhuma troca foi feita nesta passagem, o vetor já está ordenado.
            if (!trocou) {
                break;
            }
        }
    }

    /**
     * Retorna o nome do algoritmo.
     *
     * @return A String "Bubble Sort".
     */
    @Override
    public String getNome() {
        return "Bubble Sort";
    }
}
