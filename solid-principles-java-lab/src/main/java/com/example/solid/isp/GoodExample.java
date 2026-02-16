package com.example.solid.isp;

public class GoodExample {

    public static void main(String[] args) {

        Workable developer = new Developer();
        developer.work();

        Manager manager = new Manager();
        manager.work();
        manager.eat();
    }
}
