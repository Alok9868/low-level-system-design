package org.example.solidprinciples.single_responsibility.with_srp;

// This class handles invoice printing
public class InvoicePrinter {
    public void print(Invoice invoice, double tax) {
        System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Tax: " + tax);
    }
}