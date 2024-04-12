package com.learning.linux.tools.command;

import com.learning.linux.tools.utility.FileUtility;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractCommand {

    LinuxCommand linuxCommand;
    Set<CommandFlag> flags;

    public AbstractCommand(LinuxCommand linuxCommand) {
        this.linuxCommand = linuxCommand;
        this.flags = new HashSet<>();
    }

    public LinuxCommand getLinuxCommand() {
        return linuxCommand;
    }

    public Set<CommandFlag> getFlags() {
        return flags;
    }

    public AbstractCommand setFlags(Set<CommandFlag> flags) {
        this.flags = flags;
        return this;
    }
}
