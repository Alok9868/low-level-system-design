package org.example.designpatterns.creational.factory;

public class InstaNotificationFactory implements NotificationFactory{

    @Override
    public Notification create() {
        return new InstaNotification();
    }
}
