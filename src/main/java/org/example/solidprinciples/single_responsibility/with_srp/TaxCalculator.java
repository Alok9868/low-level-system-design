package org.example.solidprinciples.single_responsibility.with_srp;

// This class is responsible for tax calculations
public class TaxCalculator {
    public double calculateTax(Invoice invoice) {
        return invoice.getAmount() * 0.18; // Assuming 18% tax
    }
}