package com.example.solid.dip;

public class OrderProcessor {
    private DataBase dataBase;

    public OrderProcessor(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void processOrder() {
        System.out.println("Procesando pedido...");
        dataBase.saveOrder();
    }
}
