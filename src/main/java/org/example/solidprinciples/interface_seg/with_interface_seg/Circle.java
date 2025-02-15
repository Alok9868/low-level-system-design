package org.example.solidprinciples.interface_seg.with_interface_seg;

public class Circle implements AreaInterface {

    // Here we have Area interface which have only area
    // so we can only forcing circle to implement this interface only

//    "Clients should not be forced to depend on interfaces they do not use."
//    A large interface should be broken down into smaller, more specific interfaces.
//    Each interface should serve a distinct purpose and should not contain unrelated methods.
//    This prevents classes from implementing unnecessary methods they don't need.

    // just segregate the interfaces is interface segregation principle

    @Override
    public void calcArea() {

    }

}
