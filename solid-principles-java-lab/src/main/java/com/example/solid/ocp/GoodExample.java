package com.example.solid.ocp;

public class GoodExample {

    public static void main(String[] args) {

        DiscountStrategy regular = new RegularDiscount();
        DiscountCalculator calculator = new DiscountCalculator(regular);

        double discount = calculator.calculate(1000);
        System.out.println("Descuento Regular: " + discount);

        DiscountStrategy vip = new VipDiscount();
        calculator = new DiscountCalculator(vip);

        discount = calculator.calculate(1000);
        System.out.println("Descuento VIP: " + discount);
    }
}
