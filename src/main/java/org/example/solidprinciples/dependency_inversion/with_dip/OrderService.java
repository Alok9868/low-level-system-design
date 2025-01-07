package org.example.solidprinciples.dependency_inversion.with_dip;


// High-Level Module
class OrderService {

    //This is wrong as we have created tightly coupled system
    // in this case , if there is any change in db , we have to directly change the code here .


    private Database database;

    // Dependency Injection via Constructor
    public OrderService(Database database) {
        this.database = database;
    }

    public void saveOrder() {
        database.saveOrder();
    }


}