package org.example.designpatterns.structural.decorator;

public class PlainCoffee implements Coffee {
    @Override
    public Integer getCost() {
        return 10;
    }

    @Override
    public void getDescription() {
        System.out.println("this is plain coffee");
    }
}
