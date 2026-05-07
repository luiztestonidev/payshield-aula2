package org.example;

public class CartaoCredito {

    private String numeroCartao;
    private String titular;
    private double limiteDisponivel;
    private String cvv;

    public CartaoCredito(String numeroCartao, String titular, double limiteDisponivel) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void alterarLimite(double valor) {
        if (valor < 0) {
            System.out.println("Limite não pode ser negativo");
        }
     this.limiteDisponivel = valor;
    }
}
