package com.example.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {

    @Test
    void shouldProcessOrderWithoutConcreteDatabase() {

        Database fakeDatabase = new Database() {
            @Override
            public void saveOrder() {
            }
        };

        OrderProcessor processor = new OrderProcessor(fakeDatabase);

        assertDoesNotThrow(processor::processOrder);
    }
}
