package com.learning.linux.tools.command.ccwc;

import com.learning.linux.tools.command.AbstractCommand;
import com.learning.linux.tools.command.CommandFlag;
import com.learning.linux.tools.command.LinuxCommand;
import com.learning.linux.tools.utility.FileUtility;

import java.io.File;
import java.util.Set;

public class CcwcCommand extends AbstractCommand {

    private FileUtility fileUtility;
    private String[] inputText;

    public CcwcCommand(LinuxCommand linuxCommand, FileUtility fileUtility) {
        super(linuxCommand);
        this.fileUtility = fileUtility;
    }

    public CcwcCommand(LinuxCommand linuxCommand, String[] inputText) {
        super(linuxCommand);
        this.inputText = inputText;
    }

    public FileUtility getFileUtility() {
        return fileUtility;
    }

    public String[] getInputText() {
        return inputText;
    }
}
