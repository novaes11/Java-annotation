package AlgoritmosDeOrdenação;

import AlgoritmosDeOrdenação.Analise.Analisador;
import AlgoritmosDeOrdenação.Apresentador.ApresentadorConsole;
import AlgoritmosDeOrdenação.Apresentador.ApresentadorResultados;
import AlgoritmosDeOrdenação.MetodosDeOrdenação.*;
import AlgoritmosDeOrdenação.Resultados.Resultado;

import java.util.List;

/**
 * Ponto de entrada da aplicação para análise de algoritmos de ordenação.
 * <p>
 * A arquitetura deste projeto foi refatorada para seguir as boas práticas e
 * os princípios de design <strong>SOLID</strong>, resultando em um código mais limpo,
 * modular e de fácil manutenção.
 * </p>
 * <p>
 * Seguindo esses princípios, a classe {@code Main} agora tem a única responsabilidade de
 * configurar e iniciar o processo de análise. Ela cria as dependências
 * (algoritmos, tamanhos, apresentador) e as injeta na classe {@link Analisador},
 * que executa a lógica de negócio principal.
 * </p>
 *
 * @author João Vitor Novaes
 */
public class OrdenacaoMain {

    public static void main(String[] args) {
        // 1. Configuração (Criação das Dependências)
        List<Ordenador> algoritmos = List.of(
                new BubbleSort(),
                new InsertionSort(),
                new SelectionSort(),
                new MergeSort(),
                new QuickSort()
        );

        List<Integer> tamanhos = List.of(1000, 10000, 100000);

        ApresentadorResultados apresentador = new ApresentadorConsole();

        // 2. Injeção de Dependência (Conecta os objetos)
        Analisador analisador = new Analisador(algoritmos, tamanhos);

        // 3. Execução da Lógica Principal
        List<Resultado> resultados = analisador.analisar();

        // 4. Apresentação dos Resultados
        apresentador.exibir(resultados);
    }
}
