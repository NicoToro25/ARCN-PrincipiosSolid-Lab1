package com.example.solid.lsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void gasCarRefuel() {
        FuelCar car = new FuelCar();
        assertDoesNotThrow(car::refuel);
    }

    @Test
    void electricCarCharge() {
        ElectricCar car = new ElectricCar();
        assertDoesNotThrow(car::charge);
    }
}
