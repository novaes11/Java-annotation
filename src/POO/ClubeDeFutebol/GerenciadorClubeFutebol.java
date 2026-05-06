package src.POO.ClubeDeFutebol;
import java.util.*;

/**
 * Classe principal para gerenciar as operações do clube de futebol,
 * como cadastrar jogadores e ajustar salários.
 */
public class GerenciadorClubeFutebol {

    /**
     * Ponto de entrada para a aplicação de gerenciamento do clube.
     * Permite ao usuário cadastrar um número específico de jogadores e, em seguida,
     * aplicar um aumento salarial a um jogador com base no número da camisa.
     *
     * @throws IllegalAccessException Se o usuário tentar alterar o salário de um jogador não existente.
     */
    static void main() throws IllegalAccessException {
        Repositorio<Jogador> repositorio = new Repositorio<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Gerenciador ClubeFutebol ===");
        System.out.println("informe quantos jogadores a serem cadastrados:");

        int n = sc.nextInt();

        for(int i = 1;  i <= n; i++) {
            System.out.print("Insira o n° da camiseta: ");
            int camisa = sc.nextInt();

            System.out.print("Insira o nome do jogador: ");
            String nome = sc.next();

            System.out.print("Insira o salário do jogador: R$");
            double salario  = sc.nextDouble();
            repositorio.adicionar(new Jogador(camisa, nome, salario));

            sc.nextLine();
        }

        repositorio.listarJogadores();

        System.out.print("\nPara alterar o valor do salario, insira:\nPorcentagem(0-100): ");
        double porcentagem = sc.nextDouble();
        System.out.print("Camisa: ");
        int camisa = sc.nextInt();

        repositorio.buscarCamisa(camisa).aumentarSalario(porcentagem);

        repositorio.listarJogadores();
    }
}
