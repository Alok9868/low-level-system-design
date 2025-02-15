package org.example.designpatterns.creational.factory;

public class InstaNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Insta notification sent");
    }
}
