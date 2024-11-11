package org.example;

import java.math.BigDecimal;

class DescontoRegular implements Desconto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.1));
    }
}