package com.example.solid.dip;

public class GoodExample {

    public static void main(String[] args) {

        DataBase database = new MySQLDataBase();
        OrderProcessor processor = new OrderProcessor(database);

        processor.processOrder();
    }
}
