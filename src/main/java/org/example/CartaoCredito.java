package org.example;

public class CartaoCredito implements MeioPagamento {




    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " no cartao de credito");
    }

    @Override
    public String tipo() {
        return "Cartao de Credito";
    }
}
