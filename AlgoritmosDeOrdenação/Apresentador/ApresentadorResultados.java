package Apresentador;

import Resultados.Resultado;

import java.util.List;

/**
 * Interface para apresentar os resultados da análise dos algoritmos.
 * <p>
 * A implementação define onde e como os resultados são exibidos (console, arquivo, etc.).
 * Isso segue o Princípio da Responsabilidade Única, separando a lógica de
 * apresentação da lógica de análise.
 * </p>
 */
public interface ApresentadorResultados {
    /**
     * Exibe uma lista de resultados.
     *
     * @param resultados A lista de {@link Resultado} a ser apresentada.
     */
    void exibir(List<Resultado> resultados);
}
