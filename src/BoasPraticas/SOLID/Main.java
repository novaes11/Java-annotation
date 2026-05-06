package src.BoasPraticas.SOLID;

/**
 * Ponto de entrada da aplicação de gerenciamento de biblioteca.
 * Esta classe é responsável por inicializar e conectar os componentes
 * principais do sistema, seguindo os princípios SOLID.
 */
public class Main {
    /**
     * Método principal que configura e inicia a aplicação.
     * Ele instancia o repositório de livros, a biblioteca com suas regras de negócio
     * e a interface de usuário (menu) para interação.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // 1. Define onde os dados moram
        LivroRepositorio repo = new ArquivoLivroRepositorio();

        // 2. Cria o motor de regras (negócio)
        Biblioteca b = new Biblioteca(repo);

        // 3. Cria a interface de usuário e inicia
        Menu menu = new Menu(b);
        menu.iniciar();
    }
}
