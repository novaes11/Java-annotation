package src.POO.ClubeDeFutebol;

import java.util.ArrayList;
import java.util.List;

/**
 * Um repositório genérico para armazenar e gerenciar objetos do tipo Jogador.
 *
 * @param <T> O tipo de Jogador a ser armazenado no repositório.
 */
public class Repositorio<T extends Jogador>{
    private List<T> lista;

    /**
     * Construtor que inicializa a lista interna de jogadores.
     */
    public Repositorio(){
        lista = new ArrayList<>();
    }

    /**
     * Adiciona um jogador à lista, se o número da camisa ainda não estiver em uso.
     *
     * @param jogador O jogador a ser adicionado.
     */
    public void adicionar(T jogador){
        if(!verificadorCamisa(jogador.getCamisa())) {
            lista.add(jogador);
            System.out.println("\nJogador registrado!");
        } else {
            System.out.println("\nCadastro não executado!");
        }
    }

    /**
     * Verifica se já existe um jogador com o número da camisa especificado.
     *
     * @param camisa O número da camisa a ser verificado.
     * @return true se a camisa já estiver em uso, false caso contrário.
     */
    private boolean verificadorCamisa(int camisa) {
        return lista.stream().anyMatch(jogador -> jogador.getCamisa() == camisa);
    }

    /**
     * Busca um jogador pelo número da camisa.
     *
     * @param camisa O número da camisa do jogador a ser buscado.
     * @return O objeto Jogador correspondente.
     * @throws IllegalAccessException Se nenhum jogador for encontrado com a camisa especificada.
     */
    public T buscarCamisa(int camisa) throws IllegalAccessException {
        if(!verificadorCamisa(camisa)) {
            throw new IllegalAccessException("Salário não alterado! Obs: Jogador não encontrado.");
        }
        System.out.println("Salário alterado com sucesso!");
        return lista.stream().filter(jogador -> jogador.getCamisa() == camisa).findFirst().get();
    }

    /**
     * Exibe a lista de todos os jogadores cadastrados no repositório.
     */
    public void listarJogadores(){
        System.out.println("\n=== Lista de Jogadores ===");
        for (T jogador : lista){
            System.out.println(jogador);
        }
    }
}
