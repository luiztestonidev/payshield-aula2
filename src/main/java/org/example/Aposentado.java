package org.example;

import java.time.LocalDate;

public class Aposentado extends Beneficiario implements Cobertura {

    public Aposentado(String nome, LocalDate dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    @Override
    public double calcularMensalidade() {
        return calcularMensalidadeBase() * 0.8;
    }

    @Override
    public boolean possuiCobertura(TipoCobertura cobertura) {

        switch (cobertura) {

            case CONSULTA:
            case EXAME:
            case INTERNACAO:
                return true;

            default:
                return false;
        }
    }
}
