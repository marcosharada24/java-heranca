package br.edu.fatecpg.MetodoPagamento.model;

public class PagamentoDinheiro implements Pagamento {
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor - (valor * 0.10);
    }

    @Override
    public String emitirRecibo() {
        return "Pagamento Dinheiro: R$" + calcularPagamento() + "\nValor original: R$" + valor + "\nDesconto: 10%";
    }
}
