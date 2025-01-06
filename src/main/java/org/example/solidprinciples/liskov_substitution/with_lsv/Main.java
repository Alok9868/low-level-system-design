package org.example.solidprinciples.liskov_substitution.with_lsv;


public class Main {


    public static void main(String[] args) {

        Shape rectangle = new Rectangle(1, 2);
        System.out.println("area of rectangle is " + rectangle.findArea());

        Shape square = new Square(1, 1);
        System.out.println("area of square is " + square.findArea());

    }


}
