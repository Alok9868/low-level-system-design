package org.example.designpatterns.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {

        System.out.println("Email notification sent");
    }
}
