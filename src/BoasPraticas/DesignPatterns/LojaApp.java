package src.BoasPraticas.DesignPatterns;

import src.BoasPraticas.DesignPatterns.factory.ProdutoFactory;
import src.BoasPraticas.DesignPatterns.repository.Catalogo;
import src.BoasPraticas.DesignPatterns.model.Produto;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Ponto de entrada e interface de usuário para o sistema de gerenciamento da loja.
 * Esta classe é responsável por exibir o menu, capturar a entrada do usuário
 * e coordenar as operações de negócio, como cadastro, listagem e venda de produtos.
 */
public class LojaApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final Catalogo<Produto> catalogo = Catalogo.getInstance();

    /**
     * Método principal que inicia a aplicação e mantém o loop do menu interativo.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        int opcao = -1;

        System.out.println("Bem-vindo ao Sistema de Gestão Loja Pro!");

        while (opcao != 0) {
            exibirMenu();
            try {
                opcao = lerInteiro("Escolha uma opção: ");

                switch (opcao) {
                    case 1 -> listar();
                    case 2 -> cadastrar();
                    case 3 -> aplicarDesconto();
                    case 4 -> realizarVenda();
                    case 5 -> remover();
                    case 0 -> System.out.println("\nObrigado por usar nosso sistema. Até logo!");
                    default -> System.out.println("⚠️ Opção inválida! Tente novamente.");
                }
            } catch (Exception e) {
                System.err.println("❌ Erro: " + e.getMessage());
            }
        }
        sc.close();
    }

    /**
     * Exibe o menu principal de operações do sistema.
     */
    private static void exibirMenu() {
        System.out.println("\n========================================");
        System.out.println("          MENU DE OPERAÇÕES");
        System.out.println("========================================");
        System.out.println("1) 📋 Listar Todos os Produtos");
        System.out.println("2) ➕ Cadastrar Novo Produto");
        System.out.println("3) 💰 Aplicar Desconto Especial");
        System.out.println("4) 🛒 Registrar Venda");
        System.out.println("5) ❌ Remover Produto do Estoque");
        System.out.println("0) 🚪 Sair do Sistema");
        System.out.println("========================================");
    }

    /**
     * Lista todos os produtos atualmente cadastrados no catálogo.
     */
    private static void listar() {
        System.out.println("\n📦 ESTOQUE ATUAL:");
        catalogo.listarProdutos();
    }

    /**
     * Guia o usuário através do processo de cadastro de um novo produto,
     * utilizando a ProdutoFactory para criar a instância correta.
     */
    private static void cadastrar() {
        System.out.println("\n--- CADASTRO DE PRODUTO ---");
        System.out.print("Tipo (E para Eletrônico / A para Alimento): ");
        String tipo = sc.next().toUpperCase();

        System.out.print("Código Identificador: ");
        String cod = sc.next();
        sc.nextLine(); // Limpa buffer

        if (catalogo.verificadorCodigo(cod)) {
            throw new IllegalArgumentException("Este código já existe no sistema!");
        }

        System.out.print("Nome/Descrição: ");
        String desc = sc.nextLine();

        System.out.print("Preço de Venda: R$ ");
        double preco = sc.nextDouble();

        String infoExtra;
        if (tipo.equals("E")) {
            System.out.print("Meses de Garantia (apenas números): ");
            infoExtra = sc.next();
        } else {
            System.out.print("Data de Validade (dd/mm/aaaa): ");
            infoExtra = sc.next();
        }

        // USO DA FACTORY
        Produto novo = ProdutoFactory.criar(tipo, cod, desc, preco, infoExtra);
        catalogo.adicionar(novo);
        System.out.println("✅ Produto cadastrado com sucesso!");
    }

    /**
     * Aplica um desconto percentual a um produto específico, buscado por seu código.
     */
    private static void aplicarDesconto() {
        System.out.print("\nDigite o código do produto: ");
        String cod = sc.next();
        System.out.print("Qual a porcentagem de desconto (Ex: 10)? ");
        double porc = sc.nextDouble();

        catalogo.buscarPorCodigo(cod).aplicarDesconto(porc);
    }

    /**
     * Registra a venda de uma certa quantidade de um produto, buscado por seu código.
     */
    private static void realizarVenda() {
        System.out.print("\nDigite o código do item vendido: ");
        String cod = sc.next();
        System.out.print("Quantidade vendida: ");
        int qtd = sc.nextInt();

        catalogo.buscarPorCodigo(cod).vender(qtd);
    }

    /**
     * Remove um produto do catálogo com base no seu código.
     * (Implementação pendente no código original)
     */
    private static void remover() {
        System.out.print("\nDigite o código para remover permanentemente: ");
        String cod = sc.next();
    }

    /**
     * Lê um número inteiro do console de forma segura, tratando exceções
     * caso o usuário digite um valor não numérico.
     *
     * @param mensagem A mensagem a ser exibida ao usuário.
     * @return O número inteiro lido.
     */
    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Por favor, digite um número válido.");
                sc.nextLine(); // Limpa o erro do scanner
            }
        }
    }
}
