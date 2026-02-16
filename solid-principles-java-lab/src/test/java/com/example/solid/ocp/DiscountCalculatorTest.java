package com.example.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @Test
    void shouldApplyRegularDiscount() {
        DiscountStrategy strategy = new RegularDiscount();
        DiscountCalculator calculator = new DiscountCalculator(strategy);

        double result = calculator.calculate(1000);

        assertEquals(100.0, result);
    }

    @Test
    void shouldApplyVipDiscount() {
        DiscountStrategy strategy = new VipDiscount();
        DiscountCalculator calculator = new DiscountCalculator(strategy);

        double result = calculator.calculate(1000);

        assertEquals(200.0, result);
    }
}
