package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Titular extends Beneficiario implements Cobertura {

    public Titular(String nome, LocalDate dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    private static final int LIMITE_DEPENDENTES = 3;
    private static final int IDADE_MAXIMA_DEPENDENTE = 24;

    private List<Dependente> dependentes = new ArrayList<>();

    public boolean adicionarDependente(Dependente dependente) {

        if (dependentes.size() >= LIMITE_DEPENDENTES) {
            return false;
        }
        if (dependente.getIdade() >  IDADE_MAXIMA_DEPENDENTE) {
            return false;
        }

        dependentes.add(dependente);
        return true;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    @Override
    public double calcularMensalidade() {
        return calcularMensalidadeBase();
    }

    @Override
    public boolean possuiCobertura(TipoCobertura cobertura) {
        return true;
    }

    public void emitirResumoContrato() {

        double total = calcularMensalidade();

        System.out.println("\nTitular: " + getNome());
        System.out.println("CPF: " + getCpf());

        System.out.println("\nDependentes:");

        for (Dependente dependente : dependentes) {

            System.out.println(dependente.getNome() + " - CPF: " + dependente.getCpf());

            total += dependente.calcularMensalidade();
        }

        System.out.printf("\nTotal mensal: R$ %.2f%n" , total);
    }
}