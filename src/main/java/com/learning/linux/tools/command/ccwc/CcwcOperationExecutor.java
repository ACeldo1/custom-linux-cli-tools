package com.learning.linux.tools.command.ccwc;

import com.learning.linux.tools.command.CommandOperationExecutorTemplate;

public class CcwcOperationExecutor implements CommandOperationExecutorTemplate {

    private CcwcCommandOperation commandOperation;

    public CcwcOperationExecutor(CcwcCommandOperation commandOperation) {
        this.commandOperation = commandOperation;
    }

    @Override
    public String executeOperation() {
        return commandOperation.execute();
    }
}
