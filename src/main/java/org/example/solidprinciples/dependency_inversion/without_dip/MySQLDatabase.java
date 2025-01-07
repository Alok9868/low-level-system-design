package org.example.solidprinciples.dependency_inversion.without_dip;

class MySQLDatabase {
    public void saveOrder(String order) {
        System.out.println("Order saved in MySQL: " + order);
    }
}
