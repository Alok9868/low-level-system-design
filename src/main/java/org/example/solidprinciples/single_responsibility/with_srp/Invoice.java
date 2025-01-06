package org.example.solidprinciples.single_responsibility.with_srp;

public class Invoice {


    // here we have separate class for separate work
    // here we are only doing work of invoice .

    private String invoiceNumber;
    private double amount;

    public Invoice(String invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

}
