package com.dh.model;

import java.math.*;

class Calculator {
    static String sum(String... numbers) {
        BigDecimal total = new BigDecimal(0);

        for (String number : numbers) {
            total = total.add(new BigDecimal(number));
        }

        return total.toString();
    }
}

