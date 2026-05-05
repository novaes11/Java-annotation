package AlgoritmosDeOrdenação.Apresentador;

import AlgoritmosDeOrdenação.Resultados.Resultado;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementação de {@link ApresentadorResultados} que exibe os dados
 * em uma tabela formatada no console.
 */
public class ApresentadorConsole implements ApresentadorResultados {

    @Override
    public void exibir(List<Resultado> resultados) {
        if (resultados == null || resultados.isEmpty()) {
            System.out.println("Nenhum resultado para exibir.");
            return;
        }

        System.out.printf("%-20s | %-15s | %-10s | %-15s%n", "Algoritmo", "Tipo de Vetor", "Tamanho", "Tempo (ms)");
        System.out.println(new String(new char[70]).replace('\0', '-'));

        // Agrupa os resultados por algoritmo para uma exibição mais organizada
        var resultadosAgrupados = resultados.stream()
                .collect(Collectors.groupingBy(Resultado::nomeAlgoritmo));

        resultadosAgrupados.forEach((nomeAlgoritmo, listaResultados) -> {
            listaResultados.forEach(r ->
                    System.out.printf("%-20s | %-15s | %-10d | %.4f%n",
                            r.nomeAlgoritmo(), r.tipoVetor(), r.tamanho(), r.tempoExecucao())
            );
            System.out.println(new String(new char[70]).replace('\0', '-'));
        });
    }
}
