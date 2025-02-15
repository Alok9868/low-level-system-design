package org.example.designpatterns.creational.factory;

public class EmailNotificationFactory implements NotificationFactory{

    @Override
    public Notification create() {
        return new EmailNotification();
    }
}
