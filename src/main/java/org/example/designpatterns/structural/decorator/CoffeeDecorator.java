package org.example.designpatterns.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public void getDescription() {
        decoratedCoffee.getDescription();
    }

    @Override
    public Integer getCost() {
        return decoratedCoffee.getCost();
    }
}
