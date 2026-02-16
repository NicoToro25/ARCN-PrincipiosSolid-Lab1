package com.example.solid.lsp;

public class FuelCar implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Conduciendo carro de combustible...");
    }

    public void refuel() {
        System.out.println("Repostando...");
    }
}
