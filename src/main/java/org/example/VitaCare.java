package org.example;

import java.time.LocalDate;

public class VitaCare {

    public void executar() {

        Titular titular = new Titular("Luiz", LocalDate.of(2002, 1, 16), "11273442654");

        Dependente dependente1 = new Dependente("Luizinho", LocalDate.of(2008, 1, 16), "22384553754", titular);
        Dependente dependente2 = new Dependente("Luizinha", LocalDate.of(2010, 5, 20), "99887766554", titular);
        Dependente dependente3 = new Dependente("Pablo", LocalDate.of(2005, 5, 17), "12345675371", titular);
        Dependente dependente4 = new Dependente("Paula", LocalDate.of(2008, 8, 20), "12314975371", titular);
        Dependente dependente5 = new Dependente("Marmanjo", LocalDate.of(2000, 1, 1), "12345678911", titular);

        Aposentado aposentado = new Aposentado("Ze", LocalDate.of(1955, 3, 10), "55443322119");

        boolean adicionou1 = titular.adicionarDependente(dependente1);
        boolean adicionou2 = titular.adicionarDependente(dependente2);
        boolean adicionou3 = titular.adicionarDependente(dependente3);
        boolean adicionou4  = titular.adicionarDependente(dependente4);
        boolean adicionou5 = titular.adicionarDependente(dependente5);

        System.out.println("Dependente 1 adicionado: " + adicionou1);
        System.out.println("Dependente 2 adicionado: " + adicionou2);
        System.out.println("Dependente 3 adicionado: " + adicionou3);
        System.out.println("Dependente 4 adicionado: " + adicionou4);
        System.out.println("Dependente 5 adicionado: " + adicionou5);

        System.out.println("\n-MENSALIDADES-");

        System.out.printf("Titular: R$ %.2f%n" , titular.calcularMensalidade());
        System.out.printf("Dependente 1: R$ %.2f%n" , dependente1.calcularMensalidade());
        System.out.printf("Dependente 2: R$ %.2f%n" , dependente2.calcularMensalidade());
        System.out.printf("Aposentado: R$ %.2f%n" , aposentado.calcularMensalidade());

        System.out.println("\n-COBERTURAS-");

        System.out.println("Dependente possui internacao? " + dependente1.temCoberturaPara(TipoCobertura.INTERNACAO));
        System.out.println("Titular possui internacao? " + titular.temCoberturaPara(TipoCobertura.INTERNACAO));
        System.out.println("Aposentado possui consulta? " + aposentado.temCoberturaPara(TipoCobertura.CONSULTA));

        System.out.println("\n-RESUMO CONTRATO-");

        titular.emitirResumoContrato();

        System.out.println("\n-EVENTO COBERTURA-");

        EventoCobertura evento = new EventoCobertura(LocalDate.now(), TipoCobertura.CONSULTA, dependente1);

        evento.exibirEvento();
    }
}