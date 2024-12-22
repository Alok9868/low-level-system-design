package org.example.solidprinciples.open_closed.without_oc;

import lombok.Data;

@Data
public class Subtraction implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    // getters and setters
}