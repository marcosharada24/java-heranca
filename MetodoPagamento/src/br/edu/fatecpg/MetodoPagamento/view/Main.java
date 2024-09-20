package br.edu.fatecpg.MetodoPagamento.view;

import br.edu.fatecpg.MetodoPagamento.model.Pagamento;
import br.edu.fatecpg.MetodoPagamento.model.PagamentoCartao;
import br.edu.fatecpg.MetodoPagamento.model.PagamentoDinheiro;

public class Main {
    public static void main(String[] args) {
        double valorPagamento = 100.00;

       
        Pagamento pagamentoCartao = new PagamentoCartao(valorPagamento);
        System.out.println(pagamentoCartao.emitirRecibo());

      
        Pagamento pagamentoDinheiro = new PagamentoDinheiro(valorPagamento);
        System.out.println(pagamentoDinheiro.emitirRecibo());
    }
}
