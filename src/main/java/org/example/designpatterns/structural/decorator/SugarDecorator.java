package org.example.designpatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void getDescription() {
        System.out.println("this is coffee with sugar");
    }

    @Override
    public Integer getCost() {
        return decoratedCoffee.getCost() + 3;
    }

}
