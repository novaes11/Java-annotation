package AlgoritmosDeOrdenação.MetodosDeOrdenação;

/**
 * Implementação do algoritmo de ordenação Selection Sort.
 * <p>
 * Este algoritmo divide a lista em duas partes: uma sub-lista ordenada que é construída
 * da esquerda para a direita e uma sub-lista com os itens restantes não ordenados.
 * Repetidamente, ele encontra o menor elemento da sub-lista não ordenada e o troca
 * com o primeiro elemento não ordenado.
 * <p>
 * Complexidade:
 * <ul>
 *     <li>Melhor Caso: O(n²)</li>
 *     <li>Caso Médio: O(n²)</li>
 *     <li>Pior Caso: O(n²)</li>
 * </ul>
 * A complexidade é a mesma em todos os casos porque o algoritmo sempre
 * procura o menor elemento em cada passagem, independentemente da ordem inicial.
 */
public class SelectionSort implements Ordenador {

    /**
     * Ordena um vetor de inteiros utilizando o algoritmo Selection Sort.
     * <p>
     * O método itera sobre o vetor, encontrando o menor elemento restante
     * e o colocando na posição correta a cada passagem.
     * </p>
     *
     * @param vetor O vetor de inteiros a ser ordenado.
     */
    @Override
    public void ordenar(int[] vetor) {
        int n = vetor.length;

        // Itera sobre o vetor, aumentando a porção ordenada a cada passo.
        for (int i = 0; i < n - 1; i++) {
            // Encontra o índice do menor elemento na porção não ordenada.
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Troca o menor elemento encontrado com o primeiro elemento da porção não ordenada.
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }
    }

    /**
     * Retorna o nome do algoritmo.
     *
     * @return A String "Selection Sort".
     */
    @Override
    public String getNome() {
        return "Selection Sort";
    }
}
