package org.example.solidprinciples.dependency_inversion.with_dip;

public class Main {

//   High-level modules should not depend on low-level modules. Both should depend on abstractions."
//   Abstractions should not depend on details. Details should depend on abstractions."

    public static void main(String[] args) {

        // here we are passing which db should we use , and it can be changed
        // making the system decoupled.
        Database database = new MySQLDatabase(); // Can be swapped with any other implementation
        OrderService orderService = new OrderService(database);
        orderService.saveOrder();
    }

}
