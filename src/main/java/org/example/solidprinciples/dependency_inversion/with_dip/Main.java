package org.example.solidprinciples.dependency_inversion.with_dip;

public class Main {

    // here we are passing which db should we use , and it can be changed
    // making the system decoupled.

    public static void main(String[] args) {
        Database database = new MySQLDatabase(); // Can be swapped with any other implementation
        OrderService orderService = new OrderService(database);
        orderService.saveOrder();
    }

}
