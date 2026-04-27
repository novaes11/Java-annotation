package SistemaPagamento;

public interface Pagamento {
    String dataHoraLimpa = GerenciadorTimestamp.getTimestampFormatado();

    void pagar(double valor);

    default String recibo(double valor){

        return "\n--RECIBO--" +
                "\nValor: " + String.format("%.2f", valor) +
                "\nTaxa: " + String.format("%.1f", taxaAplicada() * 100) + "%" +
                "\nTotal: " + String.format("%.2f", valor * (1 + taxaAplicada())) +
                "\nMeio de Pagamento: " + this +
                "\nData e hora: " + dataHoraLimpa;
    }

    default double taxaAplicada(){
        return 0.0;
    }
}
