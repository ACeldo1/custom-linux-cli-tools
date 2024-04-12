package com.learning.linux.tools;

import com.learning.linux.tools.command.CommandOperation;
import com.learning.linux.tools.command.CommandOperationExecutorTemplate;
import com.learning.linux.tools.command.LinuxCommand;
import com.learning.linux.tools.factory.ArgumentParserFactory;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CommandOperation command = getCompleteCommand(args);
        CommandOperationExecutorTemplate commandOperationExecutor;

        switch () {
            case LinuxCommand.CCWC -> command.execute();
            default -> System.out.println("Not a valid command!");
        }
    }

    private static CommandOperation getCompleteCommand(String[] args) {
        ArgumentParserFactory parser = new ArgumentParserFactory(args);
        return parser;
    }
}
