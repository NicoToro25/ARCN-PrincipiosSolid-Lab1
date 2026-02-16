package com.example.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {

    @Test
    void shouldProcessOrderWithoutConcreteDatabase() {

        DataBase fakeDatabase = new DataBase() {
            @Override
            public void saveOrder() {
            }
        };

        OrderProcessor processor = new OrderProcessor(fakeDatabase);

        assertDoesNotThrow(processor::processOrder);
    }
}
