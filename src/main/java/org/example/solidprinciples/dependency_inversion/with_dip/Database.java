package org.example.solidprinciples.dependency_inversion.with_dip;


// Abstraction
public interface Database {

    public void createConnection();
    public void saveOrder();

}
