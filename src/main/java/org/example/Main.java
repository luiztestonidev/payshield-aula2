package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito("1234-5678-9101-1121", "luiz", 5000.00);

        ProcessadorPagamento processador = new ProcessadorPagamento(cartao);

        processador.executarVenda(2000.00);

        processador.executarVenda(4000.00);
    }
}