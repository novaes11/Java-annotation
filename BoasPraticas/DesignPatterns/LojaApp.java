package BoasPraticas.DesignPatterns;

import BoasPraticas.DesignPatterns.factory.ProdutoFactory;
import BoasPraticas.DesignPatterns.repository.Catalogo;
import BoasPraticas.DesignPatterns.model.Produto;
import java.util.Scanner;
import java.util.InputMismatchException;

public class LojaApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final Catalogo<Produto> catalogo = Catalogo.getInstance();

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

    // --- MÉTODOS DE APOIO (UX) ---

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

    private static void listar() {
        System.out.println("\n📦 ESTOQUE ATUAL:");
        catalogo.listarProdutos();
    }

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

    private static void aplicarDesconto() {
        System.out.print("\nDigite o código do produto: ");
        String cod = sc.next();
        System.out.print("Qual a porcentagem de desconto (Ex: 10)? ");
        double porc = sc.nextDouble();

        catalogo.buscarPorCodigo(cod).aplicarDesconto(porc);
    }

    private static void realizarVenda() {
        System.out.print("\nDigite o código do item vendido: ");
        String cod = sc.next();
        System.out.print("Quantidade vendida: ");
        int qtd = sc.nextInt();

        catalogo.buscarPorCodigo(cod).vender(qtd);
    }

    private static void remover() {
        System.out.print("\nDigite o código para remover permanentemente: ");
        String cod = sc.next();
    }

    // Método utilitário para evitar que o programa feche se o usuário digitar letras no menu
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