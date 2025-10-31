package Exercicio2;

public class Pix implements Pagamento{
    private double saldo;
    String dataHoraLimpa = GerenciadorTimestamp.getTimestampFormatado();

    public Pix(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pix setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    @Override
    public void pagar(double valor) {

        if(this.saldo - (valor * (1 +taxaAplicada())) < 0){
            throw new IllegalArgumentException("Transação invalida. Saldo insuficiente.");
        }

        this.saldo -= valor * (1 +taxaAplicada());
        System.out.println(recibo(valor) +
                "\nNovo saldo: " + String.format("%.2f", this.saldo));
    }

    @Override
    public double taxaAplicada() {
        return 0;
    }

    @Override
    public String toString() {
        return "Pix";
    }
}
