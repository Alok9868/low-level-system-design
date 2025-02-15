package org.example.solidprinciples.dependency_inversion.with_dip;


// High-Level Module
class OrderService {

    private Database database;

    // Dependency Injection via Constructor
    public OrderService(Database database) {
        this.database = database;
    }

    public void saveOrder() {
        database.saveOrder();
    }

}