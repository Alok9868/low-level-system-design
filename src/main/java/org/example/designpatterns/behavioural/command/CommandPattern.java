package org.example.designpatterns.behavioural.command;

public class CommandPattern {

    public static void main(String[] args) {

        //The Command Design Pattern in Java is a behavioral design pattern that turns a request into a stand-alone object containing all the information about the request,
        // such as the method to call and the method's arguments. This pattern is useful for implementing callbacks, undo functionality, or queuing operations.

        // first user install the light
        Light livingRoomLight = new Light();


        // then user creates the command to on or off
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);


        // Invoker
        // create object of remote and give him the commands
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }


}
