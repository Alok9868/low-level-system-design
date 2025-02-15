package org.example.designpatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void getDescription() {
        System.out.println("This is coffee with milk");
    }

    @Override
    public Integer getCost() {
        return decoratedCoffee.getCost() +2;
    }
}
