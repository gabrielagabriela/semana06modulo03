package org.example;

import java.math.BigDecimal;

class DescontoPremium implements Desconto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.2));
    }
}