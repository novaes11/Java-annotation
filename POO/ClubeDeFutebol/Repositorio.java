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
