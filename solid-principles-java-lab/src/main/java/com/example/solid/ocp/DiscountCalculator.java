package com.example.solid.ocp;
public class DiscountCalculator {

    private DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double price) {
        return strategy.applyDiscount(price);
    }
}
