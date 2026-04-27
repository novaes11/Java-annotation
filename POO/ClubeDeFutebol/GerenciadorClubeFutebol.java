package POO.ClubeDeFutebol;
import java.util.*;


public class GerenciadorClubeFutebol {
   static void main() throws IllegalAccessException {
       Repositorio<Jogador> repositorio = new Repositorio<>();




       Scanner sc = new Scanner(System.in);
       System.out.println("=== Gerenciador ClubeFutebol ===");
       System.out.println("informe quantos jogadores a serem cadastrados:");


       int n = sc.nextInt();


       for(int i = 1;  i <= n; i++) {
           System.out.print("Insira o n° da camiseta: ");
           int camisa = sc.nextInt();


           System.out.print("Insira o nome do jogador: ");
           String nome = sc.next();


           System.out.print("Insira o salário do jogador: R$");
           double salario  = sc.nextDouble();
           repositorio.adicionar(new Jogador(camisa, nome, salario));


           sc.nextLine();
       }


       repositorio.listarJogadores();


       System.out.print("\nPara alterar o valor do salario, insira:\nPorcentagem(0-100): ");
       double porcentagem = sc.nextDouble();
       System.out.print("Camisa: ");
       int camisa = sc.nextInt();


       repositorio.buscarCamisa(camisa).aumentarSalario(porcentagem);


       repositorio.listarJogadores();






   }
}
