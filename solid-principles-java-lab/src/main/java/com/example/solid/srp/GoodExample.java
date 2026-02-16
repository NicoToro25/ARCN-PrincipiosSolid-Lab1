package com.example.solid.srp;

public class GoodExample {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("Nicolas", 1000);

        InvoiceCalculator calculator = new InvoiceCalculator();
        double total = calculator.calculateTotal(invoice);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice, total);

        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);
    }
}
