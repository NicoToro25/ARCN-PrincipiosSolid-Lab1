package com.example.solid.isp;

public class GoodExample {

    public static void main(String[] args) {

        Workable developer = new Developer();
        Manager manager = new Manager();

        developer.work();
        manager.work();
        manager.eat();
    }
}
