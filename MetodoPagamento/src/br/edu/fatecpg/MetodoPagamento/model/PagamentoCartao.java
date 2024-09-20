package br.edu.fatecpg.MetodoPagamento.model;

public class PagamentoCartao implements Pagamento {
    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor + (valor * 0.05); 
    }

    @Override
    public String emitirRecibo() {
        return "Pagamento Cartão: R$" + calcularPagamento() + "\nValor original: R$" + valor + "\nTaxa: 5%";
    }
}
