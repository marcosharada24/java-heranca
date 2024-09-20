package br.edu.fatecpg.MetodoPagamento.model;

public interface Pagamento {
    double calcularPagamento(); 
    String emitirRecibo();
}
