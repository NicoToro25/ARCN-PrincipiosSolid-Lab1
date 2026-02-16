package com.example.solid.lsp;

public class GoodExample {

    public static void main(String[] args) {

        Vehicle fuelCar = new FuelCar();
        fuelCar.drive();

        Vehicle electricCar = new ElectricCar();
        electricCar.drive();
    }
}
