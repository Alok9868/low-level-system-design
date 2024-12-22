package org.example.solidprinciples.single_responsibility.with_srp;

// This class handles saving the invoice to the database
public class InvoiceDatabaseHandler {
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to the database...");
        // Code to save the invoice to a database
    }
}