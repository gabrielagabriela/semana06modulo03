package org.example;

import java.math.BigDecimal;

class CalculadoraDesconto {
    private Desconto desconto;

    public CalculadoraDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public BigDecimal calcularDesconto(BigDecimal valor) {
        return desconto.calcular(valor);
    }
}