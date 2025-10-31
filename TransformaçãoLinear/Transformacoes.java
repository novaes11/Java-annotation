package TransformaçãoLinear;

public class Transformacoes {
    public String escala(double x, double y, double t){
        if(t > 0 && t < 1 ) return "T_contração ("+ t * x +","+ t * y + ")";
        return "T_espanção ("+ correcao0(t * x) +","+ correcao0(t * y) + ")";
    }

    public String reflexaoEixoY(double x, double y){
        return "T_reflexEixoY ("+ correcao0(x * -1) + "," + correcao0(y)+ ")";
    }

    public String reflexaoEixoX(double x, double y){
        return "T_reflexEixoX ("+ correcao0(x) + "," + correcao0(y * (-1)) + ")";
    }

    public String reflexaoOrigem(double x, double y){
        return "T_reflexOrigem ("+ correcao0(x * -1) + "," + correcao0(y * -1) + ")";
    }

    public String rotacaoGraus(double x, double y, double graus){

        return "T_rotação "+graus+"°" +
                " ("+String.format("%.0f", correcao0(x * Math.cos(Math.toRadians(graus))) - correcao0(y * Math.sin(Math.toRadians(graus))))+
                "," +
                String.format("%.0f", correcao0(y * Math.cos(Math.toRadians(graus))) + correcao0(x * Math.sin(Math.toRadians(graus))))+ ")";
    }

    public double correcao0(double valor){
        return valor + 0.0;
    }


}
