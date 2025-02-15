package org.example.designpatterns.behavioural.command;

public class RemoteControl {

    private Command command;

    // Set the command at runtime
    public void setCommand(Command command) {
        this.command = command;
    }

    // Executes the command
    public void pressButton() {
        command.execute();
    }
}
