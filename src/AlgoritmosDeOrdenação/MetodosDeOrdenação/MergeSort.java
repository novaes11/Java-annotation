package src.AlgoritmosDeOrdenação.MetodosDeOrdenação;

/**
 * Implementação do algoritmo de ordenação Merge Sort.
 * <p>
 * Este é um algoritmo de "dividir para conquistar". Ele divide o vetor em duas metades,
 * chama a si mesmo para as duas metades e, em seguida, mescla as duas metades ordenadas.
 * É um algoritmo estável e eficiente, mas requer espaço adicional para os arrays temporários.
 * <p>
 * Complexidade:
 * <ul>
 *     <li>Melhor Caso: O(n log n)</li>
 *     <li>Caso Médio: O(n log n)</li>
 *     <li>Pior Caso: O(n log n)</li>
 * </ul>
 */
public class MergeSort implements Ordenador {

    /**
     * Ponto de entrada público para o algoritmo Merge Sort.
     * Inicia o processo de ordenação recursiva.
     *
     * @param vetor O vetor de inteiros a ser ordenado.
     */
    @Override
    public void ordenar(int[] vetor) {
        if (vetor == null || vetor.length <= 1) {
            return; // O vetor já está ordenado ou é nulo/vazio.
        }
        mergeSort(vetor, 0, vetor.length - 1);
    }

    /**
     * O método recursivo que divide o vetor em sub-vetores e os ordena.
     *
     * @param vetor   O vetor completo que está sendo ordenado.
     * @param esquerda O índice inicial do sub-vetor.
     * @param direita  O índice final do sub-vetor.
     */
    private void mergeSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            // Encontra o ponto médio para evitar overflow com (esquerda + direita) / 2
            int meio = esquerda + (direita - esquerda) / 2;

            // Ordena a primeira e a segunda metade recursivamente
            mergeSort(vetor, esquerda, meio);
            mergeSort(vetor, meio + 1, direita);

            // Mescla as duas metades ordenadas
            merge(vetor, esquerda, meio, direita);
        }
    }

    /**
     * Mescla dois sub-vetores de 'vetor'.
     * O primeiro sub-vetor é vetor[esquerda...meio].
     * O segundo sub-vetor é vetor[meio+1...direita].
     *
     * @param vetor   O vetor original.
     * @param esquerda O índice inicial do primeiro sub-vetor.
     * @param meio     O índice final do primeiro sub-vetor.
     * @param direita  O índice final do segundo sub-vetor.
     */
    private void merge(int[] vetor, int esquerda, int meio, int direita) {
        // Calcula o tamanho dos dois sub-vetores a serem mesclados
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        // Cria arrays temporários para armazenar os sub-vetores
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia os dados para os arrays temporários
        System.arraycopy(vetor, esquerda, L, 0, n1);
        System.arraycopy(vetor, meio + 1, R, 0, n2);

        // Índices iniciais para os sub-vetores L e R
        int i = 0, j = 0;
        // Índice inicial para o sub-vetor mesclado no array original
        int k = esquerda;

        // Mescla os arrays temporários de volta no vetor original
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                vetor[k] = L[i];
                i++;
            } else {
                vetor[k] = R[j];
                j++;
            }
            k++;
        }

        // Copia quaisquer elementos restantes de L[], se houver
        while (i < n1) {
            vetor[k] = L[i];
            i++;
            k++;
        }

        // Copia quaisquer elementos restantes de R[], se houver
        while (j < n2) {
            vetor[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Retorna o nome do algoritmo.
     *
     * @return A String "Merge Sort".
     */
    @Override
    public String getNome() {
        return "Merge Sort";
    }
}
