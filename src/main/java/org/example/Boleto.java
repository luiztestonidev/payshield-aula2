package org.example;

public class Boleto implements MeioPagamento {




    @Override
    public void pagar(double valor) {
        System.out.println("Gerando boleto no valor de R$ " + valor);
    }

    @Override
    public String tipo() {
        return "Boleto";
    }
}
