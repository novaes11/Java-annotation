package TransformaçãoLinear;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcao;
        Transformacoes transformacoes = new Transformacoes();
        Scanner sc = new Scanner(System.in);
        double eixoX = 0, eixoY = 0;

        while(true){

            System.out.println(
                    "=== TRANSFORMAÇÕES LINEARES ===" + "\n" +
                            "(1) Transformação por escala" + "\n" +
                            "(2) Rotação na origem" + "\n" +
                            "(3) Rotação eixo X" + "\n" +
                            "(4) Rotação eixo Y" + "\n" +
                            "(5) Rotação em graus" + "\n" + "\n" +
                            "Forneca uma das opçôes:"

            );
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Agora forneca o par ordenado:\n" + "x = ");
                    eixoX = sc.nextDouble();
                    System.out.print("y = ");
                    eixoY = sc.nextDouble();
                    System.out.println("Para concluir, agora me forneça a escala:");
                    double escala = sc.nextDouble();
                    transformacoes.escala(eixoX, eixoY, escala);
                    break;
                case 2:
                    System.out.print("Agora forneca o par ordenado:\n" + "x = ");
                    eixoX = sc.nextDouble();
                    System.out.print("y = ");
                    eixoY = sc.nextDouble();
                    transformacoes.reflexaoOrigem(eixoX, eixoY);
                    break;
                case 3:
                    System.out.print("Agora forneca o par ordenado:\n" + "x = ");
                    eixoX = sc.nextDouble();
                    System.out.print("y = ");
                    eixoY = sc.nextDouble();
                    transformacoes.reflexaoEixoX(eixoX, eixoY);
                    break;
                case 4:
                    System.out.print("Agora forneca o par ordenado:\n" + "x = ");
                    eixoX = sc.nextDouble();
                    System.out.print("y = ");
                    eixoY = sc.nextDouble();
                    transformacoes.reflexaoEixoY(eixoX, eixoY);
                    break;
                case 5:
                    System.out.print("Agora forneca o par ordenado:\n" + "x = ");
                    eixoX = sc.nextDouble();
                    System.out.print("y = ");
                    eixoY = sc.nextDouble();
                    System.out.println("Agora me forneça quantos graus para a rotação: ");
                    int graus = sc.nextInt();
                    transformacoes.rotacaoGraus(eixoX, eixoY, graus);
                    break;    
            }
        }
    }
}
