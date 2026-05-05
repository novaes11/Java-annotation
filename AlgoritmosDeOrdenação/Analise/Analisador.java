package AlgoritmosDeOrdenação.Analise;

import AlgoritmosDeOrdenação.GeradorDeVetores.GeradorDeVetores;
import AlgoritmosDeOrdenação.Resultados.Resultado;
import AlgoritmosDeOrdenação.MetodosDeOrdenação.Ordenador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe responsável por analisar o desempenho de algoritmos de ordenação.
 * <p>
 * Esta classe segue o Princípio da Responsabilidade Única, focando apenas na
 * execução dos testes e na coleta de métricas. Ela depende de abstrações
 * (Ordenador, ApresentadorResultados) e as recebe via injeção de dependência,
 * aderindo ao Princípio da Inversão de Dependência.
 * </p>
 */
public class Analisador {

    private final List<Ordenador> algoritmos;
    private final List<Integer> tamanhos;

    /**
     * Construtor que utiliza injeção de dependência.
     *
     * @param algoritmos A lista de algoritmos a serem analisados.
     * @param tamanhos   A lista de tamanhos de vetores a serem testados.
     */
    public Analisador(List<Ordenador> algoritmos, List<Integer> tamanhos) {
        this.algoritmos = algoritmos;
        this.tamanhos = tamanhos;
    }

    /**
     * Executa a análise completa e retorna uma lista de resultados.
     *
     * @return Uma lista de objetos {@link Resultado} contendo as métricas de cada teste.
     */
    public List<Resultado> analisar() {
        List<Resultado> resultados = new ArrayList<>();
        String[] tiposDeVetor = {"Aleatório", "Ordenado", "Inverso"};

        for (Ordenador algoritmo : algoritmos) {
            for (int tamanho : tamanhos) {
                for (String tipo : tiposDeVetor) {
                    Resultado res = executarTeste(algoritmo, tipo, tamanho);
                    resultados.add(res);
                }
            }
        }
        return resultados;
    }

    private Resultado executarTeste(Ordenador algoritmo, String tipoVetor, int tamanho) {
        int[] vetor = switch (tipoVetor) {
            case "Aleatório" -> GeradorDeVetores.gerarVetorAleatorio(tamanho);
            case "Ordenado" -> GeradorDeVetores.gerarVetorOrdenado(tamanho);
            case "Inverso" -> GeradorDeVetores.gerarVetorInversamenteOrdenado(tamanho);
            default -> throw new IllegalArgumentException("Tipo de vetor desconhecido: " + tipoVetor);
        };

        int[] copiaVetor = Arrays.copyOf(vetor, vetor.length);

        long startTime = System.nanoTime();
        algoritmo.ordenar(copiaVetor);
        long endTime = System.nanoTime();

        long durationInNanos = (endTime - startTime);
        double durationInMillis = durationInNanos / 1_000_000.0;

        return new Resultado(algoritmo.getNome(), tipoVetor, tamanho, durationInMillis);
    }
}
