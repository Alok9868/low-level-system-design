package org.example.solidprinciples.dependency_inversion.with_dip;



// Low-Level Module
class MySQLDatabase implements Database{

    // Here we have implemented the interface functions , so that
    // the system is decoupled , any service will create the object of Database interface
    // and will use that instead of concrete class.


    @Override
    public void createConnection() {

    }

    @Override
    public void saveOrder() {
        System.out.println("Order saved in MySQL: ");
    }
}
