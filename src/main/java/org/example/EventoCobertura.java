package org.example;

import java.time.LocalDate;

public class EventoCobertura {

    private LocalDate data;
    private TipoCobertura tipo;
    private Beneficiario solicitante;

    public EventoCobertura(LocalDate data, TipoCobertura tipo, Beneficiario solicitante) {
        this.data = data;
        this.tipo = tipo;
        this.solicitante = solicitante;
    }

    public void exibirEvento() {

        System.out.println("Data: " + data);
        System.out.println("Tipo: " + tipo);
        System.out.println("Solicitante: " + solicitante.getNome());
    }
}