package src.AlgoritmosDeOrdenação.Resultados;

/**
 * Um record para armazenar os dados de um único resultado de teste de ordenação.
 * Sendo um record, é uma classe imutável, ideal para transportar dados.
 *
 * @param nomeAlgoritmo O nome do algoritmo testado.
 * @param tipoVetor A configuração do vetor (ex: "Aleatório", "Ordenado").
 * @param tamanho O tamanho do vetor.
 * @param tempoExecucao O tempo de execução medido em milissegundos.
 */
public record Resultado(
        String nomeAlgoritmo,
        String tipoVetor,
        int tamanho,
        double tempoExecucao
) {
}
