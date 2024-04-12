package com.learning.linux.tools.command;

public enum LinuxCommand {
    CCWC("ccwc");

    private String commandString;

    LinuxCommand(String commandString) {
        this.commandString = commandString;
    }

    public String getCommandString() {
        return commandString;
    }
}
