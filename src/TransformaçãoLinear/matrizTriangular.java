package src.TransformaçãoLinear;

import java.util.Random;

/**
 * Verifica se uma matriz 3x3 gerada aleatoriamente é uma matriz triangular
 * e, em caso afirmativo, calcula sua determinante.
 */
public class matrizTriangular {
    /**
     * Ponto de entrada da aplicação. Gera uma matriz 3x3 com valores 0 ou 1,
     * verifica se é triangular (superior ou inferior) e, se for, calcula e
     * exibe a determinante.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        boolean veredito;
        int contador1 = 0, contador2 = 0;
        int[][] a = new int[3][3], determinante = new int[1][1];
        Random rd = new Random();

        // montagem de matriz
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                a[i][j] = rd.nextInt(0, 2);
                if (j == 2){
                    System.out.print(a[i][j]+"\n");
                }else{
                    System.out.print(a[i][j]+ " ");
                }
            }
        }

        // verificador de matriz angular
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                if((i == 0 && j == 1) || (i == 0 && j==2) || (i == 1 && j == 2)){
                    if (a[i][j] == 0) {
                        contador1++;
                    }
                }else if((i == 1 && j == 0) || (i == 2 && j == 0) || (i == 2 && j == 1)){
                    if (a[i][j] == 0) {
                        contador2++;
                    }
                }
            }
        }

        // cálculo ou não de determinante
        if (contador1 == 3 || contador2 == 3){
            System.out.println("É uma matriz triangular.");
            determinante[0][0] = a[0][0] * a[1][1] * a[2][2];
            System.out.println("Determinante = "+ determinante[0][0]);
        }else {
            System.out.println("Essa matriz não é triangular. ");
        }
    }
}
