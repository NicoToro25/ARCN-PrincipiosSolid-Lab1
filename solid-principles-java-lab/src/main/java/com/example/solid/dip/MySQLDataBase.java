package com.example.solid.dip;

public class MySQLDataBase implements DataBase {
    @Override
    public void saveOrder() {
        System.out.println("Guardando pedido en MySQL...");
    }
}
