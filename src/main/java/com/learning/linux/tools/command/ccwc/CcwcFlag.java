package com.learning.linux.tools.command.ccwc;

import com.learning.linux.tools.command.CommandFlag;

public enum CcwcFlag implements CommandFlag {
    L("-l") {
        @Override
        public void printFlagType() {

        }
    },

    W("-w") {
        @Override
        public void printFlagType() {

        }
    },

    C("-c") {
        @Override
        public void printFlagType() {

        }
    };

    private String value;

    CcwcFlag(String value) {
        this.value = value;
    }
}
