package src.BoasPraticas.SOLID;

import java.util.Scanner;

/**
 * Classe responsável pela interação com o usuário através de um menu de texto.
 * Ela lida com a entrada de dados e a exibição de informações, delegando as
 * operações de negócio para a classe Biblioteca.
 */
public class Menu {
    private final Biblioteca biblioteca;
    private final Scanner teclado;

    /**
     * Construtor que inicializa o menu com uma instância da Biblioteca
     * e um Scanner para entrada de dados.
     *
     * @param biblioteca A instância da biblioteca a ser utilizada.
     */
    public Menu(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.teclado = new Scanner(System.in);
    }

    /**
     * Inicia o loop principal do menu, exibindo as opções e processando
     * a entrada do usuário até que a opção de sair seja escolhida.
     */
    public void iniciar() {
        int opcao = -1;

        while (opcao != 0) {
            exibirOpcoes();
            try {
                opcao = Integer.parseInt(teclado.nextLine());
                processarOpcao(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números.");
            } catch (Exception e) {
                System.out.println("Erro no sistema: " + e.getMessage());
            }
        }
    }

    /**
     * Exibe as opções disponíveis no menu principal.
     */
    private void exibirOpcoes() {
        System.out.println("\n--- MENU BIBLIOTECA ---");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Listar Acervo");
        System.out.println("3. Emprestar Livro");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    /**
     * Processa a opção escolhida pelo usuário, chamando o método correspondente
     * na biblioteca.
     *
     * @param opcao O número da opção escolhida pelo usuário.
     */
    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                System.out.print("Digite o título do livro: ");
                String titulo = teclado.nextLine();
                biblioteca.adicionarLivro(titulo);
                System.out.println("Livro adicionado!");
                break;
            case 2:
                System.out.println("\n--- ACERVO ATUAL ---");
                if (biblioteca.getAcervo().isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    biblioteca.getAcervo().forEach(l -> System.out.println("- " + l.getTitulo()));
                }
                break;
            case 3:
                if(!biblioteca.getAcervo().isEmpty()){
                    System.out.print("Título para empréstimo: ");
                    String busca = teclado.nextLine();
                    if (biblioteca.emprestarLivro(busca)) {
                        System.out.println("Empréstimo realizado com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado no acervo.");
                    }
                } else{
                    System.out.println("Lista está vazia, Operação Inválida!");
                }
                break;
            case 0:
                System.out.println("Encerrando sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
