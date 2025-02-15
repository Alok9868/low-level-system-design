package org.example.solidprinciples.open_closed.with_oc;

public class Addition implements CalculatorOperation {
    private double result;

    @Override
    public void perform(int left, int right) {
        result = left + right;
        System.out.println(result);
    }
}