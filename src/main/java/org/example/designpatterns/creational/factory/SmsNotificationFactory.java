package org.example.designpatterns.creational.factory;

public class SmsNotificationFactory implements NotificationFactory{

    @Override
    public Notification create() {
        return new SmsNotification();
    }
}
