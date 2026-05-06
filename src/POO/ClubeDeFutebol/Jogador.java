package src.POO.ClubeDeFutebol;

/**
 * Representa um jogador de futebol, com informações como número da camisa,
 * nome e salário mensal.
 */
public class Jogador {

    private int camisa;
    private String nome;
    private double salarioMensal;

    /**
     * Construtor da classe Jogador.
     *
     * @param camisa        O número da camisa do jogador (entre 1 e 999).
     * @param nome          O nome do jogador (não pode ser nulo ou vazio).
     * @param salarioMensal O salário mensal do jogador (deve ser maior que zero).
     * @throws IllegalArgumentException Se algum dos parâmetros for inválido.
     */
    public Jogador(int camisa, String nome, double salarioMensal) {
        if (camisa < 1 || camisa > 999) throw new IllegalArgumentException("Número de camiseta invalido! Insira entre (0-1000).");
        if (nome == null || nome.trim().equals(" ")) throw new IllegalArgumentException("Nome invalido! Não deixe vazio.");
        if (salarioMensal <=0 ) throw new IllegalArgumentException("Salário inválido! Não pode ser negativo ou gial a zero.");
        this.camisa = camisa;
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    /**
     * Obtém o salário mensal do jogador.
     *
     * @return O salário mensal.
     */
    public double getSalarioMensal() {
        return salarioMensal;
    }

    /**
     * Obtém o nome do jogador.
     *
     * @return O nome do jogador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o número da camisa do jogador.
     *
     * @return O número da camisa.
     */
    public int getCamisa() {
        return camisa;
    }

    /**
     * Aumenta o salário do jogador com base em uma porcentagem.
     *
     * @param porcentagem A porcentagem de aumento (entre 0 e 100).
     * @throws IllegalArgumentException Se a porcentagem for inválida.
     */
    public void aumentarSalario(double porcentagem){
        if(porcentagem < 0 || porcentagem > 100){
            throw  new IllegalArgumentException("Porcentagem inserida invalida! obs: deve estar entre 0 e 100.");
        }
        salarioMensal += salarioMensal * porcentagem/100;
    }

    /**
     * Retorna uma representação em string do objeto Jogador.
     *
     * @return Uma string formatada com os dados do jogador.
     */
    @Override
    public String toString() {
        return "camisa: " + camisa +
                " | nome: " + nome +
                " | salario mensal: R$" + String.format("%.2f", salarioMensal);
    }
}
