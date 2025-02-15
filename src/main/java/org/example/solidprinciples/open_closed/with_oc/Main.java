package org.example.solidprinciples.open_closed.with_oc;

public class Main {

    public static void main(String[] args) {

        CalculatorOperation additionOperation=new Addition();

        Calculator calculator=new Calculator(1,2);
        calculator.calculate(additionOperation);

        CalculatorOperation divisionOperation=new Division();
        calculator.calculate(divisionOperation);

    }

}
