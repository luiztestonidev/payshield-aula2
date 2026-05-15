package org.example;

import org.example.CartaoCredito;
import org.example.Pix;
import org.example.Boleto;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        CartaoCredito cartaoCredito = new CartaoCredito();
        Pix pix = new Pix();
        Boleto boleto = new Boleto();

        List<MeioPagamento> pagamentos = new ArrayList<>();

        pagamentos.add(cartaoCredito);
        pagamentos.add(pix);
        pagamentos.add(boleto);

        for (MeioPagamento itens : pagamentos) {

            itens.pagar(100);

        }
    }
}
