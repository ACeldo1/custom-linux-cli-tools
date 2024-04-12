package com.learning.linux.tools.command.ccwc;

import com.learning.linux.tools.command.CommandFlag;
import com.learning.linux.tools.command.CommandOperation;
import com.learning.linux.tools.utility.StringUtility;

import java.util.Set;

public class CcwcCommandOperation implements CommandOperation {

    private CcwcCommand command;

    public CcwcCommandOperation(CcwcCommand command) {
        this.command = command;
    }

    @Override
    public String execute() {
//        String[] fileText = getFileUtility().readFileAsStringArray(getFileDirectory());
        Integer byteCount = containsFlag(CcwcFlag.C);
        Integer charCount = containsFlag(CcwcFlag.W);
        Integer lineCount = containsFlag(CcwcFlag.L);

        Set<CommandFlag> flagSet = command.getFlags();
        for(String lineText: command.getInputText()) {
            if (flagSet.contains(CcwcFlag.C)) for (byte b: lineText.getBytes()) byteCount += b;
            if (flagSet.contains(CcwcFlag.W)) lineCount += 1;
            if (flagSet.contains(CcwcFlag.L)) charCount += lineText.length();
        }

        return StringUtility.removeNullsAndNegativesAsString(new Integer[]{byteCount, lineCount, charCount});
    }

    private Integer containsFlag(CcwcFlag flag) {
        return command.getFlags().contains(flag) ? 1 : null;
    }

    public CcwcCommand getCommand() {
        return command;
    }
}
