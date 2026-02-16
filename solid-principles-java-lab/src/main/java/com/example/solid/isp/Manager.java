package com.example.solid.isp;

public class Manager implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Gestionando equipo...");
    }

    @Override
    public void eat() {
        System.out.println("Comiendo en horario establecido...");
    }
}
