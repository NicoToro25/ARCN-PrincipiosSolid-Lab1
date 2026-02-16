package com.example.solid.srp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceCalculatorTest {

    @Test
    void TotalWithTax() {

        Invoice invoice = new Invoice("Nicolas", 1000);
        InvoiceCalculator calculator = new InvoiceCalculator();

        double total = calculator.calculateTotal(invoice);

        assertEquals(1210.0, total);
    }
}
