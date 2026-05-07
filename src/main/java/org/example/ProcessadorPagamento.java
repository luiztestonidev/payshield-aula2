package org.example;

public class ProcessadorPagamento {

     private CartaoCredito cartao;

     public ProcessadorPagamento(CartaoCredito cartao) {
         this.cartao = cartao;
     }

     public void executarVenda(double valor) {
         if (valor <= cartao.getLimiteDisponivel()) {
             cartao.alterarLimite(cartao.getLimiteDisponivel() - valor);
             System.out.println("Venda de R$ " + valor + " aprovada");
             System.out.println("limite restante R$ " + cartao.getLimiteDisponivel());
         } else {
             System.out.println("Transação negada, limite insuficiente.");
         }
     }
     
     public void estornarVenda(double valor) {
         cartao.alterarLimite(cartao.getLimiteDisponivel() + valor);
         System.out.println("Estorno de R$ " + valor + " realizado");
         System.out.println("Limite restante R$ " + cartao.getLimiteDisponivel());
     }
}
