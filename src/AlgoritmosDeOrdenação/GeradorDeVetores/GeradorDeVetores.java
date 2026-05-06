package src.AlgoritmosDeOrdenação.GeradorDeVetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe utilitária para gerar diferentes tipos de vetores de inteiros para teste.
 * <p>
 * Fornece métodos estáticos para criar vetores com dados em diferentes configurações:
 * aleatória, ordenada e inversamente ordenada. Isso é essencial para analisar o
 * comportamento dos algoritmos de ordenação em diferentes cenários (melhor caso,
 * caso médio e pior caso).
 * </p>
 */
public class GeradorDeVetores {

    /**
     * Gera um vetor de números inteiros com valores únicos e em ordem aleatória.
     * <p>
     * Para garantir que os valores sejam únicos e cobrem um intervalo contínuo,
     * o método primeiro cria uma lista de números sequenciais (0, 1, 2, ...) e
     * depois a embaralha.
     * </p>
     *
     * @param tamanho O tamanho do vetor a ser gerado.
     * @return Um array de inteiros com valores embaralhados.
     */
    public static int[] gerarVetorAleatorio(int tamanho) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            lista.add(i);
        }
        Collections.shuffle(lista);
        // Converte a lista de Integer para um array primitivo de int
        return lista.stream().mapToInt(i -> i).toArray();
    }

    /**
     * Gera um vetor de números inteiros em ordem crescente.
     * <p>
     * Este vetor representa o "melhor caso" para algoritmos como o Bubble Sort (otimizado)
     * e o Insertion Sort, e um caso comum para outros.
     * </p>
     *
     * @param tamanho O tamanho do vetor a ser gerado.
     * @return Um array de inteiros ordenado de forma crescente (0, 1, 2, ...).
     */
    public static int[] gerarVetorOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }
        return vetor;
    }

    /**
     * Gera um vetor de números inteiros em ordem decrescente.
     * <p>
     * Este vetor representa o "pior caso" para muitos algoritmos de ordenação,
     * como Bubble Sort, Insertion Sort e Quick Sort (com uma estratégia de pivô simples).
     * </p>
     *
     * @param tamanho O tamanho do vetor a ser gerado.
     * @return Um array de inteiros ordenado de forma decrescente (tamanho-1, tamanho-2, ...).
     */
    public static int[] gerarVetorInversamenteOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = tamanho - 1 - i;
        }
        return vetor;
    }
}
