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
