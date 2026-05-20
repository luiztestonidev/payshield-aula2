package org.example;

import java.time.LocalDate;
import java.time.Period;

public abstract class Beneficiario {

    private String nome;
    private LocalDate dataNascimento;
    private final String cpf;

    public Beneficiario(String nome, LocalDate dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    protected double calcularMensalidadeBase() {

        int idade = getIdade();

        if (idade <= 18) {
            return 180;
        }
        if (idade <= 59) {
            return 340;
        }
        return 620;
    }

    public abstract double calcularMensalidade();
}
