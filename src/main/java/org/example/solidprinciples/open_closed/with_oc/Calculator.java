package org.example.solidprinciples.open_closed.with_oc;

import java.security.InvalidParameterException;

public class Calculator {


    // here we are just calling the function of individual class ,
    // which have implemented the feature of calculating function

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }
}
