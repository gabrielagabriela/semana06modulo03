package org.example;


import java.math.BigDecimal;

public class Exercicio2 {

    private BigDecimal valor;
    private boolean clienteVip;
    private boolean primeiraCompra;
    private boolean cupomDesconto;

    public Exercicio2(BigDecimal valor, boolean clienteVip, boolean primeiraCompra, boolean cupomDesconto) {
        this.valor = valor;
        this.clienteVip = clienteVip;
        this.primeiraCompra = primeiraCompra;
        this.cupomDesconto = cupomDesconto;
    }

    public BigDecimal calcularDesconto() {
        if (clienteVip) {
            return calcularDescontoVip();
        }
        return calcularDescontoRegular();
    }

    private BigDecimal calcularDescontoVip() {
        return primeiraCompra ? valor.multiply(BigDecimal.valueOf(0.20)) : valor.multiply(BigDecimal.valueOf(0.10));
    }

    private BigDecimal calcularDescontoRegular() {
        if (primeiraCompra) {
            return valor.multiply(BigDecimal.valueOf(0.05));
        } else if (cupomDesconto) {
            return valor.multiply(BigDecimal.valueOf(0.15));
        } else {
            return valor.multiply(BigDecimal.valueOf(0.02));
        }
    }
}