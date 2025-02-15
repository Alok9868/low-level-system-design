package org.example.solidprinciples.open_closed.with_oc;

public class Division implements CalculatorOperation {

    private double result;

    // constructor, getters and setters
    @Override
    public void perform(int left, int right) {
        if (right != 0) {
            result = left / right;
            System.out.println(result);
        }
    }
}