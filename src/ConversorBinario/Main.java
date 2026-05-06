package src.ConversorBinario;

import java.util.Scanner;

/**
 * Uma aplicação de console para converter números entre as bases decimal e binária.
 */
public class Main{
    /**
     * Ponto de entrada da aplicação. Apresenta um menu para o usuário escolher
     * a conversão desejada e processa a entrada.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal, decimal1, binario, resto, menu = 0, n_letras;
        String cad_binario, cad_resto = "", cad_decimal = "";
        char letra;

        System.out.println("Conversor de numeros:");

        do{
            System.out.println("1)Conversor decimal para binario.\n2)Conversor binario para decimal.\n3)Sair.\n");
            menu = scanner.nextInt();

            switch(menu){
                case 1:
                    System.out.println("Digite o numero decimal:");
                    decimal1 = scanner.nextInt();

                    decimal = decimal1; // apenas para mostrar a resposta para o usuario dps.
                    cad_binario = "";   // apenas para concatenar posteriormente.

                    while(decimal>=1){
                        resto = decimal % 2;
                        decimal = decimal / 2;
                        cad_resto = "" + resto;
                        cad_decimal = "" + decimal;

                        System.out.println("--------------------------------");
                        System.out.println("decimal: " + cad_decimal);
                        System.out.println("resto: " + cad_resto);
                        System.out.println("--------------------------------");

                        cad_binario = cad_resto + cad_binario;
                    }
                    System.out.println("O numero "+ decimal1 + " em binario é: "+ cad_binario);
                    System.out.println(menu);
                    break;
                case 2:
                    System.out.println("Digite o numero binario:");
                    cad_binario = scanner.next();

                    // Etapas para verificar se os numeros sao validos em uma base binario (apenas 0 e 1):

                    // 1° verificar o numero do indice 0, caso != 1 ou 0, ivalidar.
                    while(cad_binario.equals("2") || cad_binario.equals("3") || cad_binario.equals("4") ||
                            cad_binario.equals("5") || cad_binario.equals("6") || cad_binario.equals("7") ||
                            cad_binario.equals("8") || cad_binario.equals("9")){
                        System.out.println("Numero invalido! Digite novamente!");
                        cad_binario = scanner.next();
                    }
                    n_letras = cad_binario.length();

                    // 2° verificar o resto dos numeros se são validos.
                    for( int i = n_letras - 1 /* -1 para verificar o indice */; i > 0 ; i-- ){
                        letra = cad_binario.charAt(i);

                        if(letra != '1' && letra!= '0'){
                            System.out.println("Numero invalido! Digite novamente.");
                            cad_binario = scanner.next();
                            n_letras = cad_binario.length();
                            i = n_letras - 1;
                        }
                        System.out.println("Estou aq");
                    }
                    break;
            }
        }while(menu != 3);
    }
}
