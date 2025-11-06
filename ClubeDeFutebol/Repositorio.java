package ClubeDeFutebol;


import java.util.ArrayList;
import java.util.List;


public class Repositorio<T extends Jogador>{
   private List<T> lista;


   public Repositorio(){
       lista = new ArrayList<>();
   }


   public void adicionar(T jogador){
       if(!verificadorCamisa(jogador.getCamisa())) {
           lista.add(jogador);
           System.out.println("\nJogador registrado!");
       } else {
           System.out.println("\nCadastro não executado!");
       }
   }


   private boolean verificadorCamisa(int camisa) {
       return lista.stream().anyMatch(jogador -> jogador.getCamisa() == camisa);
   }


   public T buscarCamisa(int camisa) throws IllegalAccessException {
       if(!verificadorCamisa(camisa)) {
           throw new IllegalAccessException("Salário não alterado! Obs: Jogador não encontrado.");
       }
       System.out.println("Salário alterado com sucesso!");
       return lista.stream().filter(jogador -> jogador.getCamisa() == camisa).findFirst().get();
   }


   public void listarJogadores(){
       System.out.println("\n=== Lista de Jogadores ===");
       for (T jogador : lista){
           System.out.println(jogador);
       }
   }
}
package ClubeDeFutebol;


public class Jogador {


   private int camisa;
   private String nome;
   private double salarioMensal;


   public Jogador(int camisa, String nome, double salarioMensal) {
       this.camisa = camisa;
       this.nome = nome;
       this.salarioMensal = salarioMensal;
   }


   public double getSalarioMensal() {
       return salarioMensal;
   }


   public String getNome() {
       return nome;
   }


   public int getCamisa() {
       return camisa;
   }




   public void aumentarSalario(double porcentagem){
       if(porcentagem < 0 || porcentagem > 100){
           throw  new IllegalArgumentException("Porcentagem inserida invalida! obs: deve estar entre 0 e 100.");
       }
       salarioMensal += salarioMensal * porcentagem/100;
   }


   @Override
   public String toString() {
       return "camisa: " + camisa +
               " | nome: " + nome +
               " | salario mensal: R$" + String.format("%.2f", salarioMensal);
   }
}
