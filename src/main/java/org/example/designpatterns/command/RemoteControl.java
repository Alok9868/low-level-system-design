package org.example.designpatterns.command;

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
