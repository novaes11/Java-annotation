package src.TransformaçãoLinear;

/**
 * Fornece métodos para realizar várias transformações lineares em um ponto 2D.
 */
public class Transformacoes {

    /**
     * Aplica uma transformação de escala a um ponto (x, y).
     *
     * @param x A coordenada x do ponto.
     * @param y A coordenada y do ponto.
     * @param t O fator de escala. Se 0 &lt; t &lt; 1, é uma contração; caso contrário, é uma expansão.
     * @return Uma string representando o ponto transformado.
     */
    public String escala(double x, double y, double t){
        if(t > 0 && t < 1 ) return "T_contração ("+ t * x +","+ t * y + ")";
        return "T_espanção ("+ correcao0(t * x) +","+ correcao0(t * y) + ")";
    }

    /**
     * Reflete um ponto em relação ao eixo Y.
     *
     * @param x A coordenada x do ponto.
     * @param y A coordenada y do ponto.
     * @return Uma string representando o ponto refletido.
     */
    public String reflexaoEixoY(double x, double y){
        return "T_reflexEixoY ("+ correcao0(x * -1) + "," + correcao0(y)+ ")";
    }

    /**
     * Reflete um ponto em relação ao eixo X.
     *
     * @param x A coordenada x do ponto.
     * @param y A coordenada y do ponto.
     * @return Uma string representando o ponto refletido.
     */
    public String reflexaoEixoX(double x, double y){
        return "T_reflexEixoX ("+ correcao0(x) + "," + correcao0(y * (-1)) + ")";
    }

    /**
     * Reflete um ponto em relação à origem.
     *
     * @param x A coordenada x do ponto.
     * @param y A coordenada y do ponto.
     * @return Uma string representando o ponto refletido.
     */
    public String reflexaoOrigem(double x, double y){
        return "T_reflexOrigem ("+ correcao0(x * -1) + "," + correcao0(y * -1) + ")";
    }

    /**
     * Rotaciona um ponto em torno da origem por um determinado número de graus.
     *
     * @param x     A coordenada x do ponto.
     * @param y     A coordenada y do ponto.
     * @param graus O ângulo de rotação em graus.
     * @return Uma string representando o ponto rotacionado.
     */
    public String rotacaoGraus(double x, double y, double graus){

        return "T_rotação "+graus+"°" +
                " ("+String.format("%.0f", correcao0(x * Math.cos(Math.toRadians(graus))) - correcao0(y * Math.sin(Math.toRadians(graus))))+
                "," +
                String.format("%.0f", correcao0(y * Math.cos(Math.toRadians(graus))) + correcao0(x * Math.sin(Math.toRadians(graus))))+ ")";
    }

    /**
     * Corrige a exibição de -0.0 para 0.0.
     *
     * @param valor O valor a ser corrigido.
     * @return O valor corrigido.
     */
    public double correcao0(double valor){
        return valor + 0.0;
    }
}
