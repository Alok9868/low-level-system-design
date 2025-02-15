package org.example.designpatterns.creational.factory;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sms notification sent");
    }
}
