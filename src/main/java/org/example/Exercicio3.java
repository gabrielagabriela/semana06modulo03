package org.example;

public class Exercicio3 {

    public void processarPedido(int pedidoId, String cliente, String endereco, double valor, boolean pagamentoConfirmado, boolean estoqueDisponivel, boolean entregaExpressa) {
        if (!pagamentoConfirmado) {
            System.out.println(mensagemPagamentoNaoConfirmado(pedidoId, cliente));
            return;
        }

        if (!estoqueDisponivel) {
            System.out.println(mensagemEstoqueIndisponivel(pedidoId, cliente));
            return;
        }

        System.out.println(entregaExpressa ? mensagemEntregaExpressa(pedidoId, cliente, endereco) : mensagemEntregaNormal(pedidoId, cliente, endereco));
    }

    private String mensagemPagamentoNaoConfirmado(int pedidoId, String cliente) {
        return "Pedido " + pedidoId + " para " + cliente + " não pode ser processado porque o pagamento não foi confirmado.";
    }

    private String mensagemEstoqueIndisponivel(int pedidoId, String cliente) {
        return "Pedido " + pedidoId + " para " + cliente + " não pode ser processado devido à falta de estoque.";
    }

    private String mensagemEntregaExpressa(int pedidoId, String cliente, String endereco) {
        return "Pedido " + pedidoId + " para " + cliente + " será enviado para " + endereco + " com entrega expressa.";
    }

    private String mensagemEntregaNormal(int pedidoId, String cliente, String endereco) {
        return "Pedido " + pedidoId + " para " + cliente + " será enviado para " + endereco + " com entrega normal.";
    }
}