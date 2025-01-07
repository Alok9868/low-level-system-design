package org.example.solidprinciples.dependency_inversion.without_dip;

class OrderService {

    //This is wrong as we have created tightly coupled system
    // in this case , if there is any change in db , we have to directly change the code here .


    private MySQLDatabase database;

    public OrderService() {
        this.database = new MySQLDatabase();
    }

    public void placeOrder(String order) {
        database.saveOrder(order);
    }
}