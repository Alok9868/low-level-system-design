package org.example.solidprinciples.single_responsibility.without_srp;

public class Invoice {

    // The Invoice class handles:
    // 1. Tax calculation
    // 2. Printing
    // 3. Database operations
    // These responsibilities are unrelated and make the class harder to maintain.

    private String invoiceNumber;
    private double amount;

    public Invoice(String invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    // Responsibility 1: Invoice calculation
    public double calculateTax() {
        return this.amount * 0.18; // Assuming 18% tax
    }

    // Responsibility 2: Invoice printing
    public void printInvoice() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + calculateTax());
    }

    // Responsibility 3: Invoice persistence
    public void saveToDatabase() {
        System.out.println("Saving invoice to the database...");
        // Code to save the invoice to a database
    }



}
