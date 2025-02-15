package org.example.designpatterns.structural.decorator;

public class Main {

//    The Decorator Pattern is a structural design pattern that allows behavior to be dynamically added to objects
//    without modifying their original code. It follows the principle of composition over inheritance by wrapping an
//    object inside another object (decorator) that enhances its functionality. In Java, this pattern is widely used in I/O streams,
// filters , authentication , logging .
//    where BufferedInputStream wraps FileInputStream to add buffering. The key advantage is flexibility, as multiple decorators can be
//    stacked to extend behavior dynamically. It promotes the Open/Closed Principle, allowing modifications without altering existing code,
//    making it ideal for extending functionalities in a scalable and maintainable way.

    public static void main(String[] args) {

        // this is normal coffee
        Coffee coffee=new PlainCoffee();
        coffee.getDescription();
        System.out.println(coffee.getCost());


        // now we will add milk
        CoffeeDecorator coffeeDecorator=new MilkDecorator(coffee);
        coffeeDecorator.getDescription();
        System.out.println(coffeeDecorator.getCost());


        // now we will add sugar to it
        CoffeeDecorator sugarDecorator=new SugarDecorator(coffeeDecorator);
        sugarDecorator.getDescription();
        System.out.println(sugarDecorator.getCost());








    }
}
