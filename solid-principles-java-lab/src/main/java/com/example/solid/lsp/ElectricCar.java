package com.example.solid.lsp;

public class ElectricCar implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Conduciendo carro eléctrico...");
    }

    public void charge() {
        System.out.println("Cargando...");
    }
}
