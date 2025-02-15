package org.example.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {

//        The Factory Pattern is a creational design pattern that centralizes object creation,
//        promoting loose coupling and scalability. It hides object instantiation details,
//                making code easier to maintain.

        // first get notification factory of email , and then create the object
        // and then use that object to notify user

        NotificationFactory notificationFactory=new EmailNotificationFactory();
        Notification notification=notificationFactory.create();
        notification.notifyUser();

        notificationFactory=new SmsNotificationFactory();
        notification=notificationFactory.create();
        notification.notifyUser();


        notificationFactory=new InstaNotificationFactory();
        notification=notificationFactory.create();
        notification.notifyUser();







    }
}
